package simple.game;

import java.util.Scanner;

public class GameInterface {
    final private Game game;
    public GameInterface() {
        this.game = new Game(new Field());
    }

    final public void letsPlay() {
        System.out.println(" Первый ход X, второй 0 ");

        final char[] players = new char[]{'X', 'O'};
        final Scanner sc = new Scanner(System.in);

        int i = 0;
        int xPos = 0, yPos = 0;
        int cmd;
        State state = State.working;

        do {
            System.out.println(game.getField());


            do {
                System.out.println(" Выберите действие:\n 1 - походить за " + players[(i % 2)] + "\n 2 - откатить команду");
                cmd = sc.nextInt();
            } while (cmd > 2 || cmd < 1 || (cmd == 2 && game.haveNotCommands()));

            if(cmd == 1) {
                do {
                    System.out.println(" Введите выберите место для хода");
                    xPos = sc.nextInt();
                    yPos = sc.nextInt();
                } while (!game.cellIsEmpty(xPos, yPos));

                state = game.playerMove(xPos, yPos, players[i]);
                i = ((i + 1) % 2);
            } else {
                game.undoMove();
            }

            System.out.println("-------------------------------");
        }while (state == State.working);

        if(state == State.somebodyWin) {
            System.out.println(" Победил: " + players[(i + 1) % 2]);
        } else {
            System.out.println(" Ничья");
        }

        System.out.println(game.getField());
    }
}
