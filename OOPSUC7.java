class CharacterPatternMap {

    char character;
    String[] pattern;

    CharacterPatternMap(char c, String[] p) {
        character = c;
        pattern = p;
    }
}

public class OOPSUC7 {

    static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return maps;
    }

    static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (int i = 0; i < maps.length; i++) {
            if (maps[i].character == ch) {
                return maps[i].pattern;
            }
        }
        return maps[3].pattern;
    }

    static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                String[] pattern = getCharacterPattern(message.charAt(j), maps);
                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();
        printMessage("OOPS", maps);
    }
}