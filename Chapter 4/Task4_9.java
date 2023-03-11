import java.util.Scanner;

public class Task4_9
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = a/10;
                int c = a%10;
                int d = b+c;

                System.out.println(d);
            }
    }