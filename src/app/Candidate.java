public class Candidate extends User{
    private String position;
    private String biography;

    public Candidate(String userID, String email, String password, String name, String position, String biography  ) {
        super(userID, email, password, name);
        this.position = position;
        this.biography = biography;
    }

    @Override 
    public boolean login(){
return true;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return this.position;
    }

    public void setBiography(String biography){
        this.biography = biography;
    }
    public String getBiography(){
        return this.biography;
    }

    void getInfo(){
        System.out.println(" Voting statistics");
    }

    public boolean canVote(){
        return true;
    }
    public void whoAreYou(){
        System.out.println("I am a candidate");
    }
}
