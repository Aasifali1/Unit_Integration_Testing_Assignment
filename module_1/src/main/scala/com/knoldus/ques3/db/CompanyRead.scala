package com.knoldus.ques3.db

import com.knoldus.ques3.models.Company

import scala.collection.immutable.HashMap

class CompanyRead {
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val tcsCompany: Company = Company("TCS", "tcs@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "TCS" -> tcsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)
}
