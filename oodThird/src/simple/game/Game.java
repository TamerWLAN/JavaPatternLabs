package simple.game;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    final private Field field;
    final private Deque<Command> commands;
    public Game(Field field) {
        this.field = field;
        commands = new LinkedList<>();
    }
    final public State playerMove(int xPos, int yPos, char playerSymbol) {
        Command command = new PutSymbolCommand(playerSymbol, field, xPos, yPos);
        command.Execute();
        commands.add(command);
        return field.checkState();
    }
    final public boolean cellIsEmpty(int xPos, int yPos) {
        return field.isEmpty(xPos, yPos);
    }
    final public void undoMove() {
        commands.pop().Undo();
    }
    final public boolean haveNotCommands() {
        return commands.isEmpty();
    }
    final public String getField() {
        return field.getBoard();
    }
}
