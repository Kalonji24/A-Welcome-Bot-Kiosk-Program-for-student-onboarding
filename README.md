# A-Welcome-Bot-Kiosk-Program-for-student-onboarding
This Java program simulates a self-service kiosk for generating temporary student cards during orientation week at CPUT.


# Features
1.User Input Collection: Gathers student's first name(s), last name, and student number.
2.Student Number Validation: 
   - Ensures input is numeric
   - Validates length is exactly 9 digits
   - Checks range is between 200000001 and 229999999
3.Initials Generation: Creates initials from first names
4.Email Generation: Constructs student email address
5.Summary Display: Prints formatted student information

# Validation Strategy
- Student Number: 
  - Uses try-catch for number parsing
  - Regex pattern for digit count and starting digit validation
  - Range check for valid CPUT student numbers
- Name Handling: 
  - Trims whitespace
  - Handles empty input
  - Properly processes multiple first names

# How to Use
1. Run the program
2. Follow prompts to enter your information
3. The system will validate your student number and display a summary
4. The data is ready to be sent to the card printer

