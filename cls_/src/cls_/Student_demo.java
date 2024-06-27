package cls_;

public class Student_demo {

	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		s2.setId(103);
		s2.setName("bala");
		s2.setCity("puducherry");

		s1.setId(101);
		s1.setName("Davis");
		s1.setCity("sydney");
		
		System.out.println(s2.toString());
		System.out.println(s1.toString());
	}

}
