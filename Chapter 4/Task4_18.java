import java.util.Scanner;

public class Task4_18
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a%100/10;
                int c = a%10;

                int y = b*100+c*10;

                System.out.println(y);
            }
    }