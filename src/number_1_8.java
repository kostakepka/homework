import java.util.Scanner;
public class number_1_8 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Введите строку: ");
        String input = sc.nextLine();


        if (input.length() > 15) {
            input = input.substring(0, 15) + "...";
        }


        input = input.toUpperCase();


        input = input.replace('.', ',');

        System.out.println("Результат: " + input);


    }
}

