package model;

public class cesar_cipher {

    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char originalChar = text.charAt(i);
            char encryptedChar;
            
            if (Character.isLetter(originalChar)) {
                char base = Character.isUpperCase(originalChar) ? 'A' : 'a';
                encryptedChar = (char) (base + (originalChar - base + shift) % 26);
            } else {
                encryptedChar = originalChar;
            }
            
            encryptedText.append(encryptedChar);
        }
        
        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, int shift) {
        return encrypt(encryptedText, 26 - shift);
    }
    
}