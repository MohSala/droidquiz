package com.demo.android.quiz.viewModel

import androidx.lifecycle.ViewModel
import com.demo.android.quiz.data.QuestionInfoProvider
import com.demo.android.quiz.data.QuizRepository

class MainViewModel(private val repository: QuizRepository): ViewModel() {

    private lateinit var  questionInfoProvider: QuestionInfoProvider

    fun prepopulateQuestions(){
        questionInfoProvider = QuestionInfoProvider()
        for (question in questionInfoProvider.questionList){
            repository.saveQuestion(question)
        }
        for (answer in questionInfoProvider.answerList){
            repository.saveAnswer(answer)
        }
    }

    fun clearQuestions() = repository.deleteQuestions()

}