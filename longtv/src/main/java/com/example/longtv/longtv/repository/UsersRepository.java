/**
 * UsersRepository
 *
 * @author LONGTV
 * @version 1.0
 * @since Aug 21, 2024
 */
package com.example.longtv.longtv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.core.support.DefaultCrudMethods;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.example.longtv.longtv.entity.UsersEntity;

import jakarta.persistence.Id;

/**
 * @author LONGTV
 */
@Repository
public interface  UsersRepository extends JpaRepository<UsersEntity, Id> {
	
}
