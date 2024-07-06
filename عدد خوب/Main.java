//https://t.me/chillamirx
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner amir = new Scanner(System.in);
        int number = amir.nextInt();
        int  sum1 , adad_khob = 1;
        boolean check = false;
        int sum=0;
        for (int i = 1 ; i <= 1000000; i +=adad_khob ) {
            sum1=0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    sum1++;
                }
                if (sum1 == number) {
                   sum=i;
                    check = true ;
                   break;
                }
            }
            if (check){
                break;
            }
            adad_khob++;
        }
        System.out.print(sum);
    }
}
//https://t.me/chillamirx