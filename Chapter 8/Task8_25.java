import java.util.Scanner;

public class Task8_25
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a%2 == 0)
                    {
                        System.out.println("Введите дробное число:");
                        double b = reader.nextDouble();
                        System.out.println(a*b);
                    }
                else
                    {
                        System.out.println("Введите целое число:");
                        int c = reader.nextInt();
                        System.out.println(a+c);
                    }

                reader.close();
            }

    }