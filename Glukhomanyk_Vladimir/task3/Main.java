package ua.kpi.tef;
import ua.kpi.tef.controller.*;
import ua.kpi.tef.model.*;
import ua.kpi.tef.view.*;
/**
 * Created by Zigzagger on 04.04.2017.
 */
public class Main{
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
