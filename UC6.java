public class UC6
    {

    public static void main(String[] args) {
        // UC6: Building the array by invoking static helper methods.
        String[] lines = {
            String.join("  ", getLine1O(), getLine1O(), getLine1P(), getLine1S()),
            String.join("  ", getLine2O(), getLine2O(), getLine2P(), getLine2S()),
            String.join("  ", getLine3O(), getLine3O(), getLine3P(), getLine3S()),
            String.join("  ", getLine4O(), getLine4O(), getLine4P(), getLine4S()),
            String.join("  ", getLine5O(), getLine5O(), getLine5P(), getLine5S()),
            String.join("  ", getLine6O(), getLine6O(), getLine6P(), getLine6S()),
            String.join("  ", getLine7O(), getLine7O(), getLine7P(), getLine7S())
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // --- Static Methods for Letter 'O' ---
    static String getLine1O() { return " ***** "; }
    static String getLine2O() { return "*     *"; }
    static String getLine3O() { return "*     *"; }
    static String getLine4O() { return "*     *"; }
    static String getLine5O() { return "*     *"; }
    static String getLine6O() { return "*     *"; }
    static String getLine7O() { return " ***** "; }

    // --- Static Methods for Letter 'P' ---
    static String getLine1P() { return " ***** "; }
    static String getLine2P() { return "*     *"; }
    static String getLine3P() { return "*     *"; }
    static String getLine4P() { return " ***** "; }
    static String getLine5P() { return "* "; }
    static String getLine6P() { return "* "; }
    static String getLine7P() { return "* "; }

    // --- Static Methods for Letter 'S' ---
    static String getLine1S() { return " ***** "; }
    static String getLine2S() { return "*      "; }
    static String getLine3S() { return "*      "; }
    static String getLine4S() { return " ***** "; }
    static String getLine5S() { return "           *"; }
    static String getLine6S() { return "           *"; }
    static String getLine7S() { return "      ***** "; }
}
