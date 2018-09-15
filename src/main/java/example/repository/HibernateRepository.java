package example.repository;

import java.io.Serializable;
import java.util.List;

public interface HibernateRepository<ID extends Serializable,T> {
    List<T> findAll();
    T fiById(ID id);
    ID save(T t);
    void update(T t);
    void delete(ID id);
}
