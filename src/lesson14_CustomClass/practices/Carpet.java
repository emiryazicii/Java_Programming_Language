package lesson14_CustomClass.practices;

public class Carpet {

    public double width , length, unitPrice;
    public boolean isPersian;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calculateCost(){
        if (isPersian){
            return  (width*length)*unitPrice + 200;
        }else {
            return (width * length) * unitPrice;
        }
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +" meters"+
                ", length=" + length +" meters"+
                ", unitPrice= $" + unitPrice +" per square meters"+
                ", isPersian=" + isPersian +
                ", total price= $"+calculateCost()+
                '}';
    }
}

/*
Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice


 */

