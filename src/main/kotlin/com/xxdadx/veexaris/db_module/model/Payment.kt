package com.xxdadx.veexaris.db_module.model

import java.time.Instant

data class Payment(
    val totalAmount: Int,
    val currency: Currency,
    val subscriptionExpirationDate: Int,
    val isRecurring: Boolean,
    val isFirstRecurring: Boolean,
    val tgPaymentChargeId: String,
    val provPaymentChargeId: String,

    // Links
    val subOption: MutableList<String>,
    val invoice: String,

    val createdAt: Instant,
    val updatedAt: Instant,
)
