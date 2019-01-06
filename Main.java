import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        GameContext g = new GameContext();
        Scanner s = new Scanner(System.in);
        String input = "";

        while (true) {
            input = s.nextLine();
            int i;
            try {
                i = Integer.parseInt(input);
                g.Turn(i);

            } catch (Exception e) {
                g.choice();
            }
        }
    }
}