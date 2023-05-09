import java.util.Scanner;

public class Task8_20
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/100;
                int c = a%100/10;
                int d = a%10;

                if (b == 0 | c == 0 | d == 0) System.out.println ("Yes");
                else System.out.println("No");

                reader.close();
            }
    }