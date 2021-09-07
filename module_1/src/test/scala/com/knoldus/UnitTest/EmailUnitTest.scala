package com.knoldus.UnitTest

import com.knoldus.ques1.validator.EmailValidator
import org.scalatest.flatspec.AsyncFlatSpec

class EmailUnitTest extends AsyncFlatSpec {

  val emailValidator = new EmailValidator();

  //  Email Validation
  "User email Id " should "be valid " in {
    val result = emailValidator.emailIdIsValid("aasif@knoldus.com")
    assert(result)
  }

  "User email Id " should "be valid as it contains alphanumeric recipient name" in {
    val result = emailValidator.emailIdIsValid("aasif123@knoldus.com")
    assert(result)
  }

  "Email Id without @" should "be invalid " in {
    val result = emailValidator.emailIdIsValid("aasifknoldus.com")
    assert(!result)
  }

  "Email Id with alphanumeric domain name" should "be valid " in {
    val result = emailValidator.emailIdIsValid("aasif@knoldus145.com")
    assert(result)
  }

  "Email id" should "not be valid as it contains invalid top lavel domain" in {
    val result = emailValidator.emailIdIsValid("aasif@knoldus.knoldus")
    assert(!result)
  }

}
