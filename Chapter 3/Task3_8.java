import java.util.Scanner;

public class Task3_8
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                System.out.println(a*b);
                System.out.println(a+b+a+b);
            }
    }