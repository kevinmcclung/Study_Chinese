package com.sonnysappbakery.studychinese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] sentenceArray;
    List<String> sentenceList;
    List<List<String>> lessonList;
    int numberOfSentences;
    int numberOfLessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceArray = getResources().getStringArray(R.array.course);
        sentenceList = new ArrayList<>(Arrays.asList(sentenceArray));
        lessonList = new ArrayList<>();
        numberOfSentences = sentenceList.size();
        numberOfLessons = numberOfSentences / 10;

        int index = 0;
        for(int i=0; i<numberOfLessons; i++) {
            List<String> lesson = new ArrayList<>();
            for(int j=0; j<10; j++) {
                lesson.add(sentenceList.get(index));
                index++;
            }
            lessonList.add(lesson);
        }
    }
}