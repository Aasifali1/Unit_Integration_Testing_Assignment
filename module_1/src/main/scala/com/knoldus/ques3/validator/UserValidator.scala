package com.knoldus.ques3.validator

import com.knoldus.ques1.validator.EmailValidator
import com.knoldus.ques3.db.{CompanyRead, UserRead}
import com.knoldus.ques3.models.{Company, User}

class UserValidator {
  def isValidUser(user: User): Boolean = {
    // company should exist in db
    val userRead = new UserRead()

    val companyRead = new CompanyRead()
    val dbResult: Option[Company] = companyRead.getCompanyByName(user.companyName)

    if (dbResult.isDefined)
      return true
    false
  }


    // email should be valid
    def isValidEmail(user: User): Boolean ={
      val emailValidator = new EmailValidator()
      val emailValidatorResult = emailValidator.emailIdIsValid(user.emailId)

      if(emailValidatorResult)
        return true
      false
    }

}
