import java.util.Scanner;

public class Task4_21_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/1000;
                int c = a%1000;

                int y = c*10+b;

                System.out.println(y);
            }
    }