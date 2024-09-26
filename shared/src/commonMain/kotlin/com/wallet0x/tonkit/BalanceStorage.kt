package com.wallet0x.tonkit

import com.wallet0x.tonkit.TonBalanceQueries

class BalanceStorage(private val balanceQuery: TonBalanceQueries) {

    fun getBalance(): String {
        return balanceQuery.get().executeAsOneOrNull()?.value_ ?: "0"
    }

    fun setBalance(v: String) {
        balanceQuery.insert(v)
    }

}
