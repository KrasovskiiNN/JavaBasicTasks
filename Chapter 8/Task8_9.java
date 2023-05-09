import java.util.Scanner;

public class Task8_9
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b, c;

                if (a%2 != 1)
                    {
                        b = a/2;
                        c=(a+b)%10;
                        System.out.println(a+b+c);
                    }
                else
                    {
                        b=a/2+1;
                        c=(a*b)%10;
                        System.out.println(c-a-b);
                    }

                reader.close();
            }
    }