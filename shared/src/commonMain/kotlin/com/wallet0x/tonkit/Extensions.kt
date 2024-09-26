package com.wallet0x.tonkit

import com.wallet0x.tonkit.TonTransaction
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

val TonTransaction.transfers: List<Transfer>
    get() = Json.decodeFromString(transfersJson)
