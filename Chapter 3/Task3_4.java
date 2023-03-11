import java.util.Scanner;

public class Task3_4
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Пожалуйста введите сумму в рублях:");

                double rub = reader.nextDouble();

                System.out.println("Пожалуйста введите текущий курс USD:");

                double usd = reader.nextDouble();

                double course = rub/usd;

                System.out.println(course);

                reader.close();
            }
    }