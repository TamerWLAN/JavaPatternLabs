package file.working;

import java.nio.file.Path;
import java.util.List;

public final class UppercaseFileHandler extends FileWorker {
    public UppercaseFileHandler(List<Path> files) {
        super(files);
    }
    @Override
    protected final String processFileContents(final List<String> fileContents)  {
        return String.join("\n", fileContents).toUpperCase();
    }
}
