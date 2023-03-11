import java.util.Scanner;

public class Task2_22
{
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Пожалуйста, введите первое число: ");

        int a = reader.nextInt();

        System.out.println("Пожалуйста, введите второе число: ");

        int b = reader.nextInt();

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(b-a);
    }
}