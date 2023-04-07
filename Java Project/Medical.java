//  As a Human it is very common to face medical emergencies in life/ Create an application to facilitate the 
// functionality for the patient to book an appointment with a doctor and maintain details about patient 
// and hospital/ Doctor to maintain all patient information/
// 1. Patient can book an appointment with a doctor
// 2. Patient can cancel an appointment
// 3. Patient can view all appointments
// 4. Doctor can view all appointments
// 5. Doctor can cancel an appointment
// 6. Doctor can view all appointments
// 7. Doctor can view all patients
// 8. Doctor can view all appointments of a patient
// 9. Doctor can view all appointments of a day
// 10. Doctor can view all appointments of a month
// 11. Doctor can view all appointments of a year
// 12. Doctor can view all appointments of a date range
// 13. Doctor can view all appointments of a month range
// 14. Doctor can view all appointments of a year range


import java.util.*;
import java.io.*;

class Medical
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 for Patient and 2 for Doctor");
        choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1)
        {
            System.out.println("Enter 1 for Booking an Appointment");
            System.out.println("Enter 2 for Cancelling an Appointment");
            System.out.println("Enter 3 for Viewing all Appointments");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1)
            {
                System.out.println("Enter the Appointment Date");
                String date = sc.nextLine();
                System.out.println("Enter the Appointment Time");
                String time = sc.nextLine();
                System.out.println("Enter the Doctor's Name");
                String docName = sc.nextLine();
                System.out.println("Enter the Doctor's Specialization");
                String docSpec = sc.nextLine();
                System.out.println("Enter the Doctor's Degree");
                String docDeg = sc.nextLine();
                System.out.println("Enter the Doctor's Hospital");
                String docHosp = sc.nextLine();
                try
                {
                    FileWriter fw = new FileWriter("Patient.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(date + " " + time + " " + docName + " " + docSpec + " " + docDeg + " " + docHosp);
                    bw.newLine();
                    bw.close();
                    fw.close();
                    System.out.println("Appointment Booked Successfully");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else if(choice == 2)
            {
                System.out.println("Enter the Appointment Date");
                String date = sc.nextLine();
                System.out.println("Enter the Appointment Time");
                String time = sc.nextLine();
                System.out.println("Enter the Doctor's Name");
                String docName = sc.nextLine();
                System.out.println("Enter the Doctor's Specialization");
                String docSpec = sc.nextLine();
                System.out.println("Enter the Doctor's Degree");
                String docDeg = sc.nextLine();
                System.out.println("Enter the Doctor's Hospital");
                String docHosp = sc.nextLine();
                try
                {
                    FileWriter fw = new FileWriter("Patient.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(date + " " + time + " " + docName +  docSpec + " " + docDeg + " " + docHosp);
                    bw.newLine();
                    bw.close();
                    fw.close();
                    System.out.println("Appointment Cancelled Successfully");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        else if(choice == 3)
        {
            try
            {
                FileReader fr = new FileReader("Patient.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null)
                {
                    System.out.println(line);
                    line = br.readLine();
                }
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
    else if(choice == 2)
    {
        System.out.println("Enter 1 for Viewing all Appointments");
        System.out.println("Enter 2 for Cancelling an Appointment");
        System.out.println("Enter 3 for Viewing all Patients");
        System.out.println("Enter 4 for Viewing all Appointments of a Patient");
        System.out.println("Enter 5 for Viewing all Appointments of a Day");
        System.out.println("Enter 6 for Viewing all Appointments of a Month");
        System.out.println("Enter 7 for Viewing all Appointments of a Year");
        System.out.println("Enter 8 for Viewing all Appointments of a Date Range");
        System.out.println("Enter 9 for Viewing all Appointments of a Month Range");
        System.out.println("Enter 10 for Viewing all Appointments of a Year Range");
        choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1)
        {
            try
            {
                FileReader fr = new FileReader("Patient.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null)
                {
                    System.out.println(line);
                    line = br.readLine();
                }
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(choice == 2)
        {
            System.out.println("Enter the Appointment Date");
            String date = sc.nextLine();
            System.out.println("Enter the Appointment Time");
            String time = sc.nextLine();
            System.out.println("Enter the Doctor's Name");
            String docName = sc.nextLine();
            System.out.println("Enter the Doctor's Specialization");
            String docSpec = sc.nextLine();
            System.out.println("Enter the Doctor's Degree");
            String docDeg = sc.nextLine();
            System.out.println("Enter the Doctor's Hospital");
            String docHosp = sc.nextLine();
            try
            {
                FileWriter fw = new FileWriter("Patient.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(date + " " + time + " " + docName +  docSpec + " " + docDeg + " " + docHosp);
                bw.newLine();
                bw.close();
                fw.close();
                System.out.println("Appointment Cancelled Successfully");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(choice == 3)
        {
            try
            {
                FileReader fr = new FileReader("Patient.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null)
                {
                    String[] arr = line.split(" ");
                    System.out.println(arr[2]);
                    line = br.readLine();
                }
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(choice == 4)
        {
            System.out.println("Enter the Patient's Name");
            String patName = sc.nextLine();
            try
            {
                FileReader fr = new FileReader("Patient.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null)
                {
                    String[] arr = line.split(" ");
                    if(arr[2].equals(patName))
                    {
                        System.out.println(line);
                    }
                    line = br.readLine();
                }
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(choice == 5)
        {
            System.out.println("Enter the Day");
            String day = sc.nextLine();
            try
            {
                FileReader fr = new FileReader("Patient.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null)
                {
                    String[] arr = line.split(" ");
                    if(arr[0].equals(day))
                    {
                        System.out.println(line);
                    }
                    line = br.readLine();
                }
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    else if(choice == 6)
    {
        System.out.println("Enter the Month");
        String month = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[1].equals(month))
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 7)
    {
        System.out.println("Enter the Year");
        String year = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[2].equals(year))
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 8)
    {
        System.out.println("Enter the Starting Date");
        String startDate = sc.nextLine();
        System.out.println("Enter the Ending Date");
        String endDate = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[0].compareTo(startDate) >= 0 && arr[0].compareTo(endDate) <= 0)
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 9)
    {
        System.out.println("Enter the Starting Month");
        String startMonth = sc.nextLine();
        System.out.println("Enter the Ending Month");
        String endMonth = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                String[] arr = line.split(" ");
                if(arr[1].compareTo(startMonth) >= 0 && arr[1].compareTo(endMonth) <= 0)
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 10)
    {
        System.out.println("Enter the Starting Year");
        String startYear = sc.nextLine();
        System.out.println("Enter the Ending Year");
        String endYear = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[2].compareTo(startYear) >= 0 && arr[2].compareTo(endYear) <= 0)
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 11)
    {
        System.out.println("Enter the Doctor's Name");
        String docName = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[2].equals(docName))
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 12)
    {
        System.out.println("Enter the Doctor's Specialization");
        String docSpec = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[3].equals(docSpec))
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 13)
    {
        System.out.println("Enter the Doctor's Degree");
        String docDeg = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[4].equals(docDeg))
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else if(choice == 14)
    {
        System.out.println("Enter the Doctor's Name");
        String docName = sc.nextLine();
        System.out.println("Enter the Doctor's Specialization");
        String docSpec = sc.nextLine();
        System.out.println("Enter the Doctor's Degree");
        String docDeg = sc.nextLine();
        try
        {
            FileReader fr = new FileReader("Patient.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null)
            {
                String[] arr = line.split(" ");
                if(arr[2].equals(docName) && arr[3].equals(docSpec) && arr[4].equals(docDeg))
                {
                    System.out.println(line);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    else
    {
        System.out.println("Invalid Choice");
    }
}
System.out.println("Do you want to continue? (Y/N)");
String ch = sc.nextLine();
if(ch.equals("Y") || ch.equals("y"))
{
    continue;
}
else
{
    break;
}
}
}
}

