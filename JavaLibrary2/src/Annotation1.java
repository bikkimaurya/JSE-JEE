    import java.lang.reflect.*;


class Annotation1 {
	public static void main(String[] args) {
		Student s = new Student();
		Method[] m = s.getClass().getDeclaredMethods();

		for (Method e : m) {
			What w =  e.getAnnotation(What.class);
			System.out.println(w.description() + " " + e.getName());
      	     	}

		What w = s.getClass().getAnnotation(What.class);
		System.out.println(w.description() + " " + s.getClass().getName());
	
		Gender g = Gender.Male;
		try {
			w = g.getClass().getAnnotation(What.class);
			System.out.println(w.description() + " " + g.getClass().getName());
			
		 	Method m1 = g.getClass().getMethod("acceptGender");
			w =  m1.getAnnotation(What.class);
			System.out.println(w.description() + " " + m1.getName());
		}
		catch(NoSuchMethodException exc) {
			System.out.println("METHOD NOT FOUND");
		}


		House h = House.Amaltas;
		try {
			w = h.getClass().getAnnotation(What.class);
			System.out.println(w.description() + " " + h.getClass().getName());
			
		 	Method m1 = h.getClass().getMethod("acceptHouse");
			w =  m1.getAnnotation(What.class);
			System.out.println(w.description() + " " + m1.getName());
		}
		catch(NoSuchMethodException exc) {
			System.out.println("METHOD NOT FOUND");
		}
	}
}

