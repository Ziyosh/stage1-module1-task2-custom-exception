package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{

    public StudentNotFoundException(String id) {
        super("Couldn't find student with ID {id}");
    }

}
