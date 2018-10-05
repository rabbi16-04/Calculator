import javax.swing.SwingUtilities;

import Controller.Controller;
import Model.Model;
import View.View;

public class Run {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                Model model = new Model();
                View view = new View(model);
                Controller controller = new Controller(model, view);

                model.addObserver(view);

            }
        });

    }

}