package art.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextHandler {
    private TextCoder coder;

    public void setTextCoder(final TextCoder coder) {
        this.coder = coder;
    }

    private String inputTextFromConsole() {
        final Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private String inputTextFromFile(final Path fileName) {
        try {
            return Files.readString(fileName);
        } catch (final IOException ioe) {
            System.err.println(ioe.getMessage());
            return "";
        }
    }

    private String getCodedText(final String text, final String key) {
        if (coder == null) {
            throw new RuntimeException("Coder, must be set");
        } else {
            return coder.getTheCipheredText(text, key);
        }
    }

    public final String handleTextFrom(final String path, final String key) {
        if (path.equals("")) {
            return getCodedText(inputTextFromConsole(), key);
        } else {
            return getCodedText(inputTextFromFile(Path.of(path)), key);
        }
    }

}
