// this file ensures that our repository run just after the app is launched
package com.micah.JDBCLibraries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.micah.JDBCLibraries.SpringDataJPA.Course;
import com.micah.JDBCLibraries.SpringDataJPA.SpringDataJPARepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private JDBCRepository repository;

    // @Autowired
    // private JPARepository repository;

    @Autowired
    private SpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {

        // create courses with jdbc or jpa
        // repository.insert(new CourseModal(1, "John Doe", "Learn Data Structures"));
        // repository.insert(new CourseModal(2, "Jane Doe", "Learn AWS"));
        // repository.insert(new CourseModal(3, "Jack Sparrow", "Learn Pirating"));
        // repository.insert(new CourseModal(4, "John Wick", "Learn Karate"));
        // repository.insert(new CourseModal(5, "Lady Gaga", "Learn POP"));

        //creating courses with springJPA
        repository.save(new Course(1, "John Doe", "Learn Data Structures"));
        repository.save(new Course(2, "Jane Doe", "Learn AWS"));
        repository.save(new Course(3, "Jack Sparrow", "Learn Pirating"));
        repository.save(new Course(4, "John Wick", "Learn Karate"));
        repository.save(new Course(5, "Lady Gaga", "Learn POP"));

        // delete course by id
        // repository.deleteById(2l);

        // retrieve course by id
        System.out.println(repository.findById(3l));

        // retrieve all courses
        System.out.println("\n\n Get all Courses \n" + repository.findAll());
    }

}
