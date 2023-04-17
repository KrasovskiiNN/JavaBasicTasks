import java.util.*;

public class Task6_3
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int age;

                System.out.println("Введи свой возраст");

                age = reader.nextInt();

                if (age>=18) System.out.println("Можешь участвовать в выборах");
                else System.out.println("Не можешь участвовать в выборах");

                reader.close();
            }
    }