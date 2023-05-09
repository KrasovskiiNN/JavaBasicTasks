import java.util.Scanner;

public class Task8_23
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                if (a > b) System.out.println((a+1) +" "+ (b-1));
                if (b > a) System.out.println((a-1) +" "+ (b+1));
                if (a == b) System.out.println((a+1) +" "+ (b+1));

                reader.close();
            }
    }