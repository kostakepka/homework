import java.util.Scanner;
public class number_1_5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите строку: ");
        String input = scanner.nextLine();


        int vowelCount = 0;
        int consonantCount = 0;





        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (Character.isLetter(ch)) {

                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }


        System.out.println("Гласных букв: " + vowelCount);
        System.out.println("Согласных букв: " + consonantCount);
    }
}

