package art.lab;

import art.lab.handkers.MainHandler;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainHandler handler = new MainHandler();
        handler.handleTask("src/files/Exmaple.txt");

        handler.handleTask("src/files/Example.docx");

        handler.handleTask("src/files/Example.pdf");

    }
}