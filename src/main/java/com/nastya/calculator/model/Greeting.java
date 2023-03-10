package com.nastya.calculator.model;

public class Greeting {
    private long id;
    private String content;

    public Greeting(long incrementAndGet) {
        id = incrementAndGet;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
