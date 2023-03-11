import java.util.Scanner;

public class Task2_36
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                System.out.println("Пожалуйста, введите фамилию пассажира:");

                String surname = reader.next();

                System.out.println("Пожалуйста, введите город назначения:");

                String city = reader.next();

                String output = ("Пассажир " + surname + " вылетает в " + city);

                System.out.print(output);
            }
    }