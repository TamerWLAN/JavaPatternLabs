package art.lab.products.russianStateInsurance;

import art.lab.products.MTPL;

public class RuStInsMTPL extends MTPL {

    public RuStInsMTPL(final double price, final int period, final String insurer) {
        super(price, period, insurer, 60);
    }

    @Override
    public String getStats() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Фирма страхователь - Рос. Гос. Страх. ").append("\n");
        sb.append(" Продукт - ОСАГО").append("\n");
        sb.append(" Страхователь : ").append(getInsurer()).append("\n");
        sb.append(" Стоимость : ").append(getPrice()).append("\n");
        sb.append(" Период страхования : ").append(getPeriod()).append("\n");
        sb.append(" Выплата от суммы ущерба (в процентах)").append(getPayments()).append("\n");
        return sb.toString();
    }
}
