package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class vendor {

	private int vid;
	private String name, email, password, upload_image;

	public String getUpload_image() {
		return upload_image;
	}

	public void setUpload_image(String upload_image) {
		this.upload_image = upload_image;
	}

	private long contact;
	private LocalDate join_date;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public LocalDate getJoin_date() {
		return join_date;
	}

	public void setJoin_date(LocalDate join_date) {
		this.join_date = join_date;
	}

	@Override
	public String toString() {
		return "vendor [vid=" + vid + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", upload_image=" + upload_image + ", contact=" + contact + ", join_date=" + join_date + "]";
	}

}
