
public class AddCompany {
    String name;
    String URL;
    String compPhone;
    String password;
    String password2; 
    String phone;
    //String email;

    public AddCompany(String name, String URL, String compPhone, String password, String password2, String phone) {
        super ();
        //this.email = email;
        this.name = name;
        this.URL = URL;
        this.compPhone = compPhone;
        this.password = password;
        this.password2 = password2;
        this.phone = phone;
    }
    
    
    private static void newCompany(String name, String URL, String compPhone, String password1, String password2, String phone) {

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
    public static void callAddCompany(String name, String URL, String compPhone, String password, String password2, String phone) {
    	
        newCompany(name, URL, compPhone, password, password2, phone);
    
    }
    



}