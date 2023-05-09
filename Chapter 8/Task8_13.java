import java.util.Scanner;

public class Task8_13
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a / 10 == a % 10) System.out.println("Yes");
                else System.out.println("No");

                reader.close();
            }
    }