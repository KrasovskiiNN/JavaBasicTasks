import java.util.Scanner;

public class Task8_15
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a/10 > a%10) System.out.println("First");
                if (a/10 < a%10) System.out.println("Second");

                reader.close();
            }
    }