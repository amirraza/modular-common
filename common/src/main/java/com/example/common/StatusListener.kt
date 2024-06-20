package com.example.common

sealed class StatusListener {
    data object OnStart : StatusListener()
    class OnInProgress(percent: Int) : StatusListener()
    data object OnCompleted : StatusListener()
    class OnError(msg: String) : StatusListener()
}