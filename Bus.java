package bookingcaragain;
/**
*@author Chao
*@version time��Cars.java2020��10��14������10:59:42
*��˵��
*/
public class Bus extends Vehicles{
//�������ԣ��ͺ�
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
	//�������
	@Override
	public float vehiclesRent(int days) {
		float price = this.getVehicleRent()*days;
		//�ۿ�
		//�ۿ�
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
