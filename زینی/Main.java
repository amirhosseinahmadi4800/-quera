import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vorodi = new Scanner(System.in);
        int sum=0;
        int n = vorodi.nextInt();
        int m = vorodi.nextInt();

        int [][] arr = new int [n][m];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j]=vorodi.nextInt();
            }
        }
        for(int i = 1 ; i< n-1 ; i++){
            for(int j = 1 ; j < m-1 ; j++){
               if((arr[i][j] < arr[i - 1][j] && arr[i][j] < arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) ||
                       (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i][j + 1])){
                   sum++;
               }
            }
        }
        System.out.println(sum);
    }
}
