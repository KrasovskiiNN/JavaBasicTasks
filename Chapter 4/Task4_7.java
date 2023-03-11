import java.util.Scanner;

public class Task4_7
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int x = a/10;
                int y = a%10;
                int z = y*10+x;
                int q = z+8;

                System.out.println(q);
            }
    }