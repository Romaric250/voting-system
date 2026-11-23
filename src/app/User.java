public abstract class User {
   final private String USER_ID;
    private String email;
    private String password;

    public User(String userID, String email, String password) {

        if (userID == null || userID.trim().isEmpty() || userID.length() != 8){
            System.err.println("Invalide userid");
        }
        if(!verifyEmail(email) && !verifyPassord(password)){
System.err.println("invalid email or passow");
//exit
        }


        this.USER_ID= userID;
        this.email = email;
        this.password = hashPassword(password);
    }

    public User(){
        this("00000","John doe","ashesioop2029");

    }


    public boolean verifyPassord(String password){
          if (password == null || password.trim().isEmpty() || password.length() != 8 ){
            System.err.println("Password does not have the correct format. Please try again");
            return false;
        }
        return true;
    }


    public boolean verifyEmail(String verifyEmail){
        
          if (email == null || email.trim().isEmpty() || !email.contains(".") || !email.contains("@") || !email.endsWith("@ashesi.edu.gh")){
            System.err.println("Invalid email, please check the correct format. e.g romaric.lonfonyuy@ashesi.edu.gh");
            return false;
        }
        return true;

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
    public void setPassword(String password){

        if (verifyPassord(password)){

        
        this.password = password;
        }

        // fail silently
    }
public void setEmail(String email){

    if (verifyEmail(email)){
        this.email = email;
    }
}





}
