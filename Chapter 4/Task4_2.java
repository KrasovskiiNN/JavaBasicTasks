import java.util.Scanner;

public class Task4_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = a/100;
                int c = a%100;
                int d = c/10;
                int e = c%10;

                System.out.println(b +" "+ d +" "+ e);

                reader.close();
            }
    }