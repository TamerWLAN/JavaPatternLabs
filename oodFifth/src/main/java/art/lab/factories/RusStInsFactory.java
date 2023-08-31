package art.lab.factories;

import art.lab.products.Accident;
import art.lab.products.CASCO;
import art.lab.products.MTPL;
import art.lab.products.russianStateInsurance.RuStInsAccident;
import art.lab.products.russianStateInsurance.RuStInsCASCO;
import art.lab.products.russianStateInsurance.RuStInsMTPL;

public class RusStInsFactory implements InsuranceFactory {
    @Override
    public Accident createAccident(String insured, int period, String insurer) {
        return new RuStInsAccident(insured, period, insurer);
    }

    @Override
    public MTPL createMTPL(double price, int period, String insurer) {
        return new RuStInsMTPL(price, period, insurer);
    }

    @Override
    public CASCO creteCASCO(double protection, double price, int period, String insurer) {
        return new RuStInsCASCO(protection, price, period, insurer);
    }
}
