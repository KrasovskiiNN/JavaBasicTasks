import java.util.Scanner;

public class Task7_3
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();

                //a 2 4 9 4 3 6
                //b 6 4 2 9 9 0

                if (a%3 == b%4) System.out.println(a-b);
                else System.out.println(b-a);

                reader.close();
            }
    }
