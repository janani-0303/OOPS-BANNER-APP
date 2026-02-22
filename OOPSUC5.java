public class OOPSUC5 {

    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " ***** ", " ***** ", "*******", "****** "),
            String.join(" ", "**   **", "**   **", "**   **", "**    "),
            String.join(" ", "**   **", "**   **", "****** ", " ***** "),
            String.join(" ", "**   **", "**   **", "**     ", "     **"),
            String.join(" ", " ***** ", " ***** ", "**     ", " ******")
        };

        // Loop to print each line 
        for (String line : lines) {
            System.out.println(line);
        }
    }
}