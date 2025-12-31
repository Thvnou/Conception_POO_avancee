package filrouge_ethan_machoro.controller;

import java.util.Scanner;

import filrouge_ethan_machoro.model.TaskModel;
import filrouge_ethan_machoro.view.TaskView;


// Le contrôleur fait le lien entre la vue et le model.
// Le contôleur interagis avec l'utilisateur, demande au modèle de se modifier et l'affiche.


public class TaskController {

    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    // Méthode qui fait tourner le programme de la to do list en boucle.
    public void start() {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            view.showMenu();

            // Je vérifi d'abord que l'utilisateur a rentrer un chiffre comme demander.
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre : ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // nettoyer la ligne

            switch (choice) {

                case 1:
                    System.out.print("Entrez une nouvelle tâche : ");
                    String taskText = scanner.nextLine();
                    model.addTask(taskText);
                    System.out.println("Tâche ajoutée !");
                    break;

                case 2:
                    System.out.print("Index de la tâche à supprimer : ");
                    int index = scanner.nextInt();
                    model.removeTask(index);
                    System.out.println("Tâche supprimée (si l'index était valide).");
                    break;

                case 3:
                    view.showTasks(model.getTasks());
                    break;

                case 0:
                    System.out.println("Merci d'avoir utiliser notre to do list");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choice != 0);

        scanner.close();
    }
}
