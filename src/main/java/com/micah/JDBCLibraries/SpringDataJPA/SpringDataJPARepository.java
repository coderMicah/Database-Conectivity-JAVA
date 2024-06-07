package com.micah.JDBCLibraries.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJPARepository extends JpaRepository<Course, Long> {

}
