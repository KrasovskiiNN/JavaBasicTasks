import java.util.Scanner;

public class Task8_18
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/100;
                int c = a%100/10;
                int d = a%10;

                int count = 0;

                if (b%2!=1) count++;
                if (c%2!=1) count++;
                if (d%2!=1) count++;

                System.out.println("Степень чётности числа равна " + count);

                reader.close();
            }
    }