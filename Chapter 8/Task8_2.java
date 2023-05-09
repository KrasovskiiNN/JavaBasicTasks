import java.util.Scanner;

public class Task8_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Введи целое число=");

                int a = reader.nextInt();

                System.out.println("Введи ещё одно целое число=");

                int b = reader.nextInt();

                //3 21; 21 3; 13 13; 5 12;

                if (a%b==0) System.out.println("Yes");
                else System.out.println("No");

                if (b%a==0)
                    {
                        a+=2;
                        System.out.println("Good");
                    }
                else
                    {
                        a=2;
                        System.out.println("Bad");
                    }
                System.out.println(a);

                reader.close();
            }
    }