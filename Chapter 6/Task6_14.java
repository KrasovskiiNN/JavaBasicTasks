import java.util.Scanner;

public class Task6_14
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();
                int y = input.nextInt();

                if (x * y > 0) System.out.println("Дробь положительная");
                if (x * y < 0) System.out.println("Дробь отрицательная");

                input.close();
            }
    }