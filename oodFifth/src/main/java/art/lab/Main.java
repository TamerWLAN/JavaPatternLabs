package art.lab;

import art.lab.factories.InsuranceFactory;
import art.lab.factories.RusStInsFactory;
import art.lab.factories.TinkoffFactory;
import art.lab.products.CASCO;

public class Main {
    public static void main(String[] args) {
        InsuranceFactory tinkoff = new TinkoffFactory();
        InsuranceFactory rusStIns = new RusStInsFactory();

        CASCO tinkoffCASCO = tinkoff.creteCASCO(500000.512, 10000, 12, "Козлитин Артём Павлович");
        CASCO rusStInsCASCO = rusStIns.creteCASCO(500000.512, 10000, 12, "Козлитин Артём Павлович");


        System.out.println(tinkoffCASCO.getStats());

        System.out.println("----------------------------");

        System.out.println(rusStInsCASCO.getStats());

    }
}