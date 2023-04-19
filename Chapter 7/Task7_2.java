import java.util.Scanner;

public class Task7_2
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int digit1 = a/10;
                int digit2 = a%10;

                if (digit1==digit2) System.out.println("Результат деления равен остатку");
                else System.out.println("Результат деления не равен остатку");

                reader.close();
            }
    }
