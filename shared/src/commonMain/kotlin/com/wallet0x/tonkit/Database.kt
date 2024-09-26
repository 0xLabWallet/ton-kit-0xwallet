package com.wallet0x.tonkit

import app.cash.sqldelight.EnumColumnAdapter
import com.wallet0x.tonkit.TonTransaction

class Database(databaseDriverFactory: DriverFactory, databaseName: String) {
    private val database = KitDatabase(
        driver = databaseDriverFactory.createDriver(databaseName),
        TonTransactionAdapter = TonTransaction.Adapter(EnumColumnAdapter())
    )
    val transactionQuery = database.tonTransactionQueries
    val balanceQuery = database.tonBalanceQueries
}
