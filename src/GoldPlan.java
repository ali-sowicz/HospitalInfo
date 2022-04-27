public class GoldPlan extends HealthInsurancePlan{

    @Override
    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return  salary*0.07 + getOfferedBy().computeMonthlyPremium(this,age,smoking);
    }
}
