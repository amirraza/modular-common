package com.example.common

interface ActionHandler {
    fun addStatusListener(listener: StatusListener)
    fun start()
    fun cancel()
    fun stop()
}