//https://t.me/chillamirx
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tekrar = new Scanner(System.in);
        int sum_c =1 , sum_o=2 , sum_d=3 , sum_e=4, sum_u=6 ,sum_p=7 , sum_6=8;
        int number = tekrar.nextInt();
        for(int i =0 ; i <= number ; i++){
            if(number==sum_c){
                System.out.print("c");
                System.exit(0);
            }
            else{
                sum_c=sum_c+4;
            }
        }
        //https://t.me/chillamirx
        for(int i=0 ; i<=number ; i++){
            if(number==sum_6){
                System.out.print("6");
                System.exit(0);
            }
            else if(number==sum_p){
                System.out.print("p");
                System.exit(0);
            }
            else if(number==sum_d){
                System.out.print("d");
                System.exit(0);
            }
            else if (number==sum_e){
                System.out.print("e");
                System.exit(0);
            }
            else if(number==sum_o){
                System.out.print("o");
                System.exit(0);
            }
            else if(number==sum_u){
                System.out.print("u");
                System.exit(0);
            }
            else{
                sum_6+=8;
                sum_p+=8;
                sum_d+=8;
                sum_e+=8;
                sum_o+=8;
                sum_u+=8;
            }
        }
    }
}
//https://t.me/chillamirx