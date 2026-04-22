package com.example.lab1;

public class Note {
    String title;
    String content;
    String created;

    void getSummary(){
        System.out.println(this.title);
        System.out.println(this.content+" "+this.created);
    }
}
