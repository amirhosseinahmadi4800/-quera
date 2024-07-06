import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vorodi = new Scanner(System.in);
        String [] asm_film = new String[10];
        int number = vorodi.nextInt();//گرفتن تعداد اسم ها
        vorodi.nextLine();
        for(int i = 0 ; i<number ; i++){
            asm_film[i] = vorodi.nextLine();//گرفتن اسم فیلم ها
        }
        for(int i =0 ; i<number ; i++ ){
            String sum= new String() ;
            String [] klme_asli = asm_film[i].split(" ");//برای جدا کردن کلماتی که بینشون فاصله سهت و در ارایه قرار میدهد
            for(int j = 0; j < klme_asli.length; j++)//حلقه به اندازه تعداد کلمات جدا شده
            {
                String Avlin_Herf = klme_asli[j].substring(0, 1);//حرف اول کلمه را جدا میکند و در متغییر قرار میدهد
                String begye_herfha = klme_asli[j].substring(1);//بقیه ی حرف کلمه را در متغیر دیگر قرار میدهد
                String kol_kelme = Avlin_Herf.toUpperCase()+ begye_herfha.toLowerCase();//حرف اول کلمه را به حروف بزرگ و بقیه حرف های کلمه را به کوچیک تبدیل میکند و بهم وصلشون میکنه
                klme_asli[j] = kol_kelme;//وقتی حرف هارو بهم وصل کردیک تو ارایه ی خودش قرارشون میدیم
            }
            for(int a =0 ; a<klme_asli.length ; a++){
                sum+=klme_asli[a]+" ";//کلماتی که جدا کرده بودیم را بهم وصل میکنیم
            }
            System.out.println( sum);
        }
    }
}
