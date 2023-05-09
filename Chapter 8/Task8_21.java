import java.util.Scanner;

public class Task8_21
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/10;
                int c = a%10;

                if (c >= 5) System.out.println(b*10+10);
                if (c < 5) System.out.println(b*10);

                reader.close();
            }
    }