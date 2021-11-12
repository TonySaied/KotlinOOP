import com.sun.jdi.IntegerValue
import java.lang.Exception
import java.util.*
fun main()
{
    var sc=Scanner(System.`in`)
    //HARD CODED DATA
    //Teacher's Data
    var teacher1=Teacher(1,"Ahmed",27,"Good",2015,4,"Math")
    var teacher2=Teacher(2,"Wael",30,"V. Good",2012,7,"Biology")
    var teacher3=Teacher(3,"Hossam",23,"Excellent",2020,1,"English")
    var teacher4=Teacher(4,"Khalil",45,"Good",1997,24,"Arabic")
    //Adding Teachers to ArrayList
    val TeacherList = arrayListOf<Teacher >()
    TeacherList.add(teacher1)
    TeacherList.add(teacher2)
    TeacherList.add(teacher3)
    TeacherList.add(teacher4)
    //#####################################################################################################################################
    var Student1=Student(1,"Ahmed",12,6,70,2)//At 6th Grade
    var Student2=Student(2,"Gamal",12,6,90,2)//At 6th Grade
    var Student3=Student(3,"Sherif",14,8,60,3)//At 2 Prep Grade= 8th Year
    var Student4=Student(4,"Emad",14,8,65,3)//At 2 Prep Grade=8th Year
    var Student5=Student(5,"Khaled",16,10,71,1)//at 1 secondary = 10th year
    var Student6=Student(6,"Amir",16,10,93,1)//at 1 secondary = 10th year
    var Student7=Student(7,"Maher",17,11,90,2)//at 2 secondary = 11th year
    var Student8=Student(7,"Akram",17,11,80,2)//at 2 secondary = 11th year
    //Adding Students to ArrayList
    val StudentList = arrayListOf<Student>()
    StudentList.add(Student1)
    StudentList.add(Student2)
    StudentList.add(Student3)
    StudentList.add(Student4)
    StudentList.add(Student5)
    StudentList.add(Student6)
    StudentList.add(Student7)
    StudentList.add(Student8)
    //#####################################################################################################################################
    val class1 = arrayListOf("Mr "+TeacherList[0].Name,StudentList[0].Name,StudentList[0].PreviousGrade,StudentList[1].Name,StudentList[1].PreviousGrade)
    val class2 = arrayListOf("Mr "+TeacherList[1].Name,StudentList[2].Name,StudentList[2].PreviousGrade,StudentList[3].Name,StudentList[3].PreviousGrade)
    val class3 = arrayListOf("Mr "+TeacherList[2].Name,StudentList[4].Name,StudentList[4].PreviousGrade,StudentList[5].Name,StudentList[5].PreviousGrade)
    val class4 = arrayListOf("Mr "+TeacherList[3].Name,StudentList[6].Name,StudentList[6].PreviousGrade,StudentList[7].Name,StudentList[7].PreviousGrade)
    //Start of Program
    println("Hello,Sign in with your Name and Password")

    //Manager's name: manager , password:manager , 1 Manager
    //Teacher's name: {name} , password: {name} , Multiple Teachers
    println("Type t if you are a teacher, m if you are The manager ")
    var tOrM=sc.next()

    if (tOrM.equals("m"))
    {
        print("Name: ")
        var name=sc.next()
        print("Password: ")
        var password=sc.next()
        if(name.equals("manager") && password.equals("manager"))
        {
            println("You are the Application Manager, What do you want to do? ")
            println("Press 1: Add, Edit, Delete or View Teachers? ")
            println("Press 2: Add, Edit, Delete or View Students? ")
            println("Press 3: Assign Teachers to Class")
            println("Press 3: Assign Teachers to Class")
            println("Press 4: Add or remove supervisor")
            println("Press 5: Change Student Class")
            var Pressed=sc.nextInt()
            if(Pressed.equals(1))
            {
                println("Add, Edit, Delete or View Teachers? ")
                var choice=sc.next()
                if(choice.equals("add"))
                {
                    print("Teacher's ID: ")
                    var AddedTeacherID=sc.nextInt()
                    print("Teacher's Name: ")
                    var AddedTeacherName=sc.next()
                    print("Teacher's Age: ")
                    var AddedTeacherAge=sc.nextInt()
                    print("Teacher's Graduation Degree: ")
                    var AddedTeacherGradDegree=sc.next()
                    print("Teacher's Graduation Year: ")
                    var AddedTeacherGradYear=sc.nextInt()
                    print("Teacher's Years of Experience: ")
                    var AddedTeacherYearsOfExperience=sc.nextInt()
                    print("Teacher's Subject: ")
                    var AddedTeacherSubject=sc.next()
                    var TeacherAdded= Teacher(AddedTeacherID,AddedTeacherName,AddedTeacherAge,AddedTeacherGradDegree,
                        AddedTeacherGradYear,AddedTeacherYearsOfExperience,AddedTeacherSubject)
                    TeacherList.add(TeacherAdded)
                    println("Congrats, The new Teacher is added")
                }
                else if(choice.equals("Edit"))
                {
                    println("Enter Teacher's ID: ")
                    var EditTeacherID=sc.nextInt()
                    for ( i in 0..TeacherList.size-1)
                    {
                        try{
                            if(EditTeacherID.equals(TeacherList[i].ID))
                            {
                                println("Teacher is found")
                                println("Enter Teacher's new data")
                                //Re-Entering Data
                                print("Teacher's ID: ")
                                TeacherList[i].ID=sc.nextInt()
                                print("Teacher's Name: ")
                                TeacherList[i].Name=sc.next()
                                print("Teacher's Age: ")
                                TeacherList[i].Age=sc.nextInt()
                                print("Teacher's Graduation Degree: ")
                                TeacherList[i].GraduationDegree=sc.next()
                                print("Teacher's Graduation Year: ")
                                TeacherList[i].GraduationYear=sc.nextInt()
                                print("Teacher's Years of Experience: ")
                                TeacherList[i].YearsOfExperience=sc.nextInt()
                                print("Teacher's Subject: ")
                                TeacherList[i].SubjectHeTeaches=sc.next()

                                println("Congrats, The Teacher is Editted")

                            }
                        }
                        catch (e: Exception)
                        {
                            println("Teacher Not Found, Please Try Again")

                        }
                    }
                }
                else if(choice.equals("Delete"))
                {
                    println("Enter Teacher's ID")
                    var DeleteTeacherID=sc.nextInt()
                    try {
                        for (i in 0..TeacherList.size) {
                            if(DeleteTeacherID.equals(TeacherList[i].ID))
                            {
                                TeacherList.remove(TeacherList[i])
                            }
                        }
                    }
                    catch (e:Exception)
                    {
                        println("Teacher not found, Please try Again")
                    }
                }
                else if(choice.equals("View"))
                {
                    for(i in 0..TeacherList.size-1)
                    {
                        println(TeacherList[i].TeacherData())
                    }
                }
            }
            else if(Pressed.equals(2))
            {
                println("Add, Edit, Delete or View Students? ")
                var choice=sc.next()
                if(choice.equals("add"))
                {
                    print("Student's ID: ")
                    var AddedStudID=sc.nextInt()
                    print("Student's Name: ")
                    var AddedStudName=sc.next()
                    print("Student's Age: ")
                    var AddedTeacherAge=sc.nextInt()
                    print("Student's Academic Year: ")
                    var AddedStudentAcademicYear=sc.nextInt()
                    print("Student's Previous Grade: ")
                    var AddedStudPrevGrad=sc.nextInt()
                    print("Student's Class: ")
                    var AddedStudClass=sc.nextInt()
                    var StudAdded= Student(AddedStudID,AddedStudName,AddedTeacherAge,AddedStudentAcademicYear,
                        AddedStudPrevGrad,AddedStudClass)
                    StudentList.add(StudAdded)
                    println("Congrats, The new Student is added")
                }
                else if(choice.equals("Edit"))
                {
                    println("Enter Student's ID: ")
                    var EditStudentID=sc.nextInt()
                    for ( i in 0..StudentList.size)
                    {
                        try{
                            if(EditStudentID.equals(StudentList[i].ID))
                            {
                                println("Student is found")
                                println("Enter Student's new data")
                                //Re-Entering Data
                                print("Student's ID: ")
                                StudentList[i].ID=sc.nextInt()
                                print("Student's Name: ")
                                StudentList[i].Name=sc.next()
                                print("Student's Age: ")
                                StudentList[i].Age=sc.nextInt()
                                print("Student's Academic Year: ")
                                StudentList[i].AcademicYear=sc.nextInt()
                                print("Student's Previous Grade: ")
                                StudentList[i].PreviousGrade=sc.nextInt()
                                print("Student's Class: ")
                                StudentList[i].Class=sc.nextInt()

                                println("Congrats, The Student is Editted")

                            }
                        }
                        catch (e: Exception)
                        {
                            println("Student is Not Found, Please Try Again")
                        }
                    }
                }
                else if(choice.equals("Delete"))
                {
                    println("Enter Teacher's ID")
                    var DeleteStudID=sc.nextInt()
                    try {
                        for (i in 0..StudentList.size) {
                            if(DeleteStudID.equals(StudentList[i].ID))
                            {
                                StudentList.remove(StudentList[i])
                            }
                        }
                    }
                    catch (e:Exception)
                    {
                        println("Student is  not found, Please try Again")
                    }
                }
                else if(choice.equals("View"))
                {
                    for(i in 0..StudentList.size-1)
                    {
                        println(StudentList[i].StudentData())
                    }
                }
            }
            else if(Pressed==3)
            {
                println("Enter Teacher's Name ")
                var teacher=sc.next()
                println("Enter Class Number")
                var classNo=sc.nextInt()
                for(i in 0..TeacherList.size-1)
                {
                    if(teacher.toLowerCase()==TeacherList[i].Name &&classNo==1)
                    {
                        class1.add(TeacherList[i].Name)
                        println("Teachers Names are: "+class1[1]+" , "+class1[5])
                    }
                    else if(teacher==TeacherList[i].Name &&classNo==2)
                    {
                        class2.add(TeacherList[i].Name)
                        println("Teachers Names are: "+class2[1]+" , "+class2[5])
                    }
                    else if(teacher==TeacherList[i].Name &&classNo==3)
                    {
                        class3.add(TeacherList[i].Name)
                        println("Teachers Names are: "+class3[1]+" , "+class3[5])
                    }
                    else if(teacher==TeacherList[i].Name &&classNo==4)
                    {
                        class4.add(TeacherList[i].Name)
                        println("Teachers Names are: "+class4[1]+" , "+class4[5])
                    }

                }
            }
            else if(Pressed==4)
            {
                println("Enter Teacher's Name")
                var supervisor=sc.next()
                for (i in 0..TeacherList.size-1)
                {
                    if(supervisor==TeacherList[i].Name)
                    {
                        TeacherList[i].IsSuperVisor().equals(true)
                        println("$supervisor is now Supervisor, Years of his Experience is: "+TeacherList[i].YearsOfExperience)
                    }
                }
            }
            else if(Pressed==5)
            {
                println("Enter Student Name")
                var stdName=sc.next()
                println("Enter Student's Old Class")
                var oldClass=sc.nextInt()
                println("Enter Student's New Class")
                var newClass=sc.nextInt()
                //Removing Student
                for(i in 0..StudentList.size-1)
                {
                    if(class1.contains(stdName)&& oldClass==1)
                    {
                        class1.remove(stdName)
                    }
                    else if(class2.contains(stdName)&& oldClass==2)
                    {
                        class2.remove(stdName)
                    }
                    else if(class3.contains(stdName)&& oldClass==3)
                    {
                        class3.remove(stdName)
                    }
                    else if(class4.contains(stdName)&& oldClass==4)
                    {
                        class4.remove(stdName)
                    }
                }
                //Adding Class
                for(i in 0..StudentList.size-1)
                {
                    if(newClass==1)
                    {
                        class1.add(stdName)
                        println(class1)
                        break
                    }
                    else if(newClass==2)
                    {
                        class2.add(stdName)
                        println(class2)
                        break
                    }
                    else if(newClass==3)
                    {
                        class3.add(stdName)
                        println(class3)
                        break
                    }
                    else if(newClass==4)
                    {
                        class4.add(stdName)
                        println(class4)
                        break
                    }
                }
            }
        }

        }
    else if(tOrM.equals("t"))
    {
        print("Name: ")
        var name=sc.next()
        print("Password: ")
        var password=sc.next()
        var found=false
        for(i in 0..TeacherList.size-1)
        {
            if(TeacherList[i].Name==name&&TeacherList[i].Name==password)
            {
                found=true
                println("Hello, Mr $name")
                println("Press 1: View Personal info")
                println("Press 2: View Class Details")
                println("Press 3: Add Grades to Student")
                var press=sc.nextInt()
                if(press.equals(1))
                {
                    println("ID: "+TeacherList[i].ID)
                    println("Name: "+TeacherList[i].Name)
                    println("Age: "+TeacherList[i].Age)
                    println("Graduation Degree: "+TeacherList[i].GraduationDegree)
                    println("Graduation Year: "+TeacherList[i].GraduationYear)
                    println("Years Of Experience: "+TeacherList[i].YearsOfExperience)
                    println("Subject: "+TeacherList[i].SubjectHeTeaches)
                    break
                }
                else if(press==2)
                {
                    if(TeacherList[i].ID==1)
                    {
                        println("Teacher's Name: "+class1[0])
                        println("Student's Names: "+class1[1]+" , "+class1[3])
                    }
                    else if(TeacherList[i].ID==2)
                    {
                        println("Teacher's Name: "+class2[0])
                        println("Student's Names: "+class2[1]+" , "+class2[3])
                    }
                    else if(TeacherList[i].ID==3)
                    {
                        println("Teacher's Name: "+class3[0])
                        println("Student's Names: "+class3[1]+" , "+class3[3])
                    }
                    else if(TeacherList[i].ID==4)
                    {
                        println("Teacher's Name: "+class4[0])
                        println("Student's Names: "+class4[1]+" , "+class4[3])
                    }
                }
                else if(press==3)
                {
                    println("Enter Student's Name")
                    var StudName=sc.next()
                    println("How many grades do you want to add?")
                    var addedGrades=sc.nextInt()
                    if(TeacherList[i].ID==1)
                    {
                        if(class1[1]==StudName)
                        {
                            println("Student Previous Grade was "+class1[2])
                            class1[2]=class1[2].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class1[2].toString().toInt())
                        }
                        else if(class1[3]==StudName)
                        {
                            println("Student Previous Grade was "+class1[4])
                            class1[4]=class1[4].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class1[4])
                        }
                    }
                    else if(TeacherList[i].ID==2)
                    {
                        if(class2[1]==StudName)
                        {
                            println("Student Previous Grade was "+class2[2])
                            class2[2]=class2[2].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class2[2])
                        }
                        else if(class2[3]==StudName)
                        {
                            println("Student Previous Grade was "+class2[4])
                            class2[4]=class2[4].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class2[4])
                        }
                    }
                    else if(TeacherList[i].ID==3)
                    {
                        if(class3[1]==StudName)
                        {
                            println("Student Previous Grade was "+class3[2])
                            class3[2]=class3[2].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class3[2])
                        }
                        else if(class1[3]==StudName)
                        {
                            println("Student Previous Grade was "+class3[4])
                            class3[4]=class3[4].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class3[4])
                        }
                    }
                    else if(TeacherList[i].ID==4)
                    {
                        if(class1[1]==StudName)
                        {
                            println("Student Previous Grade was "+class1[2])
                            class4[2]=class4[2].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class4[2].toString().toInt())
                        }
                        else if(class4[3]==StudName)
                        {
                            println("Student Previous Grade was "+class4[4])
                            class4[4]=class1[4].toString().toInt()+addedGrades.toInt()
                            println("After Modification: "+class4[4])
                        }
                    }
                }

            }

        }
        if(found==false)
        {
            println("Teacher Not Found,Please Try Again")
        }
        }

    else{
        println("Enter only t or m")
    }
}