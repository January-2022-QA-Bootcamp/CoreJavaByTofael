package lec07_02_different_type_of_method;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator01 calculator01 = new Calculator01();
		calculator01.addition();
		calculator01.subtraction();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator02 calculator02 = new Calculator02();
		calculator02.addition();
		calculator02.subtraction();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		Calculator03 calculator03 = new Calculator03();
		calculator03.multiplication();
		calculator03.division(3.454f, 1.324f);
		calculator03.division(7.454f, 1.924f);

	}

}
