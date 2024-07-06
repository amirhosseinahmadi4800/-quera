//https://t.me/chillamirx
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner adad = new Scanner(System.in);
        int sum=0 , sum1=0 , sum2=0 , sum3=0;
        int number1 = adad.nextInt();
        int number2 = adad.nextInt();
        int number3 = adad.nextInt();
        if(number1>number2 && number1>number3){
            sum=number2*number2;
            sum1=number3*number3;
            sum2=sum + sum1;
            sum3=number1*number1;
            if(sum2==sum3){
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
        if(number2>number1 && number2>number3){
            sum=number1*number1;
            sum1=number3*number3;
            sum2=sum + sum1;
            sum3=number2*number2;

            if(sum2==sum3){
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
        if(number3>number1 && number3>number2){
            sum=number2*number2;
            sum1=number1*number1;
            sum2=sum + sum1;
            sum3=number3*number3;

            if(sum2==sum3){
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }

    }
}
//https://t.me/chillamirx