import java.util.ArrayList;
import java.util.Scanner;

public class ExtraLabb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> toDo = new ArrayList<String>();

        TryCatch tryCatch = new TryCatch();

        while (true) {

            System.out.println("Welcome to the toDo! \n 1 - Add \n 2 - Remove \n 3 - Show all toDos \n 4 - Exit program.");
            int choice = tryCatch.tryCatch1();

            switch (choice){
                case 1:
                    System.out.println("What would you like to add to your toDoList");
                    toDo.add(sc.nextLine());
                    System.out.println("Added!");
                    break;
                case 2:
                    System.out.println("Which toDo would you like to remove? \n" + toDo);
                    int choice1 = tryCatch.tryCatch2(toDo.size());
                    toDo.remove(choice1);
                    System.out.println("Successfully removed! \n" + toDo);
                    break;
                case 3:
                    System.out.println("All toDos");
                    System.out.println(toDo);
                    System.out.println("Which toDo would you like to pick?");
                    int choice2 = tryCatch.tryCatch2(toDo.size());
                    System.out.println("You picked: " + choice2);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}
