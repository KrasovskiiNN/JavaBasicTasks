import java.util.Scanner;

public class Task8_29
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();
                int b = reader.nextInt();
                int c = reader.nextInt();
                int d = reader.nextInt();

                if ((a!=0)&(b!=0)&(c!=0)&(d!=0))
                    {
                        if ((a/b) == (c/d)) System.out.println("Дроби равны");
                        if ((a/b) != (c/d)) System.out.println("Дроби не равны");
                    }
                else System.out.println("ERROR!");

                reader.close();
            }
    }