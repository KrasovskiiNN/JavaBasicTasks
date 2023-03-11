import java.util.Scanner;

public class Task4_5
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = a/10*10;
                int c = a%10;

                System.out.println(b+"+"+c);
            }
    }