package com.expensetrackerapplication.Repository;

import com.expensetrackerapplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
