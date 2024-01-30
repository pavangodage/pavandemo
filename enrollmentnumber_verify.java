// Class declaration
 class PracticalNumber04 {
    
    // Method to verify the enrollment number
    public static boolean enrollVarifier(Character arr[]) {
        // Check if the length of the array is not equal to 10
        if (arr.length != 10) {
            return false; // Return false if the length is not 10
        }

        // Loop through each character in the array
        for (int i = 0; i < arr.length; i++) {
            // Check for the first 4 and last 3 characters
            if (i < 4 || (i >= arr.length - 3 && i < arr.length)) {
                // Check if the character is a digit
                boolean isDigit = Character.isDigit(arr[i]);
                // If it's not a digit, return false
                if (!isDigit) {
                    return false;
                }
            }

            // Check for characters between the 4th and 7th position
            if (i >= 4 && i < arr.length - 3) {
                // Check if the character is alphabetic
                boolean isAlphabetic = Character.isAlphabetic(arr[i]);
                // If it's not alphabetic, return false
                if (!isAlphabetic) {
                    return false;
                }
            }
        }

        // If all conditions pass, return true
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Sample enrollment number as an array of characters
        Character arr[] = {'2', '0', '2', '3', 'B', 'I', 'T', '5', '0', '1'};

        // Check if the enrollment number is verified using the enrollVarifier method
        if (enrollVarifier(arr)) {
            System.out.println("The Given Number is verified.");
        } else {
            System.out.println("The Given Number is NOT verified.");
        }
    }
}
