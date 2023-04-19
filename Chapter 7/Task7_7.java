import java.util.Scanner;

public class Task7_7
    {
        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args)
            {
                int scholars = in.nextInt();
                int chairs = in.nextInt();

                if (scholars <= chairs) System.out.println("Всем ученикам хватит мест");
                else System.out.println("Не хватает стульев");

                in.close();
            }
    }
