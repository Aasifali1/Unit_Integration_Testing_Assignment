package com.knoldus.integrationTest

import com.knoldus.ques3.models.{Company, User}
import com.knoldus.ques3.validator.{CompanyValidator, UserValidator}
import org.scalatest.flatspec.AsyncFlatSpec

class IntegrationTesting extends AsyncFlatSpec{

  // Testing CompanyImplementation and CompanyValidation

  val companyValidator: CompanyValidator = new CompanyValidator()
  val userValidator = new UserValidator()

  val testComapny1: Company = Company("infosys", "sony@sony.com", "Noida")
  val testComapny2: Company = Company("Knoldus", "knoldus14@gmail.com", "Noida")
  val testComapny3: Company = Company("Sony", "sony$123@sony.hi", "Noida")
  val testComapny4: Company = Company("Sony", "sonysony.com", "Noida")

  val user1: User = User("Aasif Ali", "aasif@gmail.com", "Noida", "Knoldus")
  val user2: User = User("Akshit", "akshit@gmail.coom", "Noida", "TCS")
  val user3: User = User("Gulfam", "sony$123@sony.com", "Noida", "Accenture")

  // Company should not exists in database
  "Company" should " not be valid as it exists in Database" in {
    val result = companyValidator.IsValidCompany(testComapny1)
    assert(result)
  }

  "Company" should "not be exists in Database" in {
    val result = companyValidator.IsValidCompany(testComapny2)
    assert(!result)
  }

  // Email Validation
  "Email Id " should "be valid " in {
    val result= companyValidator.isValidEmail(testComapny2)
    assert(result)
  }

  "Email Id with wrong top level domain" should "not be valid" in {
    val result = companyValidator.isValidEmail(testComapny3)
    assert(!result)
  }

    "Email Id without @" should "be invalid " in {
      val result= companyValidator.isValidEmail(testComapny4)
      assert(!result)
    }

  // Testing the UserImplementation and User Validation
  "User" should " be valid as user company it exists in Database" in {
    val result = userValidator.isValidUser(user1)
    assert(result)
  }


  // USer Email Validation

  "User email Id " should "be valid " in {
    val result = userValidator.isValidEmail(user1)
    assert(result)
  }

  "User email id" should "not be valid as it contains invalid top lavel domain" in {
    val result = userValidator.isValidEmail(user2)
    assert(!result)
  }

}