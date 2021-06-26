package com.sonnysappbakery.studychinese;

public class Lesson {
    private final int orderInCourse;
    private Sentence[] sentences;

    public Lesson(int orderInCourse, Sentence[] sentences) {
        this.orderInCourse = orderInCourse;
        this.sentences = sentences;
    }

    public int getOrderInCourse() {
        return orderInCourse;
    }

    public Sentence[] getSentences() {
        return sentences;
    }
}
