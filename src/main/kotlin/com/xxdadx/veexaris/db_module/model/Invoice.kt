package com.xxdadx.veexaris.db_module.model

import java.time.Instant

data class Invoice(
    val totalAmount: Int,
    val amount: Int,
    val discount: Discount,
    val currency: Currency,

    // Links
    val userId: String,
    val payment: Payment,
    val dGoods: DigitalGoods,

    val createdAt: Instant,
    val updatedAt: Instant,
)
