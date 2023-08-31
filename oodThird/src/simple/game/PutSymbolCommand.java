package simple.game;

public class PutSymbolCommand implements Command {
    final private char symbol;
    final private Field field;
    final private int xPos;
    final private int yPos;
    final static private char undoSymbol = '_';
    PutSymbolCommand(char symbol, Field field, int x, int y) {
       this.symbol = symbol;
        this.field = field;
        xPos = x;
        yPos = y;
    }
    @Override
    public void Execute() {
        field.put(symbol, xPos, yPos);
    }

    @Override
    public void Undo() {
        field.put(undoSymbol, xPos, yPos);
    }
}
