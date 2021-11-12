class Teacher
{
    var ID: Int? =null
    var Name:String?=null
    var Age:Int?=null
    var GraduationDegree:String?=null
    var GraduationYear:Int?=null
    var YearsOfExperience:Int?=null
    var SubjectHeTeaches:String?=null

    constructor(
        ID: Int?,
        Name: String?,
        Age: Int?,
        GraduationDegree: String?,
        GraduationYear: Int?,
        YearsOfExperience: Int?,
        SubjectHeTeaches: String?
    ) {
        this.ID = ID
        this.Name = Name
        this.Age = Age
        this.GraduationDegree = GraduationDegree
        this.GraduationYear = GraduationYear
        this.YearsOfExperience = YearsOfExperience
        this.SubjectHeTeaches = SubjectHeTeaches
    }
    fun TeacherData()
    {
        println("ID: $ID, Name: $Name, Age: $Age, Graduation Year: $GraduationYear, Graduation Degree: $GraduationDegree, Years of Experience: $YearsOfExperience, Subject: $SubjectHeTeaches")
        println("#################")
    }
    fun IsSuperVisor(): Boolean {
        return YearsOfExperience!! >5
        return false
    }
}