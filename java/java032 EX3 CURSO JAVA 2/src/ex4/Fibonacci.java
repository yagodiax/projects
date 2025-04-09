package ex4;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, c, i = 3;

        System.out.print(a + " " + b + " ");

        do {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        } while (i <= 10);

        System.out.println();
    }
}
