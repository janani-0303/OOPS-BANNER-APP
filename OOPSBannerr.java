public class OOPSBannerr {
    public static void main(String[] args) {

        // Array to store each line of the OOPS banner
        String[] lines = new String[7];

        // OOPS banner design
        lines[0] = String.join(" ", "  ****  ", "   ****  ", "******  ", "******   ");
        lines[1] = String.join(" ", "**    **", "**     **", "**    **", "**       ");
        lines[2] = String.join(" ", "**    **", "**     **", "**    **", "**       ");
        lines[3] = String.join(" ", "**    **", "**     **", "******  ", "  ****   ");
        lines[4] = String.join(" ", "**    **", "**     **", "**      ", "      ** ");
        lines[5] = String.join(" ", "**    **", "**     **", "**      ", "**    ** ");
        lines[6] = String.join(" ", "  ****  ", "   **** ", "**      ", " *****   ");

        // To Print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}