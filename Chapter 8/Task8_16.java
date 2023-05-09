import java.util.Scanner;

public class Task8_16
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a/100 == a%10) System.out.println("Yes");
                else System.out.println("No");

                reader.close();
            }
    }