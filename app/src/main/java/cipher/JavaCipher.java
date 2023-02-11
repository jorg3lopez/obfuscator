package cipher;

public class JavaCipher implements Cipher{
    private String message;
    private String encryptedMessage;
    private String decryptedMessage;
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
        return null;
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
