package baseInfo;

//import java.util.Date;

public class Credentials {
	
	private int keyID;
	private String verificationCode;
	private int characterID;
	//private int accessMask;
	//private Date expireDate;
	
	public int getKeyID() {
		return keyID;
	}
	public void setKeyID(int keyID) {
		this.keyID = keyID;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public int getCharacterID(){
		return characterID;
	}
	public void setCharacterID(int characterID){
		this.characterID = characterID;
	}
	public Credentials(int keyID, String verificationCode) {
		super();
		this.keyID = keyID;
		this.verificationCode = verificationCode;
	}
	
//	public int getAccessMask() {
//		return accessMask;
//	}
//	public void setAccessMask(int accessMask) {
//		this.accessMask = accessMask;
//	}
//	public Date getExpireDate() {
//		return expireDate;
//	}
//	public void setExpireDate(Date expireDate) {
//		this.expireDate = expireDate;
//	}
	
}
