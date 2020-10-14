package bookingcaragain;
/**
*@author Chao
*@version time：Cars.java2020年10月14日上午10:59:42
*类说明
*/
public class Bus extends Vehicles{
//特有属性：型号
	private int seatCount;

	
	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public Bus() {
		
	}

	public Bus(String brand, String vehicleID, int vehicleRent,int seatCount) {
		super(brand, vehicleID, vehicleRent);
		this.seatCount = seatCount;
	}
	//计算租金
	@Override
	public float vehiclesRent(int days) {
		float price = this.getVehicleRent()*days;
		//折扣
		//折扣
			if(days>3&&days<=7) {
				price = price*0.9f;
			}else if(days<=30) {
				price = price*0.8f;
			}else if(days<150) {
				price = price*0.7f;
			}else {
				price = price*0.6f;
			}
		return price;
	}

}
