import java.util.Scanner;

public class Task3_5
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                double a = reader.nextDouble();
                double b = reader.nextDouble();
                double c = reader.nextDouble();

                double P = a+b+c;
                double p = P/2;

                double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

                System.out.println(P);
                System.out.println(S);

                reader.close();
            }
    }