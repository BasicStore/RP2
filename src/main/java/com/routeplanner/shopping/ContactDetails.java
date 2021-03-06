package com.routeplanner.shopping;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="contact_details")
public class ContactDetails extends DataModel 
{
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private String title;
	
	@NotNull
    @Size(min=2, max=30)
	private String fullname;
	
	@NotNull
    @Size(min=2, max=30)
	@Column(name="address_line_1", length = 80)
	private String addressLine1;
	
	@Column(name="address_line_2", length = 80)
	private String addressLine2;
	
	@Column(name="address_line_3", length = 80)
	private String addressLine3;
	
	@NotNull
	@Column(length = 40)
	private String city;
	
	@NotNull
	@Column(name="region", length = 50)
	private String region;
	
	@NotNull
	@Column(length = 40)
	private String country;
	
	@NotNull
	@Email
	@Column(length = 60)
	private String email;
	
	@Column(name="mobile_phone", length = 30)
	@Pattern(regexp = "^[0-9]*$")
	private String mobileTel;
	
	@Column(name="home_phone", length = 30)
	@Pattern(regexp = "^[0-9]*$")
	private String homeTel;
	
	@Column(name="office_phone", length = 30)
	@Pattern(regexp = "^[0-9]*$")
	private String officeTel;
	
	
	public ContactDetails() {
		
	}
	
	public ContactDetails(User user) {
		this.user = user;
	}

	public ContactDetails(String title, String fullname, String addressLine1, String addressLine2, String addressLine3,
			String city, String regionOrState, String country, String email, String mobileTel, String homeTel,
			String officeTel, User user) {
		this.title = title;
		this.fullname = fullname;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.region = region;
		this.country = country;
		this.email = email;
		this.mobileTel = mobileTel;
		this.homeTel = homeTel;
		this.officeTel = officeTel;
		this.user = user;
	}
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressLine3() {
		return addressLine3;
	}


	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getRegion() {
		return region;
	}


	public void setRegionOrState(String region) {
		this.region = region;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileTel() {
		return mobileTel;
	}


	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}


	public String getHomeTel() {
		return homeTel;
	}


	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}


	public String getOfficeTel() {
		return officeTel;
	}


	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	@Override
	public String toString() {
		return "ContactDetails [user=" + user + ", title=" + title + ", fullname=" + fullname + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", city=" + city
				+ ", region=" + region + ", country=" + country + ", email=" + email + ", mobileTel=" + mobileTel
				+ ", homeTel=" + homeTel + ", officeTel=" + officeTel + "]";
	}


	
	
}
