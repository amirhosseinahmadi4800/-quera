import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pichide1 = new Scanner(System.in);
        int a = pichide1.nextInt();
        int x = pichide1.nextInt();
        int n = pichide1.nextInt();
        int sum1=0, sum2=1,sum3=1,sum4=1,sum8=0, k;
        double sum5 = 0,sum6=0 ,sum7=0,sum9=0;
        for( k=0 ; k<=n ; k++){
            if(n==k) {
                sum1=1;
            }

            else if(n-k==1){
                    sum1=n;
                }
            else if (k==0){
                sum1=1;
            }
                else if(k==1){
                    sum1=n;
                }
                //https://t.me/chillamirx
               else {
                    for(int i =1 ; i<=n ; i++) {
                        sum2 = sum2 * i;
                    }

                    for(int i=1 ; i<=k  ; i++){
                        sum3 = sum3 * i;

                    }
                    for (int i =1 ; i<=n-k ; i++){
                        sum4 = sum4 * i;
                    }
                    sum8=sum3*sum4;
                    sum1=sum2/sum8;
                    sum2=1;
                    sum3=1;
                    sum4=1;
                }


            sum5 =Math.pow(x, k);
            sum6 =Math.pow(a , n-k );
            sum7 = sum1 * sum5 * sum6;
            sum9+=sum7;
           
        }
        System.out.print((int)sum9);
    }
}
//https://t.me/chillamirx
