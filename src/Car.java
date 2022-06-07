public class Car {
    
    private String brand,model;
    private int fabricYear, modelYear;
    private Tire tire1, tire2, tire3, tire4, spare;
   

    public String toString() {
        return "Year of fabrication = " + fabricYear + ", \nYear of the model = " + modelYear + ", \nBrand = " + brand + ", \nModel = "
                + model + ", \nSpare = " + spare + ", \nTire 1 = " + tire1 + ", \nTire 2 = " + tire2 + ", \nTire 3 = " + tire3
                + ", \nTire 4 = " + tire4 + "\n\n";
    }

    public Car(String brand, String model, int fabricYear, int modelYear, Tire tire1, Tire tire2, Tire tire3,
            Tire tire4, Tire spare) {
        this.brand = brand;
        this.model = model;
        this.fabricYear = fabricYear;
        this.modelYear = modelYear;
        this.tire1 = tire1;
        this.tire2 = tire2;
        this.tire3 = tire3;
        this.tire4 = tire4;
        this.spare = spare;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFabricYear() {
        return fabricYear;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFabricYear(int fabricYear) {
        this.fabricYear = fabricYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

}
