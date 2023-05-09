import java.util.Scanner;

public class Task8_17
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/100;
                int c = a%100/10;
                int d = a%10;

                int e = b+c+d;

                if ((a+e)%2!=1) System.out.println("Число дважды чётное");
                else System.out.println("Число не дважды чётное");

                reader.close();
            }
    }