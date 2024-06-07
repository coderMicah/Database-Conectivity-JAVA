package com.micah.JDBCLibraries.JDBC;

public class CourseModal {
    private long id;
    private String name;
    private String author;

    public CourseModal(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course [id: " + id + " course: " + name + " author:" + author + "]";
    }

}
