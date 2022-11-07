class InvalidCountryException extends Exception {
     private static final long serialVersionUID = 1L;

    public InvalidCountryException() {
        System.out.println("User outside India cannot be registered!");
    }
    
}

class UserRegistration {
    static void registerUser(String username, String usercountry) {
        // String India = "India";
        try {
            if(!usercountry.equals("India")) {
                throw new InvalidCountryException();
            }
            
            System.out.println("User registration done successfully.");
        }

        catch(InvalidCountryException ice) {
        }

    }
    public static void main(String[] args) {
        String username = args[0];
        String usercountry = args[1];
        registerUser(username, usercountry);        
    }
}