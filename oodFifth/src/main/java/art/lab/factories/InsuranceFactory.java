package art.lab.factories;

import art.lab.products.Accident;
import art.lab.products.CASCO;
import art.lab.products.MTPL;

public interface InsuranceFactory {
    public Accident createAccident(final String insured, final int period, final String insurer);
    public MTPL createMTPL(final double price, final int period, final String insurer);
    public CASCO creteCASCO(final double protection, final double price, final int period, final String insurer);
}
