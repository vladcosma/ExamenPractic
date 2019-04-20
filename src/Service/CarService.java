package Service;

import Domain.Car;
import Repository.IRepository;

import java.util.List;

public class CarService {

    private IRepository<Car> repository;

    public CarService(IRepository<Car> repository) {
        this.repository = repository;
    }

    public void addOrUpdate(int id, int kilometraj, int numberofdays, String model, double billedprice) {
        Car existing = repository.findById(id);
        if (existing != null) {
            // keep unchanged fields as they were
            if (id == 0) {
                id = existing.getId();
            }

            if (kilometraj == 0) {
                kilometraj = existing.getId();
            }
            if (numberofdays == 0) {
                numberofdays = existing.getId();
            }

            if (model.isEmpty()) {
                model = existing.getModel();
            }


            if (billedprice == 0) {
                billedprice = existing.getBilledPrice();
            }
        }
        Car car = new Car(id, kilometraj, numberofdays, model, billedprice);
        repository.upsert(car);
    }

    public void remove(String id) {
        repository.remove(id);
    }

    public List<Car> getAll() {
        return repository.getAll();
    }
}
