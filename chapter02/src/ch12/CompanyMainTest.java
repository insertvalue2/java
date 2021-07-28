package ch12;

public class CompanyMainTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		System.out.println(company1);
		System.out.println(company2);
		
		//Calendar calendar = Calendar.getInstance();

	}

}
