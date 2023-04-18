import java.util.Scanner;

public class Task6_13
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();
                int y = input.nextInt();

                if (y != 0) System.out.println("Дробь существующая");

                input.close();
            }
    }