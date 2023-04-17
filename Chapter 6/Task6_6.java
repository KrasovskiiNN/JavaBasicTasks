import java.util.Scanner;

public class Task6_6
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();

                if (x > 0) System.out.println("Положительное");
                if (x == 0) System.out.println("Ноль");
                if (x < 0 ) System.out.println("Отрицательное");

                input.close();
            }
    }