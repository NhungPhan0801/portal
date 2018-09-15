package example.dao;

import example.persistence.entities.RoleEntity;
import example.repository.HibernateRepository;

public interface RoleDao extends HibernateRepository<Integer, RoleEntity> {
}
