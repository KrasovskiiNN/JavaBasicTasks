import java.util.Scanner;

public class Task7_10
    {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = input.nextInt();

                if (a<0) a=a*-1;
                else a=0;

                input.close();
            }
    }
