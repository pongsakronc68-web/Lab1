package com.example.lab1;
import java.util.ArrayList;
import java.util.List;

public class Checklist extends Note {
    private List<String> item;
    private List<Boolean> status;

    public Checklist(String title, String content){
        super(title, content);
        this.item = new ArrayList<>();
        this.status = new ArrayList<>();
    }



    public List<String> getItem() {
        return item;
    }

    public List<Boolean> getStatus() {
        return status;
    }
    public void addItem(String newitem) {
        item.add(newitem);
        status.add(false);
    }
}
