package art.lab.products.russianStateInsurance;

import art.lab.products.Accident;

public class RuStInsAccident extends Accident {
    public RuStInsAccident(final String insured, final int period, final String insurer) {
        super(insured, period, insurer, 50);
    }

    @Override
    public String getStats() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Фирма страхователь - Рос. Гос. Страх.").append("\n");
        sb.append(" Продукт - страховка от несчастного случая").append("\n");
        sb.append(" Страхователь : ").append(getInsurer()).append("\n");
        sb.append(" Застрахованное лицо : ").append(getInsured()).append("\n");
        sb.append(" Период страхования : ").append(getPeriod()).append("\n");
        sb.append(" Выплата от суммы ущерба (в процентах)").append(getPayments()).append("\n");
        return sb.toString();
    }
}
