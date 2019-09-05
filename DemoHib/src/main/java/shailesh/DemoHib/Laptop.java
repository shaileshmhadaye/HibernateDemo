package shailesh.DemoHib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	@OneToMany
	private List<Students> student = new ArrayList<Students>();
	
	public List<Students> getStudent() {
		return student;
	}
	public void setStudent(List<Students> student) {
		this.student = student;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
