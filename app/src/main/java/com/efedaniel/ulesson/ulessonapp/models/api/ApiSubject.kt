package com.efedaniel.ulesson.ulessonapp.models.api

import android.os.Parcelable
import com.efedaniel.ulesson.ulessonapp.models.local.LocalSubject
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class ApiSubject(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("chapters")
    val chapters: List<ApiChapter>
)

fun ApiSubject.toLocalSubject() = LocalSubject(
    id = id,
    name = name,
    icon = icon
)