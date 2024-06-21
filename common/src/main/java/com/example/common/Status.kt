package com.example.common

sealed class Status {
    class OnStart(val message: String) : Status()
    class OnInProgress(val message: String, val percent: Int) : Status()
    class OnCompleted(val message: String) : Status()
    class OnError(val message: String) : Status()
}