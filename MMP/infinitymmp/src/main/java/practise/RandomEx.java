package practise;

import java.util.Random;

public class RandomEx {
	
//https://demo.openmrs.org/openmrs/registrationapp/registerPatient.page?appId=referenceapplication.registrationapp.registerPatient
//Admin/Admin123 -> Select Inpatientward
	public static void main(String[] args) {
		
		Random rand = new Random();
		int i = rand.nextInt(100);//0 to 99
		System.out.println(i);
		String emailID="QAAutomationTeam";
		
//		char ch ='A';
//		int i1 = ch;
//		System.out.println(i1);
//		
//		int i2=122;
//		char ch1 = (char) i2;
//		System.out.println(ch1);
		
		//uppercase 65 to 90
		//lowerLimit+rand.nextInt(Upperlimit-lowerlimit+1)
		
		int u = 65+ rand.nextInt(26);
		System.out.println("UpperCase::" + u );
		char upperCase = (char) u;
		
		
		
		//lower 97 to 122
		int l = 97+rand.nextInt(122-97+1);
		System.out.println("lowercase:: " + l);
		char lowercase = (char) l;
		
		System.out.println(emailID+upperCase+lowercase+i+"@gmail.com");
		
		 
		
	}

}
