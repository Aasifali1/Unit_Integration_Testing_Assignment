package com.knoldus.ques3.db

import com.knoldus.ques3.models.User

import scala.collection.immutable.HashMap

class UserRead {
  val user1: User = User("Aasif Ali", "knoldus@gmail.com", "Noida", "Knoldus")
  val user2: User = User("Mayank", "knoldus@gmail.com", "Noida", "Infosys")

  val users: HashMap[String, User] = HashMap("user1" -> user1, "user2" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)
}