import java.util.Scanner;

public class Task8_19
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a/100 == a%100) System.out.println("Число парно-симметричное");
                else System.out.println("Число не парно-симметричное");

                reader.close();
            }
    }