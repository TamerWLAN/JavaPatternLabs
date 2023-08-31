import file.working.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Path> list = new ArrayList<>();
        list.add(Path.of("files/first"));
        list.add(Path.of("files/second"));
        list.add(Path.of("files/third"));
        list.add(Path.of("files/fourth"));
        UppercaseFileHandler firstHandler = new UppercaseFileHandler(list);
        MatchedWordsFileHandler secondHandler = new MatchedWordsFileHandler(list);
        firstHandler.handleFiles();
        //secondHandler.handleFiles();
    }
}