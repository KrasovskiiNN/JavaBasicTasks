import java.util.Scanner;

public class Task2_24
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Пожалуйста, введите ширину прямоугольника: ");

                int a = reader.nextInt();

                System.out.println("Пожалуйста, введите длину прямоугольника: ");

                int b = reader.nextInt();

                System.out.println("Площадь прямоугольнмка равна: " + a*b);
                System.out.println("Периметр прямоугольника равен: " + ((a+b)*2));
            }
    }