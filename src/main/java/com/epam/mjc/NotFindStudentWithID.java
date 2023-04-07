package com.epam.mjc;

public class NotFindStudentWithID extends IllegalArgumentException{

    public NotFindStudentWithID(String s) {
        super(s);
    }
}
