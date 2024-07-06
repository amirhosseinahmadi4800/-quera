import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dayre = new Scanner(System.in);
        int number = dayre.nextInt();
        int number1 = dayre.nextInt();
        int Game_turn = 1,sum=1;
        if (number == 1 ){
            System.out.print("1");
        }
       else if(number==number1){
            System.out.print("1");
        }
        //https://t.me/chillamirx
        else {
            sum = sum + number1;

           do{
                sum = sum + number1;
                if (sum == 1){
                    break;
                }
                if ( sum > number){
                    sum = sum - number;
                }
               Game_turn++;
            } while (sum != 1);
            System.out.print(Game_turn);
        }
    }
}
//https://t.me/chillamirx