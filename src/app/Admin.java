public class Admin extends User {
    public Admin(String userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public void addCandidate(Candidate candidate) {
    }

    public void registerVoter(Voter voter) {
    }

    public void openElection(Election election) {
    }

    public void closeElection(Election election) {
    }
}
