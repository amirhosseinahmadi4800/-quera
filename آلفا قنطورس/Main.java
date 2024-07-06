import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vorodi = new Scanner(System.in);

        int mabna, sum =0 , number;
        String javab = new String();

        number = vorodi.nextInt();
        mabna = vorodi.nextInt();
        while (number != 0) {
            sum = number % mabna;
            number = number / mabna;
                if(sum == 10){
                    javab = javab.concat("A");
                }
                else if(sum == 11){
                    javab = javab.concat("B");
                }
                else if(sum == 12){
                    javab = javab.concat("C");
                }
                else if(sum == 13){
                    javab = javab.concat("D");
                }
                else if(sum == 14){
                    javab = javab.concat("E");
                }
               else if(sum == 15){
                    javab = javab.concat("F");
                }
            else{
                String d = String.valueOf(sum);
                    javab = javab.concat(d);
            }
        }
        StringBuilder javab1 = new StringBuilder(javab);
        javab1.reverse();
        System.out.println(javab1);
    }
}
