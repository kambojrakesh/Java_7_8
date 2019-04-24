package exception;

class ReflectionSingleton{  
	public static void main(String args[]){  
		System.out.println(check());
	}

	private static int check() {
		try{
			int i = 10/0;
			return 10;
		} catch(Exception e){
			System.out.println("check1");
			return 7;
		} finally {
			
			System.out.println("check");
			return 4;
		}
		
	}  
}  