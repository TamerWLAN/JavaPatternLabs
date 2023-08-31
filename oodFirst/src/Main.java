import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String FIO = scanner.nextLine();
        final int age = scanner.nextInt();

        final var x = new ManyToSingle(new ManyLinesReal(FIO, age));
        final var y = new SingleLinesReal(FIO, age);

        x.getInitialsAndAge();

        y.getInitialsAndAge();
    }
}