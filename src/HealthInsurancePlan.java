public abstract class HealthInsurancePlan {
    // Code for 'coverage' field goes here

    private double coverage;
    private InsuranceBrand offeredBy;

    public double getCoverage(){
        return coverage;
    }
    public void setCoverage(double coverage){
        this.coverage = coverage;
    }
    public InsuranceBrand getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(InsuranceBrand offeredBy) {
        this.offeredBy = offeredBy;
    }

    public abstract double computeMonthlyPremium(double salary, int age, boolean smoking);
}
