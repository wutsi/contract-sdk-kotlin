package com.wutsi.contract.dto

import kotlin.collections.List

public data class SearchContractResponse(
  public val views: List<Contract> = emptyList()
)
