import java.util.Scanner;

public class Task8_12
    {
        public static Scanner reader = new Scanner(System.in);

        public static void main(String[] args)
            {
                int grade = reader.nextInt();

                if(grade < 1 | grade > 5) System.out.println("ERROR!");
                else System.out.println("Ученик получил оценку " + grade);

                reader.close();
            }
    }