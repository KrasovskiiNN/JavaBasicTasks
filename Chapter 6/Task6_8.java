import java.util.Scanner;

public class Task6_8
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = input.nextInt();
                int y = input.nextInt();

                if (x>y) System.out.println(x+y);
                if (x<y) System.out.println(x*y);
                if (x==y) System.out.println("Числа равны");

                input.close();
            }
    }