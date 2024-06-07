// this file ensures that our repository run just after the app is launched
package com.micah.JDBCLibraries.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //create courses
        repository.insert(new CourseModal(1,"John Doe","Learn Data Structures"));
        repository.insert(new CourseModal(2,"Jane Doe","Learn AWS"));
        repository.insert(new CourseModal(3,"Jack Sparrow","Learn Pirating"));
        repository.insert(new CourseModal(4,"John Wick","Learn Karate"));
        repository.insert(new CourseModal(5,"Lady Gaga","Learn POP"));

        //delete course by id
        // repository.deleteById(2);

        //retrieve course by id
        System.out.println(repository.findById(3));
    }

}
