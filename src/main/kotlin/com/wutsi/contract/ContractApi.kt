package com.wutsi.contract

import com.wutsi.contract.dto.SearchContractResponse
import feign.RequestLine

public interface ContractApi {
  @RequestLine("GET /v1/contracts/active")
  public fun active(): SearchContractResponse
}
