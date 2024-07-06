//https://t.me/chillamirx
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lozy = new Scanner(System.in);
        int i,j,a=2,s=0,z=0;
        int n = lozy.nextInt();

            for(i=0;i<(n+1)/2;++i)
            {
                for(j=0;j<((n/2)-i);++j)
                    System.out.print(" ");
                for(j=0;j<2*i+1;++j)
                    System.out.print("*");
                for(j=0;j<2*((n/2)-s);j++)
                    System.out.print(" ");
                s++;
                for(j=0;j<2*i+1;++j)
                    System.out.print("*");
                System.out.println();
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<i+1;j++)
                    System.out.print(" ");
                for(j=0;j<2*((n/2)-i)-1;++j)
                    System.out.print("*");
                for(j=0;j<i+a;j++)

                    System.out.print(" ");
                a++;

                for(j=0;j<2*((n/2)-i)-1;++j)
                    System.out.print("*");
                if(a==n-z){
                    break;
                }
                z++;
                System.out.println();
            }
//https://t.me/chillamirx
    }
}