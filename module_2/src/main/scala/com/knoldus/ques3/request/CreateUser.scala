package com.knoldus.ques3.request

import com.knoldus.ques3.models.User
import com.knoldus.ques3.validator.UserValidator

class CreateUser(userValidator: UserValidator) {
  def createUser(user: User): Option[String] = {
    if (userValidator.isValidUser(user))
      return Option(user.emailId)
    None
  }
}
