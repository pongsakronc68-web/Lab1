package com.example.lab1;

public class TextNote extends Note{
    protected String content;
    public TextNote() {
        super();
    }
    public TextNote(String title, String content) {
        super(title, content);
    }
    public String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }

    public String display() {
        System.out.println("Text Note: " + getTitle());
        System.out.println("Content: " + content);
        return "";
    }
}