package com.wutsi.contract.dto

import kotlin.Long
import kotlin.String

public data class Contract(
  public val id: Long = 0,
  public val userId: Long = 0,
  public val startDate: Long? = null,
  public val endDate: Long? = null,
  public val amount: Long = 0,
  public val currency: String = ""
)
