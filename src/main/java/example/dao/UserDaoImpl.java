package example.dao;

import example.persistence.entities.RoleEntity;
import example.persistence.entities.UserEntity;
import example.repository.HibernateRepositoryImpl;

public class UserDaoImpl extends HibernateRepositoryImpl<Integer, UserEntity> implements UserDao {
}
