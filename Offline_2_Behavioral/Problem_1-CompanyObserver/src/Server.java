import java.io.*;
import java.net.*;
import java.util.*;

public class Server implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private static DataServer abc;
    private static DataServer def;
    private int state;
    //private static List<stock>stock_list;

    public Server(Socket socket){
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(),true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        try {
            abc = new DataServer();
            def = new DataServer();
            def.setBackup(abc);
            abc.setBackup(def);
            ServerSocket ss = new ServerSocket(6969);

            new Thread(()->{try{observerConsole();}catch(Exception ignored){;}}).start();
            while (true){
                Socket sock = ss.accept();
                System.out.println("connected.");
                new Thread(new Server(sock)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void observerConsole() throws IOException {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Change state to:");
            String cmd = sc.nextLine();
            try{
                modifyState(cmd);
            }
            catch (Exception ignored){
                ;
            }
        }
    }

    @Override
    public void run() {
            try{
                out.println("Premium(1) or Regular(2)?");
                String s = in.readLine();
                iObserver o;
                if(s.equalsIgnoreCase("1")){
                    o = new PremiumUser(in, out);
                    out.println("Hello Premium User");
                }
                else{
                    o = new RegularUser(in, out);
                    out.println("Hello Regular User");
                }
                o.setServer(this);
                abc.register(o);

                while(true){
                    out.println("Insert data? (type down data, type Q to quit data input prompt)");
                    String h = in.readLine();
                    if(h.equalsIgnoreCase("Q")){
                        break;
                    }
                    else{
                        abc.addData(o,h);
                    }
                }
            }
            catch(Exception e){
                System.out.println("oh no");
            }
    }


    public static void modifyState(String data) throws IOException {
        try {
            if (data.equalsIgnoreCase("1")) {
                abc.setState(1);
            } else if (data.equalsIgnoreCase("2")) {
                abc.setState(2);
            } else if (data.equalsIgnoreCase("3")) {
                abc.setState(3);
            }
        }
        catch(Exception ignored){
            ;
        }
    }

    public PrintWriter getOut() {
        return out;
    }

    public BufferedReader getIn() {
        return in;
    }
}
