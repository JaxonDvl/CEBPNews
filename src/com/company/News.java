package com.company;

import java.util.Date;

public class News {
    private String author;
    private String infoSource;
    private Date publishedDate;
    private Date modifiedDate;
    private String textMessage;


    public News(String author, String infoSource, Date publishedDate, Date modifiedDate, String textMessage) {
        this.author = author;
        this.infoSource = infoSource;
        this.publishedDate = publishedDate;
        this.modifiedDate = modifiedDate;
        this.textMessage = textMessage;
    }

    @Override
    public String toString() {
        return "News{" +
                "author='" + author + '\'' +
                ", infoSource='" + infoSource + '\'' +
                ", publishedDate=" + publishedDate +
                ", modifiedDate=" + modifiedDate +
                ", textMessage='" + textMessage + '\'' +
                '}';
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
