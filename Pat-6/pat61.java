import java.io.*;
import java.util.*;

class ReadWriter{
    public static void main(String[] args){
        readandwrite();
        writeandread();
    }
    public static void readandwrite(){
        try(PrintWriter writer = new PrintWriter("prices.txt")){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i = 0 ; i < n ; i++){
                double a = sc.nextDouble();
                writer.println(a);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void writeandread(){
        try(Scanner sc = new Scanner(new File("prices.txt"))){
            PrintWriter writer = new PrintWriter("tax.txt");
            
            while(sc.hasNextDouble()){
                double op = sc.nextDouble();
                double tp = op*1.10;
                writer.printf("%.2f\n",tp);
                System.out.printf("%.2f\n",tp);

            }


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}