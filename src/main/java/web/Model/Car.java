package web.Model;

public class Car {
    private String car_brand;
    private String car_model;
    private int car_yer;

    public Car(String car_brand, String car_model, int car_yer) {
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_yer = car_yer;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public int getCar_yer() {
        return car_yer;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setCar_yer(int car_yer) {
        this.car_yer = car_yer;
    }
}
