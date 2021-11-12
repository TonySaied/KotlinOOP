class Student
{
    var ID: Int? =null
    var Name:String?=null
    var Age:Int?=null
    var AcademicYear:Int?=null
    var PreviousGrade:Int?=null
    var Class:Int?=null

    constructor(ID: Int?, Name: String?, Age: Int?, AcademicYear: Int?, PreviousGrade: Int?, Class: Int?) {
        this.ID = ID
        this.Name = Name
        this.Age = Age
        this.AcademicYear = AcademicYear
        this.PreviousGrade = PreviousGrade
        this.Class = Class
    }
    fun StudentData()
    {
        println("ID: $ID, Name: $Name, Age: $Age, Academic Year: $AcademicYear, Previous Grade: $PreviousGrade, Class: $Class")
        println("#################")
    }
}