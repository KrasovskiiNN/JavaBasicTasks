import java.util.Scanner;

public class Task3_1
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                double f = reader.nextDouble();

                double c = 5*(f-32)/9;

                System.out.println(c);
            }
    }

