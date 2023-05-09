import java.util.Scanner;

public class Task8_8
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                // 5 8
                // 4 6
                // 4 7

                int c = a/2 + b/2;

                if (a + b != c)
                    {
                        c = a/2 + b/2;
                        System.out.println("C="+c);
                    }
                else
                    {
                        c = a%2 + b%2;
                        System.out.println("C is " +c);
                    }

                reader.close();
            }
    }