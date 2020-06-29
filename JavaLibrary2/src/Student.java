
import java.util.Scanner;


@What
class Student {
	
	protected static int count = 00;
	protected int enrollmentNo;
	protected int clas;
	protected String name;
	protected char section;
	protected Gender gender;
	protected House house;

	@What
	public Student() {
		enrollmentNo = count;
	}

	@What
	public Student(String name, int clas, char section, Gender gender, House house) {
		count++;
		enrollmentNo = count;
		this.name = name;
		this.clas = clas;
		this.section = section;
		this.gender = gender;
		this.house = house;
	}

	@Change(change = "Changes in getEnrollment", madeBy = "Student", madeOn = "EnrollmentNo")
	@What()
	public int getEnrollmentNo() {
		return enrollmentNo;
	}

	
	@Change(change = "Changes in getName", madeBy = "Student", madeOn = "Name")
	@What
	public String getName() {
		return name;
	}


	@Change(change = "Changes in getSection", madeBy = "Student", madeOn = "Section")
	@What
	public char getSection() {
		return section;
	}	


	@Change(change = "Changes in getHouse", madeBy = "Student", madeOn = "House")
	@What
	public House getHouse() {
		return house;
	}
	

	@Change(change = "Changes in getclas", madeBy = "Student", madeOn = "Class")
	@What
	public int getClas() {
		return clas;
	}
	

	@Change(change = "Changes in getGender", madeBy = "Student", madeOn = "Gender")
	@What
	public Gender getGender() {
		return gender;
	}
	

	@Change(change = "Changes in setEnrollment", madeBy = "Student", madeOn = "EnrollmentNo")
	@What
	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}


	@Change(change = "Changes in setName", madeBy = "Student", madeOn = "Name")
	@What
	public void setName(String name) {
		this.name = name;
	}


	@Change(change = "Changes in setclas", madeBy = "Student", madeOn = "class")
	@What
	public void setClas(int clas) {
		this.clas = clas;
	}	


	@Change(change = "Changes in setSection", madeBy = "Student", madeOn = "Section")
	@What
	public void setSection(char section) {
		this.section = section;
	}


	@Change(change = "Changes in setHouse", madeBy = "Student", madeOn = "House")
	@What
	public void setHouse(House house) {
		this.house = house;
	}


	@Change(change = "Changes in setGender", madeBy = "Student", madeOn = "Gender")
	@What
	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Change(change = "Changes in acceptData", madeBy = "Student", madeOn = " accepting Data")
	@Special
	@What
	public void acceptData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Name :");
		name = s.nextLine();
		System.out.println("Class :");
		clas = s.nextInt();
		System.out.println("Section :");
		section = s.next().charAt(0);
		System.out.println("Gender : ");
		gender = Gender.acceptGender();
		System.out.println("House : ");
		house = House.acceptHouse();
	}


	@Change(change = "Changes in showData", madeBy = "Student", madeOn = "showing Data")
	@Special
	@What
	public void showData() {
		System.out.println("EnrollmentNo :" + enrollmentNo);
		System.out.println("Name :" + name);
		System.out.println("Class :" + clas);
		System.out.println("Section :" + section);
		System.out.println("Gender  :" + gender);
		System.out.println("House  :" + house + "(" + house.getTitle() + ")");
	}


	@Special
	@What
	@Change(change = "Changes in showData", madeBy = "Student", madeOn = "showing Data")
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student("Ayush rai", 11, 'A', Gender.Male, House.Amaltas);
		s1.acceptData();
		s1.showData();
		s2.showData();
		
	}
}