package com.simple.app.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simple.app.entities.UserEntity;


@Repository
public interface  UserRepository extends JpaRepository<UserEntity, Long>{

}


