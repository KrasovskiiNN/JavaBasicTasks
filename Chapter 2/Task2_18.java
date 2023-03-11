import java.util.Scanner;

public class Task2_18
{
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Пожалуйста, введите число: ");

        int a = reader.nextInt();

        System.out.println("Квадрат " + a + " равен " + (a*a) + " & " + "Куб " + a + " равен " + (a*a*a));
    }

}