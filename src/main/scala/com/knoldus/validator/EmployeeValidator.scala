package com.knoldus.validator

import com.knoldus.models.Employee
import com.knoldus.db.Employees

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    val empName= new Employees
    for((key,value)<-empName.totalEmp){
      if( value == employee)
        return true
    }
    return false

  }
}

object checkEmployee{
  val emp2: Employee =  Employee("Rahul","Kumar",40,35000,"Software Engineer","Knoldus","rahul.kumar@knoldus.com")
  val obj = new EmployeeValidator()
  println(obj.employeeIsValid(emp2))
}

