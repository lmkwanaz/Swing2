package Model;

public class checkintstr {

    //*******************************
    //   support methods
    //*******************************
    //Method to display the user's prompt string
    private static void printPrompt(String prompt) {
        System.out.print(prompt + " ");
        System.out.flush();
    }

    //Method to make sure no data is available in the
    //input stream
    private static void inputFlush() {
        int readman;
        int bAvail;

        try {
            while ((System.in.available()) != 0)
                readman = System.in.read();
        } catch (java.io.IOException e) {
            System.out.println("Input error");
        }
    }
    private static  String CheckString() {
        int aChar;
        String s = "";
        boolean aboutString = false;

        while (!aboutString) {
            try {
                aChar = System.in.read();
                if (aChar < 0 || (char) aChar == '\n')
                    aboutString = true;
                else if ((char) aChar != '\r')
                    s = s + (char) aChar;
            }

            catch (java.io.IOException e) {
                System.out.println("Input error");
                aboutString = true;
            }
        }
        return s;
    }

    public static int CheckInt(String prompt) {
        while (true) {
            inputFlush();
            printPrompt(prompt);
            try {
                return Integer.valueOf(CheckString().trim()).intValue();
            }

            catch (NumberFormatException e) {
                System.out.println("Invalid input. Not an integer");
            }
        }
    }
}
