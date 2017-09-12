import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		StudentGroup sg = new StudentGroup(3);
		Date date = null;
		try
		{
			String valuee="2017-09-12";
			date =new SimpleDateFormat("yyyy-mm-dd").parse(valuee);
			//System.out.println("Date is ::"+ date);
		}
		catch(Exception e){
            System.out.println("Error::"+e);
            e.printStackTrace();
        }
		
		Student s = new Student(501, "K Mouni", date, 250.50);
		
		sg.addLast(s);
		/*Student[] st = sg.getStudents();
		for (int i = 0; st[i] != null ; i++)
		{
			System.out.println(st[i] + "****");
		}*/

	}

}
