package cipher;

public interface Cipher {

    String encrypt();
    String encrypt(String in, int shiftKey);
    String decrypt();
    String decrypt(String in, int shiftKey);
}
