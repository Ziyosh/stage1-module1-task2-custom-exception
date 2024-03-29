package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{

    public StudentNotFoundException(String id) {
        super(String.format("Could not find student with ID %s", id));
    }

}
