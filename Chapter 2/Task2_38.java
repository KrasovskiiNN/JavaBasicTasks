import java.util.Scanner;

public class Task2_38
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Пожалуйста, введите фамилию:");

                String surname = reader.next();

                System.out.println("Пожалуйста, введите имя:");

                String name = reader.next();

                System.out.println("Пожалуйста, введите отчество:");

                String name2 = reader.next();

                String output = (surname.charAt(0) +""+ name.charAt(0) +""+ name2.charAt(0));

                System.out.print(output);
            }
    }