import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        while (true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Hello user, please input the total of the tab! (If you want to exit the app input 0)");
                    total = sc.nextDouble();

                    if (total >= 50 || total <= 300) {
                        double tips15 = total * 0.15;

                        System.out.println("Total: " + (total + tips15) + "\nTip included in total: " + (tips15));
                    }
                    else if (total > 300 || total <= 1000) {
                        double tips20 = total * 0.20;
                        System.out.println("Total: " + (total + tips20) + "\nTip included in total: " + (tips20));
                    }
                    else if (total > 1000) {
                        double tips25 = total * 0.25;
                        System.out.println("Total: " + (total + tips25) + "\nTip included in total: " + (tips25));
                    }

                    else if (total < 0) {
                        System.out.println("Can't calculate negative numbers");
                    }

                    else {
                        System.out.println("Total: " + total);
                    }

                    if (total > 0) {
                        System.out.println("Do you want to exit this program press 0 or press 1 to restart the program.");
                    }
                    if (sc.nextInt() == 0) {
                        break;
                    }
                }
                catch (Exception e) {
                    System.out.println("Invalid input, please try again!");
                }
        }
    }
}