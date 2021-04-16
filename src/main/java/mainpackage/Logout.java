package mainpackage;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Logout {

    static Logger logger = Logger.getLogger(Logout.class.getName());

    public void setLoggedout(Boolean loggedout) {
        this.loggedout = loggedout;
    }

    public Boolean getLoggedout() {
        return loggedout;
    }

    private  Boolean loggedout;
    public  void logoutt(){

        logger.log(Level.WARNING,"logged out successfully");
        loggedout = true;
    }
}
