package com.igorr.homework_3;

/**
 * Created by Igorr on 01.01.2018.
 */

public class Person {
    private String name;
    private String telNumber;
    private int photoId;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    //Конструктор класса
    public Person (String name, String telNumber, int photoId){
        this.name = name;
        this.telNumber = telNumber;
        this.photoId = photoId;
    }
}
