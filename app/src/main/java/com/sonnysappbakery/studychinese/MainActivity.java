package com.sonnysappbakery.studychinese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] sentenceArray;
    List<String> sentenceList;
    List<List<String>> lessonList;
    int numberOfSentences;
    int numberOfLessons;
    int lessonNumber;

    ImageView imageView;
    TextView textView;
    EditText editText;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        scrollView = findViewById(R.id.scroll);

        sentenceArray = getResources().getStringArray(R.array.course);
        sentenceList = new ArrayList<>(Arrays.asList(sentenceArray));
        lessonList = new ArrayList<>();
        numberOfSentences = sentenceList.size();
        numberOfLessons = numberOfSentences / 10;
        lessonNumber = 1;

        int index = 0;
        for (int i = 0; i < numberOfLessons; i++) {
            List<String> lesson = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                lesson.add(sentenceList.get(index));
                index++;
            }
            lessonList.add(lesson);
        }

        imageView.setOnClickListener(v -> {
            String text = editText.getText().toString();
            try {
                lessonNumber = Integer.parseInt(text);
            } catch(NumberFormatException e) {
                return;
            }
            editText.setText("");
            scrollView.fullScroll(View.FOCUS_UP);
            updateLesson(lessonNumber);
        });

        updateLesson(1);
    }

    public void updateLesson(int lessonNumber) {
        if(lessonNumber < 1) lessonNumber = 1;
        else if(lessonNumber > numberOfLessons) lessonNumber = numberOfLessons;
        String text = getString(R.string.lesson_number) + lessonNumber + " of " + numberOfLessons;
        textView.setText(text);

        textView1.setText(sentenceList.get((lessonNumber - 1) * 10));
        textView2.setText(sentenceList.get(1 + (lessonNumber - 1) * 10));
        textView3.setText(sentenceList.get(2 + (lessonNumber - 1) * 10));
        textView4.setText(sentenceList.get(3 + (lessonNumber - 1) * 10));
        textView5.setText(sentenceList.get(4 + (lessonNumber - 1) * 10));
        textView6.setText(sentenceList.get(5 + (lessonNumber - 1) * 10));
        textView7.setText(sentenceList.get(6 + (lessonNumber - 1) * 10));
        textView8.setText(sentenceList.get(7 + (lessonNumber - 1) * 10));
        textView9.setText(sentenceList.get(8 + (lessonNumber - 1) * 10));
        textView10.setText(sentenceList.get(9 + (lessonNumber - 1) * 10));
    }
}