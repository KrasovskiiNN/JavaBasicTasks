import java.util.Scanner;

public class Task6_11
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();
                int y = input.nextInt();

                if (x * y > 0) System.out.println("Один и тот же знак");
                if (x * y < 0) System.out.println("Разные знаки");
                if (x == 0 | y == 0) System.out.println("Некорректно");

                input.close();
            }
    }