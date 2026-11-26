public class Admin extends User {
    final private String USER_TYPE;

    public Admin(String userID, String email, String password) {
        super(userID, email, password);
        this.USER_TYPE = "ADMIN";
    }

    private void addCandidate() {
        Candidate newCandidate = new Candidate(USER_TYPE, USER_TYPE);

        System.out.println("canditate saved to db");

    }

    private void registerVoter(Voter voter) {
        User user = new Voter("name", "age","Admin", "user");
    }

    private void openElection(Election election) {
    }

    private void closeElection(Election election) {
    }
}
