import java.util.Scanner;

public class Task8_4
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int x = reader.nextInt();
                int t;

                if (x/10>=5) t=20;
                else t=0;

                System.out.println(t);

                reader.close();
            }
    }