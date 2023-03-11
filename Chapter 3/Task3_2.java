import java.util.Scanner;

public class Task3_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int centimeters = reader.nextInt();
                double inches = centimeters * 2.54;

                System.out.println(inches);

                reader.close();
            }
    }