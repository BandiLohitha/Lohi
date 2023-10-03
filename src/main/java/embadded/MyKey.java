package embadded;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MyKey implements Serializable{

	private String email;
	private long phone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
