package bookingcaragain;
/**
*@author Chao
*@version time��Vehicles.java2020��10��14������10:53:46
*��˵��
*/
public abstract class Vehicles {
//���ԣ�Ʒ�ơ����ơ����
	private String brand;
	private String vehicleID;
	private int vehicleRent;
	
	//���幹�췽������Ϊ��������Ϊ����ĵ���
	public Vehicles(){
		
	}
	public Vehicles(String brand, String vehicleID, int vehicleRent) {
		super();
		this.brand = brand;
		this.vehicleID = vehicleID;
		this.vehicleRent = vehicleRent;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getVehicleRent() {
		return vehicleRent;
	}
	public void setVehicleRent(int vehicleRent) {
		this.vehicleRent = vehicleRent;
	}
	//���������㷽��
	public abstract float vehiclesRent(int days) ;
}
