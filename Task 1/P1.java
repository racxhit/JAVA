/*
Implement a java program to take input as a command line argument. 
Your name, course, university Rollno and semester. 
Display the information:

Name: 
University Roll No: 
Course:
Semester:
*/

class P1
{
    public static void main(String[] args)
    {
        if (args.length != 5)
        {
            System.out.println("Please provide four command line arguments: Full Name, Course, University Roll Number, and Semester.");
        }
        else
        {
        System.out.println("Name: " + args[0] + " " + args[1]);
        System.out.println("Course: " + args[2]);
        System.out.println("University Roll No: " + args[3]);
        System.out.println("Semester: " + args[4]);
        }
    }
}
