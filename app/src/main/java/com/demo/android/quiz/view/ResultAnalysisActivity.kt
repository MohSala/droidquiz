package com.demo.android.quiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.demo.android.quiz.R

class ResultAnalysisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_analysis)
        val questionsAndAnswers = arrayOf(
            "Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"
        )

        val adapter = ArrayAdapter<String>(this,
            R.layout.activity_list_view, R.id.textview, questionsAndAnswers);

        val listView = findViewById<ListView>(R.id.mobile_list);
        listView.adapter = adapter;
    }


}