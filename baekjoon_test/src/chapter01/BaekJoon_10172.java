package chapter01;

public class BaekJoon_10172 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.showDog();

	}
	
	public static class Dog {
        
		String[] dogData = {
	           "|\\_/|",
	           "|q p|   /}",
	           "( 0 )\"\"\"\\",
	           "|\"^\"`    |",
	           "||_/=\\\\__|"
	    };
        
		public void showDog() {
            
	        for (String dog : dogData) {
	        	System.out.println(dog);
	        }
	            
		}
        
    }

}
