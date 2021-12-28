package backend.agricolas.utils;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Utils {
    public String getEncodedPassword(String password){
        String newPassword="";
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);
        /*iterations, memory, parallelism*/
        newPassword = argon2.hash(1,1024,1, password);
        return newPassword;
    }
}
