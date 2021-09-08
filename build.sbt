name := "Unit-Integration-Tesing Assignment"

version := "0.1"

scalaVersion := "2.13.6"

lazy val Ques1andAues2 = project.in(file("module_1"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
      "org.mockito" %% "mockito-scala-scalatest" % "1.15.0" % Test,
      "org.mockito" % "mockito-core" % "1.9.5" % "test"
    )
  )

lazy val Ques3 = project.in(file("module_2"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
      "org.mockito" %% "mockito-scala-scalatest" % "1.15.0" % Test,
      "org.mockito" % "mockito-core" % "1.9.5" % "test"
    )
  )

lazy val root = project.in(file(".")).aggregate(Ques1andAues2,Ques3)