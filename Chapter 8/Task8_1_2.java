import java.util.Scanner;

public class Task8_1_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Введи целое число=");

                int a = reader.nextInt();

                if (a%3==0)
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