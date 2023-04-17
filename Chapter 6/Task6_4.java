import java.util.Scanner;

public class Task6_4
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();

                if (x>=0) System.out.println(x*2);

                input.close();
            }
    }