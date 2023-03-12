import java.util.Scanner;

public class Task4_17
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/1000;
                int c = a%1000/100;
                int d = a%100/10;
                int e = a%10;

                int y = e*1000+c*100+d*10+b;

                System.out.println(y);
            }
    }