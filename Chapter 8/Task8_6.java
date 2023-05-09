import java.util.Scanner;

public class Task8_6
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();
                int x;

                //a 10 -5 12 6 7 14 9
                //b 11 10 6 12 7 14 18

                //a 10 - - 6 7 - 9
                //b - 10 - - - 14 -
                //x 26 -10 - 0 - 14 9
                //- - X=30 - 10 - -

                if (a*2 != b) x = a/2 + b;
                else x = b/2 + a;

                if (x<15) System.out.println("X="+x);
                else System.out.println(x);

                reader.close();
            }
    }