import java.util.Scanner;

public class Task2_25
{
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Пожалуйста, введите ширину параллелепипеда: ");

        int a = reader.nextInt();

        System.out.println("Пожалуйста, введите длину параллелепипеда: ");

        int b = reader.nextInt();

        System.out.println("Пожалуйста, введите глубину параллелепипеда: ");

        int c = reader.nextInt();

        int V = a*b*c;
        int S1 = a*b;
        int S2 = a*c;
        int S3 = b*c;
        int S = (S1+S2+S3)*2;
        int P = (a+b+c)*4;

        System.out.println("Объём параллелепипеда равен: " + V);
        System.out.println("Площадь грани ab равна: " + S1);
        System.out.println("Площадь грани ac равна: " + S2);
        System.out.println("Площадь грани bc равна: " + S3);
        System.out.println("Общая площадь параллелепипеда равна: " + S);
        System.out.println("Общий периметр параллелепипеда равен: " + P);
    }
}