import java.util.Scanner;
public class number_1_1 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  число n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Число отрицательное");
            n = n * -1;
        } else if (n > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("Числа от -n до n :");
        for (int i = -n; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("Числа от -n до n :");
        int i = -n;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }


    }
}
