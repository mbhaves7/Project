package Model;

public class vehicle {

	private int vehicleId, vid, vprice;
	private String vname, vimage, vcategory, vdesc;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getVprice() {
		return vprice;
	}

	public void setVprice(int pprice) {
		this.vprice = pprice;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVimage() {
		return vimage;
	}

	public void setVimage(String vimage) {
		this.vimage = vimage;
	}

	public String getVcategory() {
		return vcategory;
	}

	public void setVcategory(String vcategory) {
		this.vcategory = vcategory;
	}

	public String getVdesc() {
		return vdesc;
	}

	public void setVdesc(String vdesc) {
		this.vdesc = vdesc;
	}

	@Override
	public String toString() {
		return "vehicleDAO [vehicleId=" + vehicleId + ", vid=" + vid + ", vprice=" + vprice + ", vname=" + vname
				+ ", vimage=" + vimage + ", vcategory=" + vcategory + ", vdesc=" + vdesc + "]";
	}

}
