import java.util.Scanner;

public class Task5_6
    {
        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = in.nextInt();
                int b = in.nextInt();

                if ((a<b)||(a<100)) System.out.println("TRUE");
                else System.out.println("FALSE");

                //a должно быть больше b и a должно быть больше либо ранво 100 чтобы всегда получалось FALSE

                in.close();
            }
    }