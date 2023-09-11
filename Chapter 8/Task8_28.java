import java.util.Scanner;

public class Task8_28
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                if (b != 0)
                    {
                       if (a < b) System.out.println("Правильная дробь");
                       if (a > b) System.out.println("Неправильная дробь");
                       if (a == b) System.out.println("Целое число");
                    }
                else System.out.println("ERROR!");

                reader.close();
            }
    }