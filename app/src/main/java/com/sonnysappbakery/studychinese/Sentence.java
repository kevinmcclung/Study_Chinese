package com.sonnysappbakery.studychinese;

public class Sentence {
    private final int orderInLesson;
    private final String chinese;
    private final String pinyin;
    private final String translation;

    public Sentence(int orderInLesson, String chinese, String pinyin, String translation) {
        this.orderInLesson = orderInLesson;
        this.chinese = chinese;
        this.pinyin = pinyin;
        this.translation = translation;
    }

    public int getOrderInLesson() {
        return orderInLesson;
    }

    public String getChinese() {
        return chinese;
    }

    public String getPinyin() {
        return pinyin;
    }

    public String getTranslation() {
        return translation;
    }
}
