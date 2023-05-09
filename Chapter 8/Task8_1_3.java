import java.util.Scanner;

public class Task8_1_3
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Введи целое число=");

                int a = reader.nextInt();

                if (a%10!=5)
                    {
                        a++;
                        System.out.println("Yes");
                    }
                else
                    {
                        a--;
                        System.out.println("No");
                    }
                System.out.println(a);

                reader.close();
            }
    }