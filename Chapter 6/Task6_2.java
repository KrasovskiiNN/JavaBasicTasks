import java.util.*;

public class Task6_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                double num;

                System.out.println("enter number");
                num = reader.nextDouble();

                if (num>0) System.out.println("Положительное число");
                System.out.println("Завершено");
            }
    }