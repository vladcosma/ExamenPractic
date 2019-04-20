package Domain;

public class RentalValidator implements IValidator<Rental> {

    public void validate(Rental transaction) {
        if (transaction.getIdCar() <= 0) {
            throw new RuntimeException("The car number must be at least 1.");
        }
    }
}