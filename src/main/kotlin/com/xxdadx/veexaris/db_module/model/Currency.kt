package com.xxdadx.veexaris.db_module.model

enum class Currency {

    XTR {
        override val displayName = "Telegram stars"
        override val code = "XTR"
        override val symbol = "⭐"
    };

    abstract val displayName: String
    abstract val code: String
    abstract val symbol: String

    companion object {

        fun fromCode(code: String): Currency? {
            return entries.find { it.code == code }
        }

    }

}
