package com.android254.droidconke19.datastates

sealed class Result<out T : Any>{
data class Success<out T : Any>(val data: T) : Result<T>()
data class Error(val exception: String?) : Result<Nothing>()
}