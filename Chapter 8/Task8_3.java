import java.util.Scanner;

public class Task8_3
    {
        public static Scanner reader = new Scanner(System.in);
        public static void main(String[] args)
            {
                int a, b, c;

                a = reader.nextInt();
                b = a/10;
                c = a%10;

                if (b==c) System.out.println("Yes");
                else System.out.println("No");

                if (b>c) System.out.println("Good");
                else System.out.println("Bas");

                reader.close();
            }
    }