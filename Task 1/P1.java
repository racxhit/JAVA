class CommandLineArguments
{
    public static void main(String[] args)
    {
        if (args.length != 5)
        {
            System.out.println("Please provide four command line arguments: full name, course, university roll number, and semester.");
            return;
        }
        System.out.println("Name: " + args[0] + " " + args[1]);
        System.out.println("Course: " + args[2]);
        System.out.println("University Roll Number: " + args[3]);
        System.out.println("Semester: " + args[4]);
    }
}