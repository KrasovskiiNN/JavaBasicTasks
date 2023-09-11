import java.util.Scanner;

public class Task8_24
    {
        public static Scanner reader = new Scanner(System.in);
        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/100;
                int c = a%100/10;
                int d = a%10;

                if (a > 500) System.out.println(d*100+c*10+b);
                else System.out.println(b*100+d*10+c);

                reader.close();
            }
    }