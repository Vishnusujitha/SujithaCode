package bank.deposit;

public class PasswordException extends Exception {
	public static void main(String[] args) throws Exception {
	}
	public void checkPwd(String s) throws PasswordException {
		if (s.length() < 8) {
			PasswordException pe = new PasswordException();
			throw pe;
		}
	}
}