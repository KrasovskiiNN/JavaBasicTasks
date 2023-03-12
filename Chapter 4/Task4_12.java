import java.util.Scanner;

public class Task4_12
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = a/100;
                int c = a%100/10;
                int d = a%100%10;
                int e = (b-d)*c;

                System.out.println(e);
            }
    }