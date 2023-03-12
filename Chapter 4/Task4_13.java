import java.util.Scanner;

public class Task4_13
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = a/10;
                int c = a%10;

                int y = 0;

                if (b%2==0) y++;
                if (c%2==0) y++;

                System.out.println(y);
            }
    }