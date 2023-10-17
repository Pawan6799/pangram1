# pangram1
public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase(); 

        boolean[] letters = new boolean[26]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true; 
            }
        }

        for (boolean letter : letters) {
            if (!letter) {
                return false; 
            }
        }

        return true; 
    }
}

