package com.AUT.test1.repository;

import com.AUT.test1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<User, String> {}
