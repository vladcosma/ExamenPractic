package Domain;

public class CarValidator {


    public void validate(Car car) {

        int number = car.getId();
        String errors = "";
        if (car.getId() <= 0) {
            errors += "Id must be greater than 0!\n";
        }


        if (!errors.equals("")) {
            throw new RuntimeException(errors);
        }
    }
}

