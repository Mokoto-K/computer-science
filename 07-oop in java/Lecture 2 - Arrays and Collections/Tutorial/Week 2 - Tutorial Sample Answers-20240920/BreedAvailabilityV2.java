/**
 * @author Dr Andreas Shepley (asheple2@une.edu.au | andreashepley01@gmail.com)
 * created for COSC120 (Trimester 1 2022)
 * last revised: Trimester 1 2024
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
/**
 * This program demonstrates creation and usage of ArrayLists and Sets
 * Re-enforces knowledge/usage of file loading, user input and nested if statements
 */
public class BreedAvailabilityV2 {

    /**
     * Re-enforces knowledge/usage of file loading and try-catch
     * Demonstrates creation of empty ArrayList, use of add and set methods to modify the Array
     * Demonstrates creation and use of Sets
     * Demonstrates use of Collections addAll and sort methods
     * @param args non required
     */
    public static void main(String[] args) {
        //load the file (using relative path if availableBreeds.txt is in the project repo)
        String filePath = "./availableBreeds.txt";
        Path path = Path.of(filePath);

        //read the lines of the file into a List of Strings
        String[] fileContents=null;
        try{ //use a try catch to make your program more user-friendly than with the throws keyword
            fileContents = Files.readString(path).toLowerCase().split(",");
        } catch (IOException e){
            System.out.println("File could not be loaded. Please check if path "+filePath+" is correct.");
            System.exit(0);
        }

        //create an ArrayList to store the breeds
        List<String> availableBreeds = new ArrayList<>();

        //add all the breeds to the new ArrayList
        Collections.addAll(availableBreeds, fileContents);

        System.out.println("List contents prior to modification: "+availableBreeds);

        //add the missing breeds
        availableBreeds.add("dalmatian");
        availableBreeds.add("greyhound");
        System.out.println("List contents after addition of dalmatian and greyhound: "+availableBreeds);

        //correct the spelling of rottweiler
        availableBreeds.set(1,"rottweiler");
        System.out.println("List contents after spelling correction: "+availableBreeds);

        //sort the array in alphabetical order
        Collections.sort(availableBreeds);
        System.out.println("List contents after sorting: "+availableBreeds);

        Set<String> availableBreedsHashSet = new HashSet<>(availableBreeds);
        System.out.println("Set contents (duplicates removed!): "+availableBreedsHashSet);

        Set<String> availableBreedsTreeSet = new TreeSet<>(availableBreeds);
        System.out.println("Set contents (in alphabetical order): "+availableBreedsTreeSet);

    }

}
