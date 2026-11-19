public class Voter extends User {
    public Voter(String userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public void castVote(Ballot ballot) {
    }
}
