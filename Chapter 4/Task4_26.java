import java.util.Scanner;

public class Task4_26
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                int c = (b/100)*100+(a%100);
                int d = (a/100)*100+(b%100);

                System.out.println(c);
                System.out.println(d);
            }
    }