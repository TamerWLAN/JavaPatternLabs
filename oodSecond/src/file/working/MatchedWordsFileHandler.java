package file.working;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class MatchedWordsFileHandler extends FileWorker {

    public MatchedWordsFileHandler(List<Path> files) {
        super(files);
    }

    @Override
    final protected String processFileContents(final List<String> fileContents) {
        final var fileContent = fileContents.get(0);
        final var isFileContains = fileContents.stream().map(content -> isWordMatched(content, fileContent)).toList();
        final var isWordMatched = files.stream().map(file ->  getMatchedFileName(file, isFileContains)).toList();

        return String.join("\n", isWordMatched.toString());
    }
    private String getMatchedFileName(final Path file, final List<Boolean> isFileContains) {
        return isFileContains.get(files.indexOf(file)) ? file.getFileName().toString() : "";
    }
    private boolean isWordMatched(final String target, final String anyFileContent) {
        return Arrays
                .stream(target.split(" "))
                .anyMatch(anyFileContent::contains);
    }
}
