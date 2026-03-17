import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Function to render the banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5; // number of rows in each character

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Banner word
        String bannerWord = "OOPS";

        // Render banner
        renderBanner(bannerWord, patternMap);
    }
}