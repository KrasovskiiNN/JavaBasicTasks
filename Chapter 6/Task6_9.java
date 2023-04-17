import java.util.Scanner;

public class Task6_9
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();

                int a = x/100;
                int b = x%100/10;
                int c = x%10;

                if (a%2==0 && b%2==0 && c%2==0) System.out.println("Число чётно-красивое");

                input.close();
            }
    }