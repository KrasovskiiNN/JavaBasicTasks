import java.util.*;

public class Task6_1
    {
        public static Scanner reader = new Scanner(System.in);
        public static void main(String[] args)
            {
                int x = reader.nextInt();
                int y = reader.nextInt();

                if (x<y) System.out.println("x меньше y");
                if (x==y) System.out.println("x теперь равна y");
                if(x>y) System.out.println("x теперь больше y");
            }
    }