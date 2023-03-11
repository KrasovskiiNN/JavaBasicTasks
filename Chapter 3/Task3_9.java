import java.util.Scanner;

public class Task3_9
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();
                int c = reader.nextInt();

                System.out.println((a*10)+(b*100)+(c*1000));
            }
    }