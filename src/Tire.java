public class Tire {

    private String brand;
    private int rim;

    public Tire(String brand, int rim) {
        this.brand = brand;
        this.rim = rim;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRim() {
        return rim;
    }

    public void setRim(int rim) {
        this.rim = rim;
    }

    public String toString() {
        return "Tire [brand=" + brand + ", \nrim inches=" + rim + "]";
    }
}
