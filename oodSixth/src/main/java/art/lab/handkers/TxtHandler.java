package art.lab.handkers;

import java.util.List;

public class TxtHandler {
    private final List<String> txtApps;

    public TxtHandler() {
        txtApps = List.of("notepad", "nano");
    }

    public void handle(final String fileName) {
        System.out.format("\n\nФайл %s, можно открыть с помощью: \n", fileName);
        txtApps.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        for (var app : txtApps) {
            try {
                ProcessBuilder builder = new ProcessBuilder(app, fileName);
                builder.start();
                System.out.format("Текстовый файл %s успешно открыт приложением %s\n", fileName, app);
                break;
            } catch (Exception e) {
                System.out.format("Приложение %s не найдено / либо некорректный путь\n", app);
            }
        }
    }
}
