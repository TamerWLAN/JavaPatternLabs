package art.lab.handkers;

import org.apache.commons.io.FilenameUtils;

import java.nio.file.Files;
import java.nio.file.Path;

public class MainHandler {
    final TxtHandler txtHandler;
    final DocxHandler docxHandler;
    final PdfHandler pdfHandler;

    public MainHandler() {
        this.txtHandler = new TxtHandler();
        this.docxHandler = new DocxHandler();
        this.pdfHandler = new PdfHandler();
    }

    final public void handleTask(final String filename) {

        if (Files.exists(Path.of(filename))) {
            if (FilenameUtils.getExtension(filename).equals("txt")) {
                txtHandler.handle(filename);
            } else if (FilenameUtils.getExtension(filename).equals("docx")) {
                docxHandler.handle(filename);
            } else if (FilenameUtils.getExtension(filename).equals("pdf")) {
                pdfHandler.handle(filename);
            } else {
                System.out.println("НЕПОДДЕРЖИВАЕМОЕ РАЗРЕШЕНИЕ");
            }
        } else {
            throw new RuntimeException("Некорретный путь к файлу");
        }
    }
}
