package com.example.common

sealed class Status {
    data object OnStart : Status()
    class OnInProgress(percent: Int) : Status()
    data object OnCompleted : Status()
    class OnError(msg: String) : Status()
}