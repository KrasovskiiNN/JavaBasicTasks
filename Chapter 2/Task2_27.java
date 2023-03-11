import java.util.Scanner;

public class Task2_27
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
        {
            System.out.println("Пожалуйста, введите значение массы тела в граммах: ");

            int a = reader.nextInt();

            System.out.println(a/100);
        }
    }