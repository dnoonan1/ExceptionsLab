package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String msg;
        do {
            String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
            try {
                String lastName = app.extractLastName(fullName);
                msg = "Your last name is: " + lastName;
                break;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Try again!");
            }
        } while(true);
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public String extractLastName(String fullName)
            throws IllegalArgumentException {
        
        // First, throw an Exception if fullName is null or empty
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            
            // Divide fullName into tokens separated by space
            String[] nameParts = nameParts = fullName.split(" ");
            
            // If fullname doesn't have two tokens, throw an Exception
            if (nameParts.length != 2) {
                throw new IllegalArgumentException();
            }
            
            // Return the second of two tokens (the last name)
            return nameParts[1];
            
        }
    }

}
