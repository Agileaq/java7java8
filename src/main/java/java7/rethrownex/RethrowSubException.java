package java7.rethrownex;

import java7.catmultiex.InvalidParameter;

public class RethrowSubException {

	class FirstException extends Exception {
	}

	class SecondException extends Exception {
	}

	public void rethrowException(String exceptionName) throws FirstException,
			SecondException, InvalidParameter{
		try {
			if ("a".equals("exceptionName")) {
				throw new InvalidParameter();
			}
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			if (e instanceof FirstException) {
				System.out.println("BB");
			} else {
				throw e;
			}
		}
	}

	public static void main(String args[]) {
		try {
			new RethrowSubException().rethrowException("SS");
		} catch (FirstException | SecondException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
