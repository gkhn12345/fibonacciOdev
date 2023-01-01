import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fib1 = 0, fib2 = 1, next;

        System.out.print("Fibonacci serisini giriniz: ");
        int number = input.nextInt();

        System.out.print(fib1 + " " + fib2);

        for (int i = 1; i < number; i++) {
            next = fib1 + fib2;
            System.out.print(" " + next);
            fib1 = fib2;
            fib1 = next;
        }
    }
}
