import java.util.Scanner;

public class Task8_7
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                if (a > b) System.out.println(a - b);
                if (b > a) System.out.println(b - a);
                if (a == b) System.out.println(a * b );

                reader.close();
            }
    }