package Service;

import Domain.Car;

import Domain.Rental;
import Repository.IRepository;

import java.util.List;

public class TransactionService {

    private IRepository<Rental> transactionRepository;
    private IRepository<Car> carRepository;

    public TransactionService(IRepository<Rental> transactionRepository, IRepository<Car> carRepository) {
        this.transactionRepository = transactionRepository;
        this.carRepository = carRepository;
    }

    public Rental addOrUpdate(int id, int idRental, int idCar, int numberofdays, int runnedkm,, double billedprice,  String model, ) {
        Rental existing = transactionRepository.findById(id);
        if (existing != null) {
            // keep unchanged fields as they were
            if (id == 0) {
                id = existing.getId()
            }
            if (numberofdays == 0) {
            numberofdays = existing.getNumberofdays();
            }
            if (model.isEmpty())
                model = existing.getModel;
        }

        Car carRented = carRepository.findById(idCar);
        if (carRented == null) {
            throw new RuntimeException("There is no car with the given id!");
        }
        double billedPrice = carRented.getBilledPrice();


        Rental transaction = new Rental(idRental, idCar, numberofdays,  runnedkm,  billedprice );
        transactionRepository.upsert(transaction);
        return transaction;
    }

    public void remove(String id) {
        transactionRepository.remove(id);
    }

    public List<Rental> getAll() {
        return transactionRepository.getAll();
    }
}
