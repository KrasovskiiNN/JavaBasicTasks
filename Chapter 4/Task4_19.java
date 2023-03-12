import java.util.Scanner;

public class Task4_19
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a%1000/100;
                int c = a%100/10;
                int d = a%10;

                int y = b*1000+c*100+d*10;

                System.out.println(y);
            }
    }