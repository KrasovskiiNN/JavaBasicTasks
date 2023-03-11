import java.util.Scanner;

public class Task3_3
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                double inches = reader.nextDouble();
                double centimeters = inches/2.54;

                System.out.println(centimeters);

                reader.close();
            }
    }