package com.xxdadx.veexaris.db_module.model

enum class DigitalGoodsType(
    val code: String,
) {

    SUBSCRIPTION("subscription"),
    SUBSCRIPTION_OPTION("subscription_option");

    companion object {
        fun fromCode(code: String): DigitalGoodsType? {
            return entries.find { it.code == code }
        }
    }

}
