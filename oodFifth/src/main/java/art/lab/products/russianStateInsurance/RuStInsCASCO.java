package art.lab.products.russianStateInsurance;

import art.lab.products.CASCO;

public class RuStInsCASCO extends CASCO {

    public RuStInsCASCO(final double protection, final double price, final int period, final String insurer) {
        super(protection, price, period, insurer, 70);
    }

    @Override
    public String getStats() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Фирма страхователь - Рос. Гос. Страх ").append("\n");
        sb.append(" Продукт - КАСКО").append("\n");
        sb.append(" Страхователь : ").append(getInsurer()).append("\n");
        sb.append(" Стоимость : ").append(getPrice()).append("\n");
        sb.append(" Период страхования (в месяцах) : ").append(getPeriod()).append("\n");
        sb.append(" Максимальная сумма покрытия : ").append(getProtection()).append("\n");
        sb.append(" Выплата от суммы ущерба (в процентах) ").append(getPayments()).append("\n");
        return sb.toString();
    }
}
