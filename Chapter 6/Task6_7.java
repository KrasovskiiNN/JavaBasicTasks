import java.util.Scanner;

public class Task6_7
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();

                if (x > 0 && x > 99) x=x-1;

                System.out.println(x);

                input.close();
            }
    }