import java.net.InetAddress;

public class Main{

    public static void main(String[] args){

        FindAddress();

    }

    public static void FindAddress(){


        try { 
        InetAddress inter = InetAddress.getLocalHost();

        String str = inter.getHostAddress();

        System.out.println("Your Ip Address is: " +str);
        }
            catch(Exception e ){

                System.out.println("Nao foi possivel obter o endereço de IP");
            }
    }








}