import java.util.Scanner;

public class Task8_30
    {
        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = in.nextInt();
                int b = in.nextInt();

                if ((b!=0) & (a>b))
                    {
                        int c = a/b;
                        int d = b*c;
                        if ((a-d)!=0)
                        {
                            System.out.println(c + " " + (a-d) + "/" + b);
                        }
                        else System.out.println(c);
                    }
                else System.out.println("Подсчёт не производится.");

                in.close();
            }
    }