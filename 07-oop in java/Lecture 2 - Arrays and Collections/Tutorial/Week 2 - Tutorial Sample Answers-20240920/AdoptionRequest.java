/**
 * @author Dr Andreas Shepley (asheple2@une.edu.au | andreashepley01@gmail.com)
 * created for COSC120 (Trimester 1 2022)
 * last revised: Trimester 1 2024
 */

import javax.swing.*;

public class AdoptionRequest {
    /**
     * program to request user criteria to adopt a dog
     * declaring variables, using exception handling
     * using while loops and decision structures
     * using JOptionPane and user input validation, e.g. input parsing
     * @param args none required
     */
    public static void main(String[] args) {
        //an alternative way of declaring variables
        int minAge = 0,maxAge = 20;
        int preferredMinAge = -1,preferredMaxAge=-1;
        String preferredBreed, preferredSex;
        String name, phoneNumber;
        boolean pureBred = false;

        //get user's choice of breed
        preferredBreed = JOptionPane.showInputDialog("Please enter your preferred dog breed: ");
        try{
            while(preferredBreed.length()==0) preferredBreed = JOptionPane.showInputDialog("Invalid input. Please enter a dog breed:");
        }
        catch (NullPointerException e){
            System.exit(0);
        }

        //get user's choice of purebred status
        String purebredChoice = JOptionPane.showInputDialog("Are you only willing to adopt a purebred (yes/no)?");
        try{
            while(purebredChoice.length()==0 || (!purebredChoice.equalsIgnoreCase("yes") && !purebredChoice.equalsIgnoreCase("no"))){
                purebredChoice = JOptionPane.showInputDialog("Invalid input. Are you only willing to adopt a purebred (yes/no)?");
                pureBred = purebredChoice.equalsIgnoreCase("yes"); //if user input is yes, set to true, otherwise, set to false
            }
        }
        catch (NullPointerException e){
            System.exit(0);
        }

        //get user's choice of sex
        preferredSex = JOptionPane.showInputDialog("Please enter your preferred sex (male, female or either).");
        if(preferredSex==null) System.exit(0);//an alternative to the try - catch
        while(preferredSex.length()==0 || (!preferredSex.equalsIgnoreCase("male") &&!preferredSex.equalsIgnoreCase("either") && !preferredSex.equalsIgnoreCase("female")))
            preferredSex = JOptionPane.showInputDialog("Invalid input. Please enter your preferred gender (male, female or either).");

        String userInput = JOptionPane.showInputDialog("What is the minimum age you'd like to adopt?");
        if(userInput==null) System.exit(0);//an alternative to the try - catch
        while (preferredMinAge < minAge || preferredMinAge>maxAge) { //keep requesting user input until it is valid
            try {
                preferredMinAge = Integer.parseInt(userInput); //ensure the user's entry is an integer
            }
            catch (NumberFormatException e) {
                //if the user entered a non-digit character, get them to re-enter, skip the rest of this iteration, and re-validate their entry
                userInput = JOptionPane.showInputDialog("Invalid input. What is the minimum age you'd like to adopt?");
                if(userInput==null) System.exit(0);  //if user closes/cancels, exit normally
                continue;
            }
            if(preferredMinAge<minAge || preferredMinAge>maxAge) { //if they entered a number, but it is outside the required range
                //get them to re-enter a value - this will then go back to the start of the loop and revalidate the new value
                userInput = JOptionPane.showInputDialog("Invalid input. Enter a min age value between "+minAge+" and "+maxAge);
                if(userInput==null) System.exit(0); //if user closes/cancels, exit normally
            }
        }

        //get user's choice of age range
        userInput = JOptionPane.showInputDialog("What is the maximum age you'd like to adopt?");
        if(userInput==null) System.exit(0);//an alternative to the try - catch
        while (preferredMaxAge < preferredMinAge || preferredMaxAge>maxAge) { //keep requesting user input until it is valid
            try {
                preferredMaxAge = Integer.parseInt(userInput); //ensure the user's entry is an integer
            }
            catch (NumberFormatException e) {
                //if the user entered a non-digit character, get them to re-enter, skip the rest of this iteration, and re-validate their entry
                userInput = JOptionPane.showInputDialog("Invalid input. What is the maximum age you'd like to adopt?");
                if(userInput==null) System.exit(0);  //if user closes/cancels, exit normally
                continue;
            }
            if(preferredMaxAge<preferredMinAge || preferredMaxAge>maxAge) { //if they entered a number, but it is outside the required range
                //get them to re-enter a value - this will then go back to the start of the loop and revalidate the new value
                userInput = JOptionPane.showInputDialog("Invalid input. Enter a max age value between "+preferredMinAge+" and "+maxAge);
                if(userInput==null) System.exit(0); //if user closes/cancels, exit normally
            }
        }

        //get user's contact details
        name = JOptionPane.showInputDialog("Please enter your name:");
        if(name==null) System.exit(0);//an alternative to the try - catch
        while(name.length()==0) name = JOptionPane.showInputDialog("Invalid input. Please enter your name:");

        userInput = JOptionPane.showInputDialog("Please enter your phone number: ");
        if(userInput==null) System.exit(0);//an alternative to the try - catch
        while(userInput.length()!=10) userInput = JOptionPane.showInputDialog("Invalid input. Please enter your phone number (10 digits, no whitespaces):");
        phoneNumber=userInput; //write code to check if the chars are actually digits!

        System.out.println("Adoption request details:\nName: "+name+"\nPhone number: "+phoneNumber+
                "\nPreferred breed: "+preferredBreed+"\nPurebred only: "+pureBred+"\nDesired gender: "+preferredSex+
                "\nAge range: "+preferredMinAge+"-"+preferredMaxAge);
    }
}