package com.example.manager_user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.manager_user.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findAll();
	User save(User user);
	void deleteById(long id);
	@Query(value = "SELECT * FROM USER U WHERE U.NAME LIKE %:name%", nativeQuery = true )
	List<User> findAllByName(@Param("name") String name);
	User findById(long id);
}
