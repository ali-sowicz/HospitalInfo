public class BlueCrossBlueShield implements InsuranceBrand{
    private long id;
    private String name;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
        if(insurancePlan instanceof PlatinumPlan){
            if(age > 55 && smoking){
                return 300;
            }if(age > 55 && !smoking){
                return 200;
            }if(age < 55 && smoking){
                return 100;
            }
        }
        if(insurancePlan instanceof GoldPlan){
            if(age > 55 && smoking){
                return 240;
            }if(age > 55 && !smoking){
                return 150;
            }if(age < 55 && smoking){
                return 90;
            }
        }
        if(insurancePlan instanceof SilverPlan){
            if(age > 55 && smoking){
                return 180;
            }if(age > 55 && !smoking){
                return 100;
            }if(age < 55 && smoking){
                return 80;
            }
        }
        if(insurancePlan instanceof BronzePlan){
            if(age > 55 && smoking){
                return 120;
            }if(age > 55 && !smoking){
                return 50;
            }if(age < 55 && smoking){
                return 70;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        User staff = new User();
        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
        HealthInsurancePlan insurancePlan = new SilverPlan();

        insurancePlan.setOfferedBy(insuranceBrand);
        staff.setInsurancePlan(insurancePlan);
        System.out.println(insurancePlan.computeMonthlyPremium(8000, 56,true));
    }
}
