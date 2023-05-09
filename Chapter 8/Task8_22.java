import java.util.Scanner;

public class Task8_22
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                if (a%2!=1) System.out.println("Up to " + (a/10+1)*10);
                else System.out.println("Down to " + (a/10)*10);

                reader.close();
            }
    }