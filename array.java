class student
{
    int Rollno; // Declares an integer variable to store the roll number of a student
    String name; // Declares a String variable to store the name of a student
    int Marks; // Declares an integer variable to store the marks obtained by a student
}

public class array
{
    public static void main(String[] args) 
    {
        // Create and initialize first student object
        student s1 = new student();
        s1.Rollno = 1;
        s1.name = "Sneha";
        s1.Marks = 95;

        // Create and initialize second student object
        student s2 = new student();
        s2.Rollno = 2;
        s2.name = "Navin";
        s2.Marks = 90;

        // Create and initialize third student object
        student s3 = new student();
        s3.Rollno = 3;
        s3.name = "Kiran";
        s3.Marks = 80;

        // Create an array to store student objects
        student stud[] = new student[3];
        // Assign student objects to array elements
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        // Print the array using traditional for-loop
        for (int i=0; i<stud.length; i++)
        {
            // Print roll number, name, and marks of each student
            System.out.println(stud[i].Rollno +":"+stud[i].name +":"+ stud[i].Marks);
        }

        // Print an empty line for spacing
        System.err.println();

        // Alternative method - Print the array using enhanced for-loop
        
        // Iterate through each student object in the array
        for(student s: stud)
        {
            // Print roll number, name, and marks of each student
            System.out.println(s.Rollno +":"+s.name +":"+ s.Marks);
        }
    }
}
