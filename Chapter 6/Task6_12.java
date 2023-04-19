import java.util.Scanner;

public class Task6_12
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();

                //Квадратное уравнение имеет вид a * x^2 + b * x + c = 0

                int D = b * b - 4 * a * c;

                //Дискриминант показывает сколько корней имеет квадратное уравнение.

                if (D > 0) System.out.println("Уравнение имеет два корня. Решение есть.");
                if (D == 0) System.out.println("Уравнение имеет один корень. Решение есть.");
                if (D < 0) System.out.println("Уравнение не имеет корней. Решения нет.");

                input.close();
            }
    }