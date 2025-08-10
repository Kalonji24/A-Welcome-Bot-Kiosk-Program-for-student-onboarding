package prac01_question2_223234095;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WelcomeBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Meet & Greet
        System.out.println("Welcome to Cape Peninsula University of Technology!");
        System.out.println("Please enter your first name(s):");
        String firstNames = sc.nextLine().trim();
        
        System.out.println("Please enter your last name:");
        String lastName = sc.nextLine().trim();
        
        System.out.println("Please enter your student number:");
        int studentNo = getValidStudentNumber(sc);
        
        // Step 3: Build Personal Identifiers
        String initials = getInitials(firstNames);
        String email = studentNo + "@mycput.ac.za";
        String nameBlock = initials + " " + lastName;
        
        // Step 4: Display Confirmation Slip
        printSummary(nameBlock, studentNo, email);
    }
    
    private static int getValidStudentNumber(Scanner sc) {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                int number = Integer.parseInt(input);
                
                // Validate with regex pattern
                Pattern pattern = Pattern.compile("^2[0-2][0-9]{7}$");
                Matcher matcher = pattern.matcher(input);
                
                if (matcher.matches() && number >= 200000001 && number <= 229999999) {
                    return number;
                } else {
                    System.out.println("Invalid student number. Must be 9 digits between 200000001 and 229999999.");
                    System.out.println("Please enter a valid student number:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                System.out.println("Please enter your student number:");
            }
        }
    }
    
    private static String getInitials(String firstNames) {
        if (firstNames.isEmpty()) {
            return " ";
        }
        
        StringBuilder initials = new StringBuilder();
        String[] names = firstNames.split("\\s+");
        
        for (String name : names) {
            if (!name.isEmpty()) {
                initials.append(name.charAt(0));
            }
        }
        
        return initials.toString().toUpperCase();
    }
    
    private static void printSummary(String nameBlock, int studentNo, String email) {
        System.out.println("\n--- Temporary Student Card Summary ---");
        System.out.println("Initials and surname: " + nameBlock);
        System.out.println("Student number: " + studentNo);
        System.out.println("Student email: " + email);
    }
}