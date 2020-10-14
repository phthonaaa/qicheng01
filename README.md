# qicheng01
public abstract class Vehicles {
//属性：品牌、车牌、租金
	private String brand;
	private String vehicleID;
	private int vehicleRent;
	
	//定义构造方法，不为创建对象为后面的调用
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
	//抽象租金计算方法
	public abstract float vehiclesRent(int days) ;
}
