package dea;

import java.security.SecureRandom;
import java.util.Random;

public class RandomTextGenerator {
    /**
     * Generate random text with the given number of words.
     *
     * @param numberOfWords the number of words that should be generated
     * @return A random text of the given number of words
     */
    public String generateText(int numberOfWords) {
        String returnValue = "";

        for (int i = 0; i < numberOfWords; i++) {
            returnValue = returnValue + generateSentence().concat(" ");
        }

        return returnValue.trim();
    }

    private String generateSentence() {
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();

        int length = new Random().nextInt(20) + 10;

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString().trim();
    }
}
