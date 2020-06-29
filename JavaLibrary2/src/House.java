import java.util.Scanner;
	
	@What
	enum House {
		Palash("Orange"), Gulmohar("Red"), Kachnar("Purple"), Amaltas("Yellow");
		
		House(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		} 
		String title;
		
		@What
		public static House acceptHouse() {
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			if(str.trim().toLowerCase().equals("palash"))
				return Palash;
			else if(str.trim().toLowerCase().equals("gulmohar"))
				return Gulmohar;
			else if(str.trim().toLowerCase().equals("kachnar"))
				return Kachnar;
			else
				return Amaltas;
		}
	}