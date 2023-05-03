import java.io.*;
import java.net.*;
import java.util.*;

public class Server implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private static Forcastor abc;
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
            abc = new Forcastor();
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
        Weather currentWeather = new Weather(20,"rainy", false, false);

        while(true){
            System.out.println("Update Weather? (YES) Alert for ");
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
            iObserver o = new User();
            o.setServer(this);
            out.println("Hello");
            Boolean registered = false;
            while(true){
                if(!registered){
                    out.println("Subscribe?");
                    String s = in.readLine();
                    if(!s.equalsIgnoreCase(null)){
                        registered = true;
                        abc.register(o);
                    }
                }
                else{
                    out.println("Unsubscribe?");
                    String s = in.readLine();
                    if(!s.equalsIgnoreCase(null)){
                        registered = false;
                        abc.unregister(o);
                    }

                }
            }
        }
        catch(Exception e){
            System.out.println("oh no");
        }
    }


    public static void modifyState(String data) throws IOException {
        try {
            abc.setState(data);
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
