import java.util.Scanner;
public class number_1_4 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Введите целое число: ");
            int n = sc.nextInt();


            n = Math.abs(n);

            int x = 0;


            while (n > 0) {
                x += n % 10;
                n /= 10;
            }


            System.out.println("Сумма цифр числа: " + x);


        }
    }

