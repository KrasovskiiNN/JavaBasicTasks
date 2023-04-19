import java.util.Scanner;

public class Task7_4
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();
                int a = x%100;

                if (x==a) System.out.println("Ok");
                else System.out.println("No");

                input.close();
            }
    }
