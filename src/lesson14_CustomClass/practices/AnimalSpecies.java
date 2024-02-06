package lesson14_CustomClass.practices;

public class AnimalSpecies {

    public String name;
    public double population, growthRate;

    public void setInfo(String name, double population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }
    public int calculateInYears(int year){

        for (int i = 0; i < year; i++) {
            population *= (1+(growthRate/100));
        }
        return (int) (population*1_000_000);
    }

    public String toString() {
        return "The "+name+" currently has a population of "+population+" million\nThe growth rate is sitting around "+growthRate+
                " %, so we predict the population in 5 years will be : "+calculateInYears(5);

    }
}
