package filrouge_ethan_machoro.model;

import java.util.ArrayList;
import java.util.List;

// Dans cette classe j'ai mis toutes le méthode qui permettrons le bon fonctionnement des actions demander par l'utilisateur sur la to do list.

// Par exemple ajouter, supprimer et voir les tâches


public class TaskModel {

    private List<Task> tasks;

    public TaskModel() {
        tasks = new ArrayList<>();
    }

    // Ajouter une nouvelle tâche à la to do list
    public void addTask(String label) {
        tasks.add(new Task(label));
    }

    // Supprimer une tâche de la to do list
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    // Afficher les tâches de l'utilisateurs
    public List<Task> getTasks() {
        return tasks;
    }
}
