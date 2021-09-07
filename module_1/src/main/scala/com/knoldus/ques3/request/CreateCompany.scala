package com.knoldus.ques3.request

import com.knoldus.ques3.models.Company
import com.knoldus.ques3.validator.CompanyValidator

class CreateCompany (companyValidator: CompanyValidator){
  def createCompany(company:Company): Option[String] =
  {
    if (companyValidator.IsValidCompany(company))
      Option(company.name)
    else None
  }

}
