package example.dao;

import example.persistence.entities.UserEntity;
import example.repository.HibernateRepository;

public interface UserDao extends HibernateRepository<Integer, UserEntity> {
}
