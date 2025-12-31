package filrouge_ethan_machoro.view;

import filrouge_ethan_machoro.model.Task;
import java.util.List;

/**
 * La vue : elle s'occupe uniquement d'afficher des informations.
 * Elle ne doit jamais modifier le modèle directement.
 */
public class TaskView {

    // Affichage de la liste de tâches
    public void showTasks(List<Task> tasks) {
        System.out.println("\n=== LISTE DES TÂCHES ===");
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche pour le moment !");
            return;
        }

        int i = 0;
        for (Task t : tasks) {
            System.out.println(i + " : " + t.getLabel());
            i++;
        }
    }

    // Affichage du menu principal
    public void showMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Ajouter une tâche");
        System.out.println("2. Supprimer une tâche");
        System.out.println("3. Afficher la liste des tâches");
        System.out.println("0. Quitter");
        System.out.print("Votre choix : ");
    }
}
