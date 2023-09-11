import java.util.Scanner;

public class Task8_27
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                if (a%10 > b%10) System.out.println(a);
                if (b%10 > a%10) System.out.println(b);
                if (a%10 == b%10) System.out.println("Такого числа нет.");

                reader.close();
            }
    }