package art.lab;

public class Main {
    public static void main(String[] args) {
        final TextHandler handler = new TextHandler();

        final String fileName = "src/files/input.txt";

        handler.setTextCoder(new AESTextCoder());
        System.out.println(handler.handleTextFrom(fileName, "tamerlanCoderKey"));

        handler.setTextCoder(new DESTextCoder());
        System.out.println(handler.handleTextFrom(fileName, "tamerlan"));

        handler.setTextCoder(new RSATextCoder());
        System.out.println(handler.handleTextFrom(fileName, ""));
    }
}