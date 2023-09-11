import java.util.Scanner;

public class Task8_31
    {
        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = in.nextInt();
                int b = a/100;
                int c = a%100/10;
                int d = a%10;

                if (a%2==0)
                    {
                        if (b%2==0) b = b+1;
                        else b = b-1;

                        if (c%2==0) c = c+1;
                        else c = c-1;

                        if (d%2==0) d = d+1;
                        else d = d-1;
                    }
                else
                    {
                        if (b%2==0) b = b-1;
                        else b = b+1;

                        if (c%2==0) c = c-1;
                        else c = c+1;

                        if (d%2==0) d = d-1;
                        else d = d+1;
                    }
                System.out.println(b*100+c*10+d);

                in.close();
            }
    }