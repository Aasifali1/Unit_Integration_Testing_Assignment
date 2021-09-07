package com.knoldus.ques3.validator

import com.knoldus.ques1.validator.EmailValidator
import com.knoldus.ques3.db.CompanyRead
import com.knoldus.ques3.models.Company

class CompanyValidator {
  def IsValidCompany(company: Company): Boolean = {
    // company should not exist in db
    val companyRead = new CompanyRead()
    val dbResult: Option[Company] = companyRead.getCompanyByName(company.name)
    if (dbResult.isEmpty) return true

    false
  }

  def isValidEmail(company: Company): Boolean ={
    // email should be valid
    val emailValidator = new EmailValidator()
    val emailValidatorResult = emailValidator.emailIdIsValid(company.emailId)

    if(emailValidatorResult) return true

    false
  }
}
