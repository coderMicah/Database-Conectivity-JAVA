package com.micah.JDBCLibraries.JDBC;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRepository {

    @Autowired
    private JdbcTemplate template;

    private static String INSERT_QUERY = """
             insert into Course (id,name,author)
             values(?,?,?)
            """;
    private static String SELECT_QUERY = """
             select * from Course
             where id = ?
            """;
    private static String SELECT_ALL_QUERY = """
             select * from Course
            """;
    private static String DELETE_QUERY = """
             delete from Course
             where id = ?
            """;

    // CREATE A NEW ENTITY
    public void insert(CourseModal course) {
        template.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    // GET A SINGLE ENTITY FROM DB
    public List<Map<String, Object>> findAll() {
        return template.queryForList(SELECT_ALL_QUERY, new BeanPropertyRowMapper<>(CourseModal.class));
    }

    // GET A SINGLE ENTITY FROM DB
    public CourseModal findById(long id) {
        return template.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(CourseModal.class), id);
    }

    // DELETE AN ENTITY BASED ON ITS ID
    public void deleteById(long id) {
        template.update(DELETE_QUERY, id);
    }

}
