package com.theironyard.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by jeffryporter on 7/1/16.
 */
public class Review
{
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private boolean isGood;

    @ManyToOne
    private Lecturer lecturer;

    public Review()
    {
    }

    public Review(String author, String comment, boolean isGood, Lecturer lecturer)
    {
        this.author = author;
        this.comment = comment;
        this.isGood = isGood;
        this.lecturer = lecturer;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public boolean isGood()
    {
        return isGood;
    }

    public void setGood(boolean good)
    {
        isGood = good;
    }

    public Lecturer getLecturer()
    {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer)
    {
        this.lecturer = lecturer;
    }
}
