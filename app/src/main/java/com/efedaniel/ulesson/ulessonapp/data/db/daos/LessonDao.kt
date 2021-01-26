package com.efedaniel.ulesson.ulessonapp.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.efedaniel.ulesson.ulessonapp.models.local.LocalChapter
import com.efedaniel.ulesson.ulessonapp.models.local.LocalLesson
import com.efedaniel.ulesson.utils.Constants.DatabaseKeys

@Dao
interface LessonDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertLesson(lesson: LocalLesson)

    @Delete
    suspend fun delete(lesson: LocalLesson)

    @Query("DELETE FROM ${DatabaseKeys.LESSON_TABLE_NAME} WHERE id = :lessonID")
    suspend fun delete(lessonID: Int)

    @Query("DELETE FROM ${DatabaseKeys.LESSON_TABLE_NAME} WHERE subject_id = :subjectID")
    suspend fun removeSubjectLessons(subjectID: Int)

    @Query("SELECT * FROM ${DatabaseKeys.LESSON_TABLE_NAME} where chapter_id = :chapterID")
    suspend fun getChapterLessons(chapterID: Int): List<LocalLesson>

}