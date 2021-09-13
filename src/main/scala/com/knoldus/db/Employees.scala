package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("MuZakkir","Saifi",21,15000,"Intern","Knoldus","mohd.saifi@knoldus.com")
  val emp1 : Employee = Employee("Rahul","Kumar",40,35000,"Software Engineer","Knoldus","rahul.kumar@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}