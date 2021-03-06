package com.wordpress.ilyaps.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TASK")
public class Task {
    @Id
    @Column(name = "TASKID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taskId;
    @ManyToOne
    @JoinColumn(name = "MEMBEREMAIL")
    private Member memberNeed;
    @ManyToOne
    @JoinColumn(name = "CATEGORYID")
    private Category category;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TEXT")
    private String text;
    @Column(name = "OPEN")
    private boolean isOpen = true;
    @Column(name = "COUNTWANTTOHELP")
    private int countWantToHelp = 0;
    @Column(name = "DATETIME_FIELD")
    private java.sql.Timestamp dateTimeField;

    public Timestamp getDateTimeField() {
        return dateTimeField;
    }

    public void setDateTimeField(Timestamp dateTimeField) {
        this.dateTimeField = dateTimeField;
    }

    public int getCountWantToHelp() {
        return countWantToHelp;
    }

    public void incCountWantToHelp() {
        countWantToHelp++;
    }

    public void setMemberNeed(Member memberNeed) {
        this.memberNeed = memberNeed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTaskId() {
        return taskId;
    }

    public Member getMemberNeed() {
        return memberNeed;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public boolean isOpen() {
        return isOpen;
    }



    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
