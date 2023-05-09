import java.util.Scanner;

public class Task8_10
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a < 0) System.out.println(a*a);
                else System.out.println("Ошибка");

                reader.close();
            }
    }