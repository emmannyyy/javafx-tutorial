public class Duke {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * generates a response for the users' chat message;
     * @param input as the user's input String
     * @return returns a response, confirming that duke heard the input
     */
    public String getResponse(String input) {
        return "Duke heard: " + input;
    }
}

