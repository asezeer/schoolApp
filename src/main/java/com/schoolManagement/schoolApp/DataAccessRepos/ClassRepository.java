package com.schoolManagement.schoolApp.DataAccessRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schoolManagement.schoolApp.Entities.Class;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
