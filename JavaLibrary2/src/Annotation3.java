import java.lang.reflect.*;

class Annotation3 {
	public static void main(String[] args) {
		Student s = new Student();
		Method[] m = s.getClass().getDeclaredMethods();	

		for (Method e : m) {
			Change c =  e.getAnnotation(Change.class);
			System.out.println(c.change() + " Made by:" + c.madeBy() + " Made on:" + c.madeOn());
       		}		
	}
}