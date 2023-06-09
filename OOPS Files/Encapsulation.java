package temp;

 class Student{
	private String name;
	private int rollNo;
	private int age;
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
		}
		
	public int getRollNo() {
			return rollNo;
		}
		
	public int getAge() {
			return age;
		}	
}

 class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("Saksham");
		s1.setRollNo(20);
		s1.setAge(22);
		
		System.out.println(s1.getName());
		
	}

}
