public class String_Method {
    public static void main(String[] args) {
        String str = " Hello, World! ";
        
        // Length of the string
        System.out.println("Length: " + str.length());
        
        // Convert to upper case
        System.out.println("Upper Case: " + str.toUpperCase());
        
        // Convert to lower case
        System.out.println("Lower Case: " + str.toLowerCase());
        
        // Trim whitespace
        System.out.println("Trimmed: '" + str.trim() + "'");
        
        // Substring
        System.out.println("Substring (7, 12): " + str.substring(7, 12));
        
        // Replace characters
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0'));
        
        // Check if string contains a substring
        System.out.println("Contains 'World': " + str.contains("World"));
        
        // Split the string
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
    
}
