//********** 80% ************
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vorodi = new Scanner(System.in);
        int n = vorodi.nextInt();
        int [] arr = new int [n];
        int Andis_Max=0,Max=0,mini,Andis_Mini=0,sum1=0,sum2=0 , sum3=0 , sum4=0, sum_mosavi=0 , mosavi;
        for (int i = 0 ; i<n ; i++){
          arr[i]= vorodi.nextInt();
        }
        mini=arr[0];
        mosavi=arr[0];
        for (int i = 0 ; i < n ; i++){

            if (arr[i] > Max) {
                Max = arr[i];
                Andis_Max = i;
            }
            if(arr[i]<mini){
             mini=arr[i];
             Andis_Mini=i;
            }
        }
        for(int i =0 ; i<n ; i++){
            if (arr[i]==mosavi){
                sum_mosavi++;
            }
        }
        if(sum_mosavi==n){
            System.out.println("Yes");
            System.exit(0);
        }
        for (int i = 0 ; i < Andis_Max ; i++){
            if(arr[i]<arr[i+1]){
               sum1 ++;
            }
        }
        if(sum1==Andis_Max && Andis_Max!=0 ){
            for(int i = Andis_Max  ; i < n-1; i++){
                if(arr[i]> arr[i+1]){
                    sum2++;
                }
            }
            if(sum2==n-Andis_Max-1 ){
              System.out.println("Yes");
              System.exit(0);
            }
            else{
                System.out.println("No");
                System.exit(0);
            }
        }
        for (int i = 0 ; i < Andis_Mini ; i++){
            if(arr[i]> arr[i+1]){
                sum3 ++;
            }
        }
        if(sum3==Andis_Mini){
            for(int i = Andis_Mini  ; i < n-1; i++){
                if(arr[i]<arr[i+1]){
                    sum4++;
                }
            }
            if(sum4==n-Andis_Mini-1 || Andis_Mini==n-1 ){
                System.out.println("Yes");
                System.exit(0);
            }
            else{
                System.out.println("No");

                System.exit(0);
            }
        }
        System.out.println("No");

    }
}
