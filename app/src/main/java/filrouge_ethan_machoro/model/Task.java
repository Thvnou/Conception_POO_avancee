package filrouge_ethan_machoro.model;


// Classe qui détermine une tâche de la "to do list".
// "label" représente la tâche à faire (sous forme de texte).


public class Task {

    private String label;

    public Task(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
