package art.lab.factories;

import art.lab.products.Accident;
import art.lab.products.CASCO;
import art.lab.products.MTPL;
import art.lab.products.tinkoff.TinkoffAccident;
import art.lab.products.tinkoff.TinkoffCASCO;
import art.lab.products.tinkoff.TinkoffMTPL;

public class TinkoffFactory implements InsuranceFactory {
    @Override
    public Accident createAccident(String insured, int period, String insurer) {
        return new TinkoffAccident(insured, period, insurer);
    }

    @Override
    public MTPL createMTPL(double price, int period, String insurer) {
        return new TinkoffMTPL(price, period, insurer);
    }

    @Override
    public CASCO creteCASCO(double protection, double price, int period, String insurer) {
        return new TinkoffCASCO(protection, price, period, insurer);
    }
}
