public class UsedCar extends Car {

    private double mileage;
    private String used;

    public UsedCar(String make, String model,int year, double price, double mileage, String used) {
        super(make, model, year, price);
        this.mileage = mileage;
        this.used = used;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        used = used;
    }

    public double getMileage() {

        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /*
    extend the method: do the superclass version of
    method AND MORE
    */
    @Override
    public String toString(){
        return ("UsedCar: " + super.toString() + used + "/" + mileage);


}
}

