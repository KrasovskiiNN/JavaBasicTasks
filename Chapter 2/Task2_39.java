import java.util.Scanner;

public class Task2_39
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                String surname = reader.next();
                String name = reader.next();
                String name2 = reader.next();

                String output = name.charAt(0)+"."+name2.charAt(0)+"."+surname;

                System.out.println(output);
            }
    }