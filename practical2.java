import java.util.Scanner;

public class practical2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First  Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number:");
        int c = sc.nextInt();

        if (a > b && a > c) {

            System.out.println("THE First Number is Largerst:" + a);

        }
        if (b > a && b > c) {

            System.out.println("THE Second Number is Largerst:" + b);

        }

        else {
            System.out.println("The Third Number is Largest:" + c);
        }
    }
}
