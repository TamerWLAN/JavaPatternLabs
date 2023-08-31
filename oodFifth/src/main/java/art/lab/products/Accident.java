package art.lab.products;

public abstract class Accident {
    private final int period;
    private final String insured;
    private final String insurer;

    private final int payments;

    public Accident(final String insured, final int period, final String insurer, final int payments) {
        this.insured = insured;
        this.period = period;
        this.insurer = insurer;
        this.payments = payments;
    }

    public final String getInsured() {
        return insured;
    }

    public final int getPeriod() {
        return period;
    }

    public final String getInsurer() {
        return insurer;
    }

    public final int getPayments() {
        return payments;
    }

    public abstract String getStats();
}
