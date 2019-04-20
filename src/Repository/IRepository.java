package Repository;

import Domain.Entity;

import java.util.List;

public interface IRepository<T extends Entity> {

    T findById(int id);
    void upsert(T car);

    void remove(String id);
    List<T> getAll();
}
