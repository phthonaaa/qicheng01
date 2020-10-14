# qicheng01
#1.简单说就是不在new对象（new Object（））来创建对象，根据用户的选择条件来实例化相关的类。
2.去除具体类的依赖性。只需要给出具体的实例描述给工厂，工厂就会自动返回具体的实例化对象（客户端不需要改变，因为没有new的方法来创建对象）。
3.生成工厂的方法不是普通的方法 ，可以定义为static静态方法，客户端的工厂创建都可以不要，直接通过类名.来调用。

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
