package lec04_02_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		// MyInfo class is instantiated, always inside main method, not in other method
		MyInfo info = new MyInfo(); // Constructor is initialized, when an object is created
		info.name = "Tofael";
		info.age = 127;
		info.myYearlySalary = 400006550;
		info.myBankBalance = 7865876537378463l;
		info.myHeight = 3.012f;
		info.myGrade = 3.678376676783;
		info.sex = 'M';
		info.usCitizen = false;
		info.myInfo();

		System.out.println("\n*********************************************\n");

		MyInfo info2 = new MyInfo(); // Constructor is initialized, when an object is created
		info2.name = "Alexandria";
		info2.age = 27;
		info2.myYearlySalary = 406550;
		info2.myBankBalance = 78658765463l;
		info2.myHeight = 2.012f;
		info2.myGrade = 2.678376676783;
		info2.sex = 'F';
		info2.usCitizen = true;
		info2.myInfo();

	}
}