import java.util.HashMap;

public class Ballot {
    private HashMap<String, String> selections;

    public Ballot() {
        this.selections = new HashMap<>();
    }

    public void choose(String position, String name) {
    }

    public boolean isComplete() {
        return false;
    }
}
