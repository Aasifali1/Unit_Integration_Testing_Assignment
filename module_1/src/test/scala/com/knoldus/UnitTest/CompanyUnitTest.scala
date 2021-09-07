package com.knoldus.UnitTest

import com.knoldus.ques3.models.Company
import com.knoldus.ques3.validator.{CompanyValidator, UserValidator}
import org.scalatest.flatspec.AsyncFlatSpec

class CompanyUnitTest extends AsyncFlatSpec {

  val companyValidator: CompanyValidator = new CompanyValidator()
  val userValidator = new UserValidator()

  val testComapny1: Company = Company("google", "google@google.com", "USA")
  val testComapny2: Company = Company("Knoldus", "knoldus14@gmail.com", "Noida")
  val testComapny3: Company = Company("TCS", "!!tcs123@tcs.com", "Noida")
  val testComapny4: Company = Company("Sony", "sonysony.hello", "Noida")

  // Company should not exists in database
  "Company" should " not be exists in Database" in {
    val result = companyValidator.IsValidCompany(testComapny1)
    assert(result)
  }

  "It " should "return false if company exists in Database" in {
    val result = companyValidator.IsValidCompany(testComapny2)
    assert(!result)
  }

  // Company email Validation
  "Email Id " should "be valid " in {
    val result= companyValidator.isValidEmail(testComapny2)
    assert(result)
  }

  "Email Id with wrong recipient" should "not be valid" in {
    val result = companyValidator.isValidEmail(testComapny3)
    assert(!result)
  }

  "Email Id without @" should "be invalid " in {
    val result= companyValidator.isValidEmail(testComapny4)
    assert(!result)
  }

  "Email Id with wrong top level domain " should "be invalid " in {
    val result= companyValidator.isValidEmail(testComapny4)
    assert(!result)
  }

}
