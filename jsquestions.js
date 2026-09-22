class student{
            static totalstudents=0;
            constructor(rollno,name,marks){
                this.rollno=rollno;
                this.name=name;
                this.marks=marks;
                student.totalstudents++;
            }
            displayresult(){
                
                let result;
                if(this.marks>=40){
                    console.log("passed");
                }
                else{
                   console.log("not passed")
                }
            }
        }
           let student1 = new student(101, "Anurag", 85);
           let student2 = new student(102, "Rahul", 35);
           let student3 = new student(103, "Aman", 72);

           student1.displayresult();
        student2.displayresult();
        student3.displayresult();

      