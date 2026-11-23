public abstract class User {
   final private String USER_ID;
    private String name;
    private String email;
    private String password;

    public User(String userID, String name, String email, String password) {
        this.USER_ID= userID;
        this.name = name;
        this.email = email;
        this.password = hashPassword(password);
    }

    private String hashPassword(String password){
        
        return "hashed password";
    }

    public String getUserID(){
        return  this.USER_ID;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
}
