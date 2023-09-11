import java.util.Scanner;

public class Task8_26
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int a = reader.nextInt();

                int b = a/10000;
                int c = a%10000/1000;
                int d = a%1000/100;
                int e = a%100/10;
                int f = a%10;

                int g = 0;

                if ((a <= 99999) & (a > 9))
                    {
                        if (b > 0)
                            {
                              //  System.out.println("5");
                                g = f*10000 + e*1000 + d*100 + c*10 + b;
                              //  System.out.println(g);
                            }
                        if ((b==0) & (c > 0))
                            {
                              // System.out.println("4");
                                g = f*1000 + e*100 + d*10 + c;
                              //  System.out.println(g);
                            }
                        if ((b==0) & (c==0) & d > 0)
                            {
                               // System.out.println("3");
                                g = f*100 + e*10 + d;
                               // System.out.println(g);
                            }
                        if ((b==0) & (c==0) & (d==0) & (e > 0))
                            {
                               // System.out.println("2");
                                g = f*10 + e;
                               // System.out.println(g);
                            }
                        if (a==g) System.out.println("Это число палиндром.");
                        else System.out.println("Это число не палиндром.");
                    }

                else System.out.println("ERROR!");

                reader.close();
            }
    }