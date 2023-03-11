import java.util.Scanner;

public class Task4_3
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                System.out.println(a%10 +" "+ a/10);

                reader.close();
            }
    }