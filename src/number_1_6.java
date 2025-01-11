import java.util.Scanner;
public class number_1_6 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = sc.nextLine();


        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "");


        cleanedString = cleanedString.toLowerCase();


        if (plndr(cleanedString)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }


    }


    private static boolean plndr(String str) {
        int left = 0;
        int r = str.length() - 1;


        while (left < r) {
            if (str.charAt(left) != str.charAt(r)) {
                return false;
            }
            left++;
            r--;
        }

        return true;
    }
}
