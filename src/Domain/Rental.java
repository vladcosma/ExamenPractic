package Domain;

import java.util.Objects;

public class Rental extends Entity {

    private int idRental, idCar, numberofdays, runnedkm;
    private double billedprice;
private String model;

    public Rental(int idRental, int idCar, int numberofdays, int runnedkm, double billedprice, String model) {
        super(idRental);
        this.idRental = idRental;
        this.idCar = idCar;
        this.numberofdays = numberofdays;
        this.runnedkm = runnedkm;
        this.billedprice = billedprice;
        this.model = model;
    }

    public Rental(int id) {
        super(id);
    }


    public double getIdCarsum() {
        return billedprice * numberofdays;
    }

    private int getIdRental() {
        return idRental;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id='" + getIdRental() + '\'' +
                ", numberOfDays='" + numberofdays + '\'' +
                ", model='" + getIdCar() + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), idRental, idCar, numberofdays, runnedkm, billedprice, );
    }


    public int getIdCar() {
        return idCar;
    }
}
    public int getNumberofdays() {
        return numberofdays;
    }
}



