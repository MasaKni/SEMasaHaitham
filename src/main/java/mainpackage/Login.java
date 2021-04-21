package mainpackage;

public class Login {
    private String username;
    private String password;
    private String enteredUsername;
    private String enteredPasssword;
    
    public void setUsername(String myusername){
        this.username = myusername;
    }

    public void setPassword(String mypassword){
        this.password = mypassword;
    }

    public void setEnteredUsername(String enteredUsername) {
        this.enteredUsername = enteredUsername;
    }

    public void setEnteredPasssword(String enteredPasssword) {
        this.enteredPasssword = enteredPasssword;
    }


    public String getEnteredUsername() {
        return enteredUsername;
    }

    public String getEnteredPasssword() {
        return enteredPasssword;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }




}


 