package com.wutsi.contract

import com.wutsi.contract.dto.SearchContractResponse
import feign.Param
import feign.RequestLine
import java.time.LocalDate

public interface ContractApi {
  @RequestLine("GET /v1/contracts/active?date={date}")
  public fun active(@Param("date") date: LocalDate? = null): SearchContractResponse
}
