/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oobf;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;



/**
 *
 * @author afifi.store
 */
public class VALIDATION{
    
     public static boolean fileExists(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.err.println("Error: File '" + filename + "' not found.");
            return false;
        }
        return true;
    }
     
    
    
        public static boolean fileNotEmpty(String filename) {
        File file = new File(filename);
        if (!fileExists(filename)) return false;
        if (file.length() == 0) {
            System.err.println("Error: File '" + filename + "' is empty.");
            return false;
        }
        return true;
     
    }
     
         public static boolean SnotEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            System.err.println("Error: " + fieldName + " cannot be empty.");
            return false;
        }
        return true;
    }
         
         
       public static boolean isAlphabetic(String value, String fieldName) {
        if (!Pattern.matches("^[A-Za-z ]+$", value)) {
            System.err.println("Error: " + fieldName + " must contain only letters.");
            return false;
        }
        return true;
    }
       
           public static boolean isNumeric(String value, String fieldName) {
        if (!Pattern.matches("^[0-9]+$", value)) {
            System.err.println("Error: " + fieldName + " must contain only digits.");
            return false;
        }
        return true;
    }
         
     
        public static boolean validEmail(String email) {
        String pattern = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
        if (!Pattern.matches(pattern, email)) {
            System.err.println("Error: Invalid email format.");
            return false;
        }
        return true;
    }
        
           public static boolean validLength(String value, int min, int max, String fieldName) {
        if (value.length() < min || value.length() > max) {
            System.err.println("Error: " + fieldName + " must be between " + min + " and " + max + " characters.");
            return false;
        }
        return true;
    }
           
           
              public static boolean isPositive(int value, String fieldName) {
        if (value < 0) {
            System.err.println("Error: " + fieldName + " cannot be negative.");
            return false;
        }
        return true;
    }
              
        public static boolean isPositive(double value, String fieldName) {
        if (value < 0) {
            System.err.println("Error: " + fieldName + " cannot be negative.");
            return false;
        }
        return true;
    }
        
        
           public static boolean inRange(double value, double min, double max, String fieldName) {
        if (value < min || value > max) {
            System.err.println("Error: " + fieldName + " must be between " + min + " and " + max + ".");
            return false;
        }
        return true;
    }
           
            public static boolean validPrice(double price) {
        if (price <= 0) {
            System.err.println("Error: Price must be greater than zero.");
            return false;
        }
        return true;
    }
            
             public static boolean validQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Error: Quantity cannot be negative.");
            return false;
        }
        return true;
    }
             
         public static boolean validProductName(String name) {
        return notEmpty(name, "Product name")
                && isAlphabetic(name, "Product name")
                && validLength(name, 2, 30, "Product name");
    }        

    private static boolean notEmpty(String name, String product_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
              
        public static boolean validAge(int age) {
        if (age < 18 || age > 100) {
            System.err.println("Error: Age must be between 18 and 100.");
            return false;
        }
        return true;
    }
        
            public static boolean validSalary(double salary) {
        if (salary < 1000) {
            System.err.println("Error: Salary cannot be less than 1000.");
            return false;
        }
        return true;
    }
            
             public static boolean validPhone(String phone) {
        // Egyptian phone format ONLY /////////////////////////////
        String pattern = "^(\\+?2)?01[0-25][0-9]{8}$";
        if (!Pattern.matches(pattern, phone)) {
            System.err.println("Error: Invalid phone number format.");
            return false;
        }
        return true;
    }
          
           public static boolean validPassword(String password) {
        // at least 8 chars, one letter, one digit/////////////////////////////
        String pattern = "^(?=.*[A-Za-z])(?=.*\\d).{8,}$";
        if (!Pattern.matches(pattern, password)) {
            System.err.println("Error: Password must be at least 8 characters and include letters and digits.");
            return false;
        }
        return true;
    }
           
        public static boolean validUsername(String username) {
        String pattern = "^[A-Za-z0-9_]{3,15}$";
        if (!Pattern.matches(pattern, username)) {
            System.err.println("Error: Username must be 3–15 characters (letters, digits, underscores).");
            return false;
        }
        return true;
    }
        
        public static boolean confirmAction(String message) {
    System.out.print(message + " (y/n): ");
    try {
        char choice = (char) System.in.read();
        return (choice == 'y' || choice == 'Y');
    } catch (Exception e) {
        return false;
    }
}
public static boolean realisticPrice(double price) {
    if (price > 100000) {
        System.err.println("Error: Price is unrealistically high!");
        return false;
    }
    return true;
}
public static boolean confirmExit() {
    return confirmAction("Are you sure you want to exit?");
}
public static boolean validPosition(String position) {
    String[] validPositions = {"Manager", "Cashier", "Clerk", "Stock"};
    for (String p : validPositions) {
        if (p.equalsIgnoreCase(position)) return true;
    }
    System.err.println("Error: Invalid employee position.");
    return false;
}
public static boolean validCredit(double credit) {
    if (credit < 0) {
        System.err.println("Error: Customer credit cannot be negative.");
        return false;
    }
    return true;
}
public static boolean uniqueProductID(String id, List<String> existingIDs) {
    if (existingIDs.contains(id)) {
        System.err.println("Error: Product ID already exists.");
        return false;
    }
    return true;
}
             
     
   
}
