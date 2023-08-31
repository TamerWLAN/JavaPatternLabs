package art.lab.products.tinkoff;

import art.lab.products.MTPL;

public class TinkoffMTPL extends MTPL {
    public TinkoffMTPL(final double price, final int period, final String insurer) {
        super(price, period, insurer, 75);
    }

    @Override
    public String getStats() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Фирма страхователь - Тинькофф Страхование ").append("\n");
        sb.append(" Продукт - ОСАГО").append("\n");
        sb.append(" Страхователь : ").append(getInsurer()).append("\n");
        sb.append(" Стоимость : ").append(getPrice()).append("\n");
        sb.append(" Период страхования : ").append(getPeriod()).append("\n");
        sb.append(" Выплата от суммы ущерба (в процентах)").append(getPayments()).append("\n");
        return sb.toString();
    }
}
