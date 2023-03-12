import java.util.Scanner;

public class Task4_20_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/100;
                int c = a%100;

                int y = c*10+b;

                System.out.println(y);
            }
    }