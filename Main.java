import java.net.InetAddress;
public class Main{

    public static void main(String[] args){

        FindAddress();

    }

    public static void FindAddress(){


        try { 

        InetAddress inter = InetAddress.getLocalHost();
        String str = inter.getHostAddress();        
        boolean checkIfExist = inter.isAnyLocalAddress();

        String ShowName = inter.getHostName();


        System.out.println("HostName: " + ShowName);
        System.out.println("Is IP Address local: " + checkIfExist);
        System.out.println("Your Ip Address is: " +str);


        
        }

            catch(Exception e ){

                System.out.println("Nao foi possivel obter o endereço de IP");
            }
    }








}