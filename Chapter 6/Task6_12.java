import java.util.Scanner;

public class Task6_12
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();

                //Дискриминант

                int D = b * b - 4 * a * c;

                //Если дискриминант больше ноля, то

                if (D >= 0) System.out.println("Уравнение имеет решение");
                if (D < 0) System.out.println("Уравнение не имеет решения");

                input.close();
            }
    }