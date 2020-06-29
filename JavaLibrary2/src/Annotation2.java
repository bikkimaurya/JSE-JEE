import java.lang.reflect.*;


class Annotation2 {
	public static void main(String[] args) {
		Student s = new Student();
		Method[] m = s.getClass().getDeclaredMethods();

		for (Method e : m) {
			if(e.isAnnotationPresent(Special.class))
			System.out.println("Special Function Present  : " + e.getName());
      	     	}
	}
}