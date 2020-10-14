package bookingcaragain;
/**
*@author Chao
*@version time��Cars.java2020��10��14������10:59:42
*��˵��
*/
public class Cars extends Vehicles{
//�������ԣ��ͺ�
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
	//�������
	@Override
	public float vehiclesRent(int days) {
		float price = this.getVehicleRent()*days;
		//�ۿ�
		//�ۿ�
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
