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

                int sum = (a%2 + b%2 + c%2);

                if (sum==0) System.out.println("Число чётно-красивое");

                input.close();
            }
    }