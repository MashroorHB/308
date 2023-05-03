import java.io.*;
import java.net.*;
import java.util.*;


public class Client {

    private static Socket socket;
    private static BufferedReader in;
    private static PrintWriter out;
    private static Scanner input;

    public static void main(String[] args) {
        try {
            socket = new Socket("localhost",6969);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(),true);
            input = new Scanner(System.in);

        } catch (Exception e) {
            e.printStackTrace();
        }



        Thread t = new Thread(()->receive());t.start();
        while(true) {
            String s = input.nextLine();
            out.println(s);

            if (s.equals("quit")){
                break;
            }

        }

    }

    private static void receive() {
        while(true){
            try {
                String s = in.readLine();
                System.out.println(s);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }
}
