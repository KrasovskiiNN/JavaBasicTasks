import java.util.Scanner;

public class Task4_20
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/100;
                int c = a%100/10;
                int d = a%10;

                int y = c*100+d*10+b;

                System.out.println(y);
            }
    }