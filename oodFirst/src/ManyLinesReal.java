
public class ManyLinesReal implements ManyLines{
    private final String FIO;
    private final int age;
    public ManyLinesReal(final String FIO,final int age) {
        this.FIO = FIO;
        this.age = age;
    }
    @Override
    public void getFIO() {
        System.out.println(FIO);
    }
    @Override
    public void getAge() {
        System.out.println(age);
    }
}