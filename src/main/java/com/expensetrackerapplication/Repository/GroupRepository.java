package com.expensetrackerapplication.Repository;

import com.expensetrackerapplication.Model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
