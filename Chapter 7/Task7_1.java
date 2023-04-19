import java.util.Scanner;
public class Task7_1
    {
        public static Scanner input = new Scanner(System.in);
        public static void main(String[] args)
            {
                int avg = input.nextInt();
                if (avg == 100) System.out.println("Молодец");

                double mark = input.nextDouble();
                if (mark < 60)
                    {
                        mark = mark + mark/10;
                        System.out.println(mark);
                    }

                int one = input.nextInt();
                int two = input.nextInt();
                if (one > two) System.out.println(one);
                else System.out.println(two);

                int num = input.nextInt();
                if (num > 0) System.out.println("Положительное");
                if (num < 0) System.out.println("Отрицательное");

                int ugol1 = input.nextInt();
                int ugol2 = input.nextInt();
                int ugol3 = input.nextInt();

                if (ugol1 + ugol2 + ugol3 == 180) System.out.println("Это углы одного треугольника");
                else System.out.println("Это не углы одного треугольника");

                input.close();
            }
    }
