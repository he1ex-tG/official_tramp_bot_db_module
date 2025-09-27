package com.xxdadx.veexaris.db_module.model

enum class OptionType(
    val code: String,
) {

    DURATION("duration"),
    DEVICE_COUNT("device_count");

    companion object {

        fun fromCode(code: String): OptionType? {
            return entries.find { it.code == code }
        }

    }

}
