public class UC3 {
    public static void main(String[] args) {

        String name;

        // Check if argument is provided
        if (args.length == 0) {
            name = "World";   // default value
        } else {
            name = args[0];   // user input
        }

        System.out.println("Hello, " + name + "!");
    }
}