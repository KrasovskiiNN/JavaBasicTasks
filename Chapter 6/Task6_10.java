import java.util.Scanner;

public class Task6_10
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();

                int a = x/10;
                int b = x%10;

                if (x > a*b) System.out.println("Число больше");
                if (x < a*b) System.out.println("Произведение больше");

                input.close();
            }
    }