package AutoIncrement;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Girl {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sid;
private String name;
@OneToMany(cascade = CascadeType.ALL)
private List<Boy> boys;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Boy> getBoys() {
	return boys;
}
public void setBoys(List<Boy> boys) {
	this.boys = boys;
}

	
}
