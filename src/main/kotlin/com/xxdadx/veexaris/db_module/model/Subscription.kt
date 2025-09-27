package com.xxdadx.veexaris.db_module.model

import java.time.Instant

data class Subscription(

    // Links
    val status: SubscriptionStatus,
    val options: MutableList<SubscriptionOption>,

    val startDate: Instant? = null,
    val createdAt: Instant,
    val updatedAt: Instant,
)