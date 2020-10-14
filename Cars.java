package bookingcaragain;
/**
*@author Chao
*@version time：Cars.java2020年10月14日上午10:59:42
*类说明
*/
public class Cars extends Vehicles{
//特有属性：型号
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public Cars() {
		
	}

	public Cars(String brand, String vehicleID, int vehicleRent,String type) {
		super(brand, vehicleID, vehicleRent);
		this.type = type;
	}
	//计算租金
	@Override
	public float vehiclesRent(int days) {
		float price = this.getVehicleRent()*days;
		//折扣
		//折扣
			if(days>7&&days<=30) {
				price = price*0.9f;
			}else if(days<=150) {
				price = price*0.8f;
			}else  {
				price = price*0.7f;
			}
		return price;
	}

}
