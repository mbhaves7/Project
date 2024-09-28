package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class booking {

	private int id,vid,cid,vehicleId,Passenger,Distance	;

	private String PickUpLocation,DropOffLocation;
	
	private LocalDate pickDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getPassenger() {
		return Passenger;
	}

	public void setPassenger(int passenger) {
		Passenger = passenger;
	}

	public int getDistance() {
		return Distance;
	}

	public void setDistance(int distance) {
		Distance = distance;
	}

	public String getPickUpLocation() {
		return PickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		PickUpLocation = pickUpLocation;
	}

	public String getDropOffLocation() {
		return DropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		DropOffLocation = dropOffLocation;
	}

	public LocalDate getPickDate() {
		return pickDate;
	}

	public void setPickDate(LocalDate pickDate) {
		this.pickDate = pickDate;
	}

	@Override
	public String toString() {
		return "booking [id=" + id + ", vid=" + vid + ", cid=" + cid + ", vehicleId=" + vehicleId + ", Passenger="
				+ Passenger + ", Distance=" + Distance + ", PickUpLocation=" + PickUpLocation + ", DropOffLocation="
				+ DropOffLocation + ", pickDate=" + pickDate + "]";
	}
	
}
