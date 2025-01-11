public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public String add(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        int sumInt = calculator.add(5, 10);
        System.out.println("Сумма целых чисел: " + sumInt);


        double sumDouble = calculator.add(5.5, 10.5);
        System.out.println("Сумма чисел с плавающей точкой: " + sumDouble);


        String concatenatedStrings = calculator.add("Hello", "World");
        System.out.println("Соединенные строки: " + concatenatedStrings);
    }
}
