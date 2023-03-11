import java.util.Scanner;

public class Task2_19
{
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Пожалуйста, введите число: ");

        int a = reader.nextInt();

        System.out.println((a-1) + " " + a + " " + (a+1));
    }
}