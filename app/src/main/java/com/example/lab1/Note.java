package com.example.lab1;
public  abstract class Note {
    protected String title;
    protected String content;
    protected String createdDate;

    public Note(){}
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    void getSummary(){
        System.out.println(this.title+" "+createdDate);
    }

}