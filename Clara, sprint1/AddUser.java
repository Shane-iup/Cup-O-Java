import java.math.BigInteger;
import java.security.MessageDigest;


public class AddUser {
    String fName;
    String lName;
    String birthday;
    String password;
    String password2; 
    //String email;

    public AddUser(String fName, String lName, String birthday, String password, String password2) {
        super ();
        //this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.password = password;
        this.password2 = password2;
    }
    
    
    private static void newUser(String fName, String lName, String birthday, String password1, String password2) {

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
    public static void callAddUser(String fName, String lName, String birthday, String password, String password2) {
    	
        newUser(fName, lName, birthday, password, password2);
    
    }
    



}