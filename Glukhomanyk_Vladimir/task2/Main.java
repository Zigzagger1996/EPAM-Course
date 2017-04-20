import java.util.Scanner;
/**
 * Created by Zigzagger on 14.04.2017.
 */

public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();

    }
}
