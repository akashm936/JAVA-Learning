// 
class AssignmentLoop {
    public static void main(String[] args) {
        //int rows = 4; // Number of rows in the pattern

        for (int i = 0; i < 4; i++) {
            // Print spaces
            for (int j = 0; j < 4 -i; j++) {
                System.out.print("  "); // Adjust the number of spaces based on the row number
            }

            // Print asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
