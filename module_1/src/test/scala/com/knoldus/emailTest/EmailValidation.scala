package com.knoldus.emailTest

import com.knoldus.ques1.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidation extends AnyFlatSpec{

  val emailValidator = new EmailValidator()

  // Unit Test cases for Validation of Email
  "Email" should "be valid" in {
    val result = emailValidator.emailIdIsValid("Aasifabc123@example45.com")
    assert(result)
  }

  "Email Id" should "be Valid alphanumeric domain" in {
    val result = emailValidator.emailIdIsValid( "aasif@example12.net")
    assert(result)
  }

  "Email Id with wrong Recipient name" should "be invalid" in {
    val result = emailValidator.emailIdIsValid( "##aasif@yahoo.net")
    assert(!result)
  }

  "Email Id missing @ symbol" should "be invalid" in {
    val result = emailValidator.emailIdIsValid("aasif.com")
    assert(!result)
  }
  "Email Id with wrong domain name" should "be invalid" in {
    val result =emailValidator.emailIdIsValid("aasif@!yahoo.com")
    assert(!result)
  }
  "Email Id with wrong Top_Level Domain Name" should "be invalid" in {
    val result = emailValidator.emailIdIsValid("aasif@yahoo.ccom")
    assert(!result)
  }
}
