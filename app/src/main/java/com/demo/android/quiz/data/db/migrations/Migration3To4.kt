package com.demo.android.quiz.data.db.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class Migration3To4: Migration(3, 4) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE questions_new (question_id INTEGER NOT NULL," +
                "text TEXT NOT NULL, " +
                "difficulty TEXT NOT NULL, " +
                "category TEXT NOT NULL, " +
                "PRIMARY KEY (question_id))"
        )

        database.execSQL("CREATE INDEX index_questions_new_question_id ON questions_new(question_id)")
        database.execSQL("INSERT INTO questions_new (question_id, text, difficulty, category) SELECT question_id, text, difficulty, category FROM questions")
        database.execSQL("DROP TABLE questions")
        database.execSQL("ALTER TABLE questions_new RENAME TO questions")
    }
}