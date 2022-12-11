package in.co.rays.Exception;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {
		TestLoginException t = new TestLoginException();
		try {
			t.authenticate("admin");
			System.out.println("No exception found!");
		}catch(LoginException e) {
			System.out.println("User Access Denied");
		}
		finally {
			System.out.println("This is finally Block");
		}
	}
	public void authenticate (String name)throws LoginException{
		if(!"admin".contentEquals(name)) {
			LoginException e = new LoginException();
			throw e;
		}
		}
		

	}


