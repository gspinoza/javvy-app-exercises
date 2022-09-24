package gspinoza;

public class SpaceAdventure9 {

	public static void main(String[] args) {
		
		// Samantha wants to reach her all-time goal of 701 planets. 
		// Whenever she gets to a planet, she says "We made it!" and adds it to her counter. 
		// This could take hours. No, wait: Let's use a loop!
		
		int planets = 0;
		String sentence = "We made it!";
		
		while (planets < 701) {
			planets++;
			System.out.println(planets + " - " + sentence);
		}
	}

}