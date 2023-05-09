import java.util.Scanner;

public class Task8_11
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int students = reader.nextInt();
                int chairs = reader.nextInt();

                if (students < chairs) System.out.println(chairs-students + " стула лишних");
                if (chairs < students) System.out.println(students-chairs + " стула не хватает");
                if (students == chairs) System.out.println("Всем хватает стульев");

                reader.close();
            }
    }