package com.wallet0x.tonkit

import kotlinx.coroutines.flow.StateFlow

expect class ConnectionManager {
    val isConnectedFlow: StateFlow<Boolean>

    fun start()
    fun stop()
}
