package com.xxdadx.veexaris.db_module.model

import java.time.Instant

data class DigitalGoods(
    val name: String,
    val shortName: String,
    val description: String,

    // Links
    val prices: List<Price>,
    val options: List<Option>,

    val type: DigitalGoodsType,
    val isActive: Boolean,
    val createdAt: Instant,
    val updatedAt: Instant,
)
