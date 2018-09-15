package example.dao;

import example.persistence.entities.RoleEntity;
import example.repository.HibernateRepositoryImpl;

public class RoleDaoImpl extends HibernateRepositoryImpl<Integer, RoleEntity>implements RoleDao {
}
