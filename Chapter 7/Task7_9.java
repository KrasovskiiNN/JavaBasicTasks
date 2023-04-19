import java.util.Scanner;

public class Task7_9
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();

                if (a*a + b*b == c*c) System.out.println("Введённые значения принадлежат прямоугольному треугольнику");
                else System.out.println("Значения не соответствуют прямоугольному треугольнику");
            }
    }
