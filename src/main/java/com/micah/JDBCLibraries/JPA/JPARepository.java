package com.micah.JDBCLibraries.JPA;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JPARepository {

    @PersistenceContext
    private EntityManager entityManager;

    // CREATE 
    public void insert(CourseModal course) {
        entityManager.merge(course);
    }

    // GET 
    public CourseModal findById(long id) {
        return entityManager.find(CourseModal.class, id);
    }

    // DELETE 
    public void deleteById(long id) {
        CourseModal course = entityManager.find(CourseModal.class, id);
        entityManager.remove(course);
    }

}
