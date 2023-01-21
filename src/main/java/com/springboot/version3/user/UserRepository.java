package com.springboot.version3.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author P.GHAFARBEIGI
 * @version 1.0
 * @since 1/21/2023
 */

@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByEmail(String email);
}
