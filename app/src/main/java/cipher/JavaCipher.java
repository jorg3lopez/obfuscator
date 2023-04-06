package cipher;

public class JavaCipher implements Cipher{
    private String message;
    private final String ALPHABETLOWERCASE= "abcdefghijklmnopqrstuvwxyz";
    private final int KEY = 7;

    public JavaCipher() {

    }
    public JavaCipher(String message) {
        this.message = message;
    }

    @Override
    public String encrypt() {
        return this.encrypt(this.message,this.KEY);
    }

    @Override
    public String encrypt(String in, int shiftKey) {

        StringBuffer encryptedMessage = new StringBuffer();
        byte [] message = in.getBytes();

        for (byte letter : message) {

            // check if it is a space
            if (letter == ' ') {
                encryptedMessage.append((char)letter);
                continue;
            }

            // encrypt lowercase
            if (letter <= 122 && letter >= 97) {
                encryptedMessage.append(encryptCharacter(letter, shiftKey));
            }

            // encrypt uppercase
            if (letter <= 90 && letter >= 65) {
                byte lower = (byte)(letter + 32);
                encryptedMessage.append((char)(encryptCharacter(lower, shiftKey) - 32));
            }

        }

        return encryptedMessage.toString();
    }

    private char encryptCharacter(byte letter, int shiftKey) {
        // original position
        int originalPos = (letter - 97);

        // new position
        int index = (originalPos + shiftKey) % 26;

        return ALPHABETLOWERCASE.charAt(index);
    }

    @Override
    public String decrypt() {
        return this.decrypt(this.message,this.KEY);
    }

    @Override
    public String decrypt(String in, int shiftKey) {
        return null;
    }
}
