package Domain;

public class Car extends Entity {
    private int id, kilometraj;
    private String model;
    private int numberOfDays;
    private String report;
    private double billedPrice;

    private boolean rentService;

    public Car(int id, int kilometraj, String model, int numberOfDays) {
        this(id, kilometraj, model, numberOfDays, "", 0);
        rentService = false;
    }

    public Car(int id, int kilometraj, int numberOfDays, String report, double billedPrice) {
        this.id = id;
        this.kilometraj = kilometraj;
        this.model = model;
        this.numberOfDays = numberOfDays;
        this.report = report;
        this.billedPrice = billedPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public void setKilometraj(int kilometraj) {
        this.kilometraj = kilometraj;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public double getBilledPrice() {
        return billedPrice;
    }

    public void setBilledPrice(double billedPrice) {
        this.billedPrice = billedPrice;
    }

    public boolean hasRentService() {
        return rentService;
    }

    public void setRentService(boolean rentService) {
        this.rentService = rentService;
    }
}
