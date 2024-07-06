import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        java.util.Scanner vorodi = new Scanner(System.in);
        int number = vorodi.nextInt();
        for (int j = 0; j < number; j++)
        {
            for (int i = 0; i <= j; i++) {
                System.out.print(FunctionMosls(j, i) + " ");
            }
            System.out.println();
        }
    }
    static int FunctionMosls(int n, int a)
    {
        int sum = 1;
        if (a > n - a){
            a = n - a;
        }
        for (int i = 0; i < a; ++i)
        {
            sum *= (n - i);
            sum /= (i + 1);
        }
        return sum;
    }
}

