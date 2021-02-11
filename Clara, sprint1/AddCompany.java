
public class AddCompany {
    String name;
    String URL;
    int compPhone;
    String password;
    String password2; 
    //String phone;
    String email;

    public AddCompany(String name, String email, int compPhone, String password, String password2, String URL) {
        super ();
        this.email = email; //50
        this.name = name;  //25
        this.URL = URL;  //30
        this.compPhone = compPhone;  //11
        this.password = password;  //12
        this.password2 = password2;
        //this.phone = phone;
    }
    
    
    private static void newCompany(String name, String email, int compPhone, String password1, String password2, String URL) {

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
    public static void callAddCompany(String name, String email, int compPhone, String password, String password2, String URL) {
    	
        newCompany(name, email, compPhone, password, password2, URL);
    
    }
    



}
