import java.util.Scanner;

public class Task2_34
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                String s1 = "Привет";

                System.out.println("Пожалуйста, введите своё имя: ");

                String s2 = reader.next();

                System.out.println(s1 + ", " + s2);
            }
    }