package lesson14_CustomClass.practices;

public class SalaryCalculator {

    public double hourlyRate;
    public double weeklyHours;
    public int stateTaxRate;
    public int federalTaxRate;

    public void setInfo(double hourlyRate, double weeklyHours, int stateTaxRate, int federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double calculateSalary(){
        return hourlyRate*weeklyHours*52;

    }
    public double calculateStateTax(){
        return calculateSalary()*stateTaxRate/100;

    }
    public double calculateFederalTax(){
        return calculateSalary()*federalTaxRate/100;

    }
    public double calculateSalaryAfterTax(){
        return calculateSalary() - (calculateFederalTax() + calculateStateTax());

    }
    public String toString() {
        return "SalaryCalculator{" +
                "stateTax=" + calculateStateTax() +
                ", federalTax=" + calculateFederalTax() +
                ", salaryAfterTax=" + calculateSalaryAfterTax() +
                ", salary=" + calculateSalary() +
                '}';
    }
}
