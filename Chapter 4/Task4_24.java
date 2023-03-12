import java.util.Scanner;

public class Task4_24
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                int c = (a/10)*10+(b%10);
                int d = (b/10)*10+(a%10);

                System.out.println(c);
                System.out.println(d);
            }
    }