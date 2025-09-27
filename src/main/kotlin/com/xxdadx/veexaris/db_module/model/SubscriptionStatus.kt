package com.xxdadx.veexaris.db_module.model

enum class SubscriptionStatus(
    val code: String,
) {

    ACTIVE("active"),
    EXPIRED("expired"),
    CANCELLED("cancelled");

    companion object {

        fun fromCode(code: String): SubscriptionStatus? {
            return entries.find { it.code == code }
        }

    }

}