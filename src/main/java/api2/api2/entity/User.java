package api2.api2.entity;
import java.util.Date;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
@Entity
@Table(name="User")
public class User {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	@Column(name="name")
	private String name;
	@Column(name="dob")
	private Date dob;
	@Column(name="email", nullable=false,unique=true)
	private String email;
	@Column(name="mobile")
	private String mobile;
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", dob=" + dob + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userid, String name, Date dob, String email, String mobile) {
		super();
		this.userid = userid;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
