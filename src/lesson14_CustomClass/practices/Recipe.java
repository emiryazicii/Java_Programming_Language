package lesson14_CustomClass.practices;

public class Recipe {

    public String name;
    public String ingredients;
    public int servingSize;
    public double cost;

    public void setInfo(String name, String  ingredients, int servingSize, double cost) {
        this.name = name;
        this.ingredients = ingredients;
        this.servingSize = servingSize;
        this.cost = cost;
    }

    public double costPerPerson(){
        return cost / servingSize ;
    }

    public String toString() {
        return "Recipe for "+name+" will require these ingredients:\n"+ ingredients+"\nDish will serve "+servingSize+
                " and cost a total of $"+cost+" to make.";
    }
}
