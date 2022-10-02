import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Task1
        Printable printable = () -> System.out.println("Printed text");
        printable.print();

        //Task2
        Predicate<String> predicate1 = s -> {
            return s.trim().isEmpty();
        };

        System.out.println("Task 2: Entered string is empty?" + predicate1.test(" "));

        //Task 3
        Predicate<String> firstCharCheck = s -> {
                char firstChar =  s.toLowerCase().charAt(0);
                return (firstChar == 'n'| firstChar == 'j');
        };

        Predicate<String> lastCharCheck = s ->
        {
                char lastChar = s.toLowerCase().charAt(s.length() - 1);
                return (lastChar == 'a');
        };
        System.out.println("Task 3: Does the entered word start with 'N' or 'J' AND end with 'A'? " + firstCharCheck.and(lastCharCheck).test("Jona"));

        //Task 4
        Function<Integer, String> numberType = x ->  {
            if (x>0)
                return "Positive number";
            else if (x<0)
                    return "Negative number";
            else return "Null";
        };
        System.out.println("Task 4: " + numberType.apply(12));

        //Task 5
        IntSupplier randomNumber = () -> (int) (Math.random()*10);
        System.out.println("Task 5: " + randomNumber.getAsInt());

        //Task 6
        String s = "Task6: printed text";
        Printable printable2 = Main::print2;
        printable2.print();
    }

    public static void print2() {
        System.out.println("Task6: printed text");
    }
}