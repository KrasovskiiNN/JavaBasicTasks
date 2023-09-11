import java.util.Scanner;

public class Task8_32
    {
        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = in.nextInt();

                if (a%2==0)
                    {
                        System.out.println("Введите дробное число:");
                        double b = in.nextDouble();
                        System.out.println(a*b);
                    }
                else
                    {
                        System.out.println("Введите целое число:");
                        int c = in.nextInt();
                        System.out.println(a+c);
                    }

                in.close();
            }
    }