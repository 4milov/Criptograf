public class CipherCaesar {
    private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz ";

    public static String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (char aChar : message.toCharArray()) {
            int index = ALPHABET.indexOf(aChar);
            if (index >= 0) {
                char charAt = 0;
                int newIndex = (index + key) % ALPHABET.length();
                charAt = newIndex < 0 ? ALPHABET.charAt(ALPHABET.length() + newIndex) : ALPHABET.charAt(newIndex);
                result.append(charAt);
            }
        }
        return result.toString();
    }

    public static String decrypt(String message, int key) {
        return encrypt(message, key * (-1));
    }
}
