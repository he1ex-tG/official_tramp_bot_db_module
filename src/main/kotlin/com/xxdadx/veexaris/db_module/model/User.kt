package com.xxdadx.veexaris.db_module.model

import java.time.Instant

data class User(
    val tgUserId: Long,
    val tgFirstName: String,
    val tgLastName: String,
    val tgUsername: String,

    // Links
    val invoices: MutableList<Invoice>,
    val subscriptions: MutableList<Subscription>,

    val devices: MutableList<Device>,
    val createdAt: Instant,
    val updatedAt: Instant,
)