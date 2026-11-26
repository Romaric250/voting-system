public class Voter extends User {
    private String userType;
    public Voter(String userID, String email, String name, String password, String userType) {
        super(userID, email, password, name);
        this.userType = userType;
    }

    public void castVote(Ballot ballot) {
    }
}
