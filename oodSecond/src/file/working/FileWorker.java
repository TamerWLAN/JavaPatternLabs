package file.working;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class FileWorker {
    protected final List<Path> files;
    protected final Path targetFile;

    public FileWorker(final List<Path> files) {
        this.targetFile = files.get(files.size() - 1);
        this.files = files.stream().limit(files.size() - 1).toList();
    }

    public void handleFiles(/*final Path targetFile*/) {
        final var fileContents = openFiles(files);
        final var resultString = processFileContents(fileContents);
        writeResults(targetFile, resultString);
    }

    public final List<String> openFiles(final List<Path> fileNames) {
        return fileNames.stream().map(this::readFileContent).toList();
    }

    private String readFileContent(final Path fileName) {
        try {
            return Files.readString(fileName);
        } catch (final IOException ioe) {
            System.err.println(ioe.getMessage());
            return "";
        }
    }

    final void writeResults(final Path targetFile, final String resultString) {
        try {
            Files.writeString(targetFile, resultString);
        } catch (final IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

    abstract String processFileContents(final List<String> fileContents);
}
