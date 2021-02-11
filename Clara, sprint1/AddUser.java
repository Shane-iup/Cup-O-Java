import java.math.BigInteger;
import java.security.MessageDigest;


public class AddUser {
    String fName; //15
    String lName; //15
    //String birthday;
    String password; //12
    String password2; 
    String email; //50

    public AddUser(String fName, String lName, String email, String password, String password2) {
        super ();
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        //this.birthday = birthday;
        this.password = password;
        this.password2 = password2;
    }
    
    
    private static void newUser(String fName, String lName, String email, String password1, String password2) {

    	String password = null;
    	if (password1==password2) {
    		String userPassword = password1; 
    		password = PasswordHash.hash(userPassword); // hash of the password is generated for storing
    	} else {
    		//display error
    	}
        //add to database !!!

    }

    //use this method to call this class
    public static void callAddUser(String fName, String lName, String email, String password, String password2) {
    	
        newUser(fName, lName, email, password, password2);
    
    }
    



}
