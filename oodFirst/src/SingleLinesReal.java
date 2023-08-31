import java.util.Arrays;

public class SingleLinesReal implements SingleLines{
    private final String FIO;
    private final int age;
    public SingleLinesReal(final String FIO, final int age){
        this.FIO = FIO;
        this.age = age;
    }
    @Override
    public void getInitialsAndAge() {
        final var splits = Arrays.asList(FIO.split(" ")).subList(0, 1);
        splits.add(String.valueOf(age));
        final var result = String.join(" ", splits.stream().map(w -> w.substring(0,1)).toList());
        System.out.println(result);
    }
}