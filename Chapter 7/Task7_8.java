import java.util.Scanner;

public class Task7_8
    {
        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args)
            {
                int scholars = in.nextInt();
                int tables = in.nextInt();

                if (scholars/2 <= tables && scholars%2 == 0) System.out.println("Все ученики смогут сесть");
                else System.out.println("Не всем хватит столов");

                in.close();
            }
    }
