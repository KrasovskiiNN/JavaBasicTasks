import java.util.Scanner;

public class Task7_5
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();

                if (a > 0) System.out.println("Положительное число");
                else System.out.println("Не положительное число");

                input.close();
            }
    }
