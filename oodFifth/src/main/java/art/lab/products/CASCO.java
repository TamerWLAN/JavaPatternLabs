package art.lab.products;

public abstract class CASCO {
    private final double protection;
    private final double price;
    private final int period;
    private final String insurer;
    private final int payments;

    public CASCO(final double protection, final double price, final int period, final String insurer, final int payments) {
        this.protection = protection;
        this.price = price;
        this.period = period;
        this.insurer = insurer;
        this.payments = payments;
    }

    public final double getProtection() {
        return protection;
    }

    public final double getPrice() {
        return price;
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
