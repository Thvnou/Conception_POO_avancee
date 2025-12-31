package filrouge_ethan_machoro;

import filrouge_ethan_machoro.model.TaskModel;
import filrouge_ethan_machoro.view.TaskView;
import filrouge_ethan_machoro.controller.TaskController;

/**
 * Point d'entrée du programme.
 * Il crée le modèle, la vue, et le contrôleur,
 * puis lance le programme.
 */
public class Main {
    public static void main(String[] args) {

        // On crée les 3 parties du MVC
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        // Lancement de l'application
        controller.start();
    }
}
