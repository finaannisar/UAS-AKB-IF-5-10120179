package com.finaannisar10120179.uasakbif_510120179;

import com.google.firebase.Timestamp;

//NIM   : 10120179
//Nama  : Fina Annisa Rahmasari
//Kelas : IF-5

public class Note {
    String title;
    String category;
    String content;
    Timestamp timestamp;

    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
