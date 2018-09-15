package example.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class HibernateRepositoryImpl<ID extends Serializable,T> implements HibernateRepository<ID,T>{
    private Class<T> persistenceClassName;
    public HibernateRepositoryImpl(){
        this.persistenceClassName= (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    private String getPersistenceClassName(){
        return persistenceClassName.getSimpleName();
    }

}
