import java.util.Scanner;

public class Task7_6
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();
                int b = input.nextInt();

                if (a == b) System.out.println("Числа равны");
                else System.out.println("Числа не равны");

                input.close();
            }
}
