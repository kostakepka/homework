//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Person person;
        person = new Person("Ваня", 26);
        System.out.println(person);
        person.increaseAge();
        System.out.println(person);

        Shape[] shapes = new Shape[]{
                new Rectangle(15, 9.5),
                new Rectangle(96, 8),
                new Circle(8),
                new Circle(6.3),

        };

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());

        }
        recur rec = new recur();

        System.out.println(rec.fibonacci(1));
        System.out.println(rec.fibonacci(6));


        System.out.println(rec.factorial(6));
        System.out.println(rec.factorial(15));
    }
    }

