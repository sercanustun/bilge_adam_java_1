package AtmProject;

public class SecretClass extends Atm {
	protected String userName = "root";
	protected String passWord = "root";
	protected String eMail = "ustunsercan@gmail.com";
	
	public SecretClass() {
		super();
	}
	
	public SecretClass(String userName, String passWord, String eMail) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.eMail = eMail;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	@Override
	public String toString() {
		return "SecretClass [userName=" + userName + ", passWord=" + passWord + ", eMail=" + eMail + "]";
	}
	
}
