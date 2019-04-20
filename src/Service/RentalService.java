package Service;

import Domain.Rental;
import Repository.IRepository;

import java.util.List;

public class ReantalService {

    private IRepository<C> repository;

    public ReantalService(IRepository<Rental> repository) {
        this.repository = repository;
    }

    public void addOrUpdate(int idRental, int idCar, int numberofdays, int runnedkm, double billedprice) {
        Rental existing = repository.findById(idRental);
        if (existing != null) {
            // keep unchanged fields as they were
            if (idRental == 0) {
                idRental = existing.getId();
            }

            if (idCar == 0) {
                idCar = existing.getId();
            }

            if (numberofdays == 0) {
                numberofdays = existing.getId();
            }

            if (runnedkm == 0) {
                runnedkm = existing.getId();
            }
            if (billedprice == 0) {
                billedprice = existing.getId();
            }



            }
        }
        Rental rental = new Rental(idRental, idCar, numberofdays, runnedkm, billedprice);
        repository.upsert(rental);
    }

    public void remove(String id) {
        repository.remove(id);
    }

    public List<Rental> getAll() {
        return repository.getAll();
    }
}
