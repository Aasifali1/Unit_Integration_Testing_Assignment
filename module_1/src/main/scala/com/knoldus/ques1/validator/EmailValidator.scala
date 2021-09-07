package com.knoldus.ques1.validator

class EmailValidator {
  // checking if email is valid by matching the regular expression
  def emailIdIsValid(emailId: String): Boolean = {
    """^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.)+(com|net|org)""".r.unapplySeq(emailId).isDefined
  }
}
