package art.lab.handkers;

import java.util.List;

public class DocxHandler {

    private final List<String> docxApps;

    public DocxHandler() {
        docxApps = List.of("C:/Program Files/Microsoft Office/root/Office16/WINWORD.EXE", "write.exe");
    }

    public void handle(final String fileName) {
        System.out.format("\n\nДокумент %s, можно открыть с помощью: \n", fileName);
        docxApps.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        for (var app : docxApps) {
            try {
                ProcessBuilder builder = new ProcessBuilder(app, fileName);
                builder.start();
                System.out.format("Документ %s успешно открыт приложением %s\n", fileName, app);
                break;
            } catch (Exception e) {
                System.out.format("Приложение %s не найдено / либо некорректный путь\n", app);
            }
        }
    }
}
