package chapter01;

public class BaekJoon_10171 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.showCat();
	}
	
	public static class Cat {
		String[] catData = {
				"\\    /\\",
				" )  ( ')",
				"(  /  )",
				" \\(__)|"
		};
		
		public void showCat() {
			
			for (String string : catData) {
				System.out.println(string);
			}
			
		}
		
	}

}
