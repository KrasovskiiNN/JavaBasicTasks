import java.util.Scanner;

public class Task4_23
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a%10;
                int c = a/10;

                int y = b*1000+c;

                System.out.println(y);
            }
    }