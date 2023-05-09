import java.util.Scanner;

public class Task8_5
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = reader.nextInt();

                if (x > 0) System.out.println("Плюс");
                else System.out.println("Не плюс");

                int a = reader.nextInt();

                if (x > a) a = -1;
                else a = 0;

                if (a > 100) System.out.println("Верное число");
                else System.out.println("Ошибка");

                if (a != x) a = x;
                else x = a * 2;

                if (x > 0) x = x + 1;
                else x = x - 1;

                reader.close();
            }
    }