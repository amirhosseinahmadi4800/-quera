import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner codcup = new Scanner(System.in);
        int sum=0;
        int a1 = codcup.nextInt();
        int b1 = codcup.nextInt();
        int a2 = codcup.nextInt();
        int b2 = codcup.nextInt();
        int a3 = codcup.nextInt();
        int b3 = codcup.nextInt();
        if(a1>b1 || a1 == b1) {
            sum = b1 + sum;
        }
        else
        {
            sum = a1 + sum;
        }

        if(a2>b2 ||a2== b2){
            sum=b2+sum;
        }
        else{
            sum=a2+sum;
        }

        if(a3>b3 || a3==b3){
            sum=b3+sum;
        }
        else{
            sum=a3+sum;
        }
        System.out.print(sum);
    }
}
