import java.util.Scanner;

public class number_1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        do {

            System.out.println("Меню:");
            System.out.println("1. Вывести 'Hello'");
            System.out.println("2. Вывести 'World'");
            System.out.println("3. Вывести 'Hello World'");
            System.out.println("4. Выход");


            System.out.print("Введите номер пункта (1-4): ");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("World");
                    break;
                case 3:
                    System.out.println("Hello World");
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор попробуйте снова.");
                    break;
            }
        } while (x != 4);


    }
}
