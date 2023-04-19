import java.util.Scanner;

public class Task7_11
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();
                int b = input.nextInt();

                if (a>b)
                    {
                        System.out.println(b +" "+ a);
                        System.out.println(a +" "+ b);
                    }
                else
                    {
                        System.out.println(a +" "+ b);
                        System.out.println(b +" "+ a);
                    }

                input.close();
            }
    }
