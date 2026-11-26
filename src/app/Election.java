import java.util.ArrayList;
import java.util.HashSet;

public class Election {
    private String title;
    private ArrayList<Candidate> candidates;
    private ArrayList<Ballot> ballots;
    private HashSet<String> votedVoterIDs;
    private boolean isOpen;

    public Election(String title) {
        this.title = title;
        this.candidates = new ArrayList<>();
        this.ballots = new ArrayList<>();
        this.votedVoterIDs = new HashSet<>();
        this.isOpen = false;
    }

    public void submitBallot(Voter voter, Ballot ballot) {
        
    }

    public void getResults() {
    }
}
