package art.lab.handkers;

import java.util.List;

public class PdfHandler {
    private final List<String> pdfApps;

    public PdfHandler() {
        pdfApps = List.of("C:/Program Files (x86)/Adobe/Acrobat Reader DC/Reader/AcroRd32.exe");
    }

    public void handle(final String fileName) {
        System.out.format("\n\nДокумент PDF %s, можно открыть с помощью: \n", fileName);
        pdfApps.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        for (var app : pdfApps) {
            try {
                ProcessBuilder builder = new ProcessBuilder(app, fileName);
                builder.start();
                System.out.format("Документ PDF %s успешно открыт приложением %s\n", fileName, app);
                break;
            } catch (Exception e) {
                System.out.format("Приложение %s не найдено / либо некорректный путь\n", app);
            }
        }
    }
}
