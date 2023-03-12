import java.util.Scanner;

public class Task4_15
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/1000;
                int c = a%1000/100;
                int d = a%100/10;
                int e = a%10;

                int y = 0;

                if (b%2==0) y++;
                if (c%2==0) y++;
                if (d%2==0) y++;
                if (e%2==0) y++;

                System.out.println(y);
            }
    }