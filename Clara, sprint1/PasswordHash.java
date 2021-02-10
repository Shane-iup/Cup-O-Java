import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHash {

    private static String hashProcess (String password) {

        try { // checks for errors on the process
            String safePassword = null;

            MessageDigest hash = MessageDigest.getInstance("SHA-256"); //Hash using SHA-256

            
            //digest() return array of byte.
            byte[] hashDigest = hash.digest(password.getBytes());


            // BigInteger class is used, to convert the resultant byte array into its signum representation
            BigInteger digest = new BigInteger(1, hashDigest);

            // Convert the input digest into hex value
            safePassword = digest.toString(16);
            
            //paddingto make the hashtext 32 bit
            while (safePassword.length() < 32) {
                safePassword = "0" + safePassword;
            }
            return safePassword;
        } catch (Exception ex) {
            System.err.println("An error has occurred, please try again later");//CHANGE TO POP UP ERROR
        }
        String fail = "0";
        return fail;

    }
    
    public static String hash (String password) {
    	String safePassword;
    	safePassword = hashProcess(password);
    	return safePassword;
    }
    

}
