public class ManyToSingle implements SingleLines{
    private final ManyLines many;
    public ManyToSingle(final ManyLinesReal many) {
        this.many = many;
    }

    @Override
    public void getInitialsAndAge() {
        many.getFIO();
        many.getAge();
    }
}
