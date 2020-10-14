package bookingcaragain;

/**
*@author Chao
*@version time��VehicleOperation.java2020��10��14������11:09:16
*��˵��
*/
public class VehicleOperation {
	//���泵������
	Vehicles[] vehicles = new Vehicles[8];
	//������Ϣ��ʼ��
		public void init() {//�γ���String brand, String cehicleId, int perRent,String type
			//�ͳ���String brand, String cehicleId, int perRent,int seatCount
			vehicles[0] = new Cars("����","��N85764",800,"X6");
			vehicles[1] = new Cars("����","��L79654",600,"550i");
			vehicles[2] = new Cars("���","��Y96584",400,"������");
			vehicles[3] = new Cars("���","��Y85754",800,"GL8");
			vehicles[4] = new Bus("����","��N85764",1000,34);
			vehicles[5] = new Bus("����","��U88884",800,16);
			vehicles[6] = new Bus("��","��T86694",1200,34);
			vehicles[7] = new Bus("��","��P87873",700,16);
		}
		//�⳵
		//Ʒ�ơ���λ�����ͺ�
		public Vehicles rentVehicle(String brand, String type, int seatCount) {
			Vehicles v = null;
			//����������Ϣ
			for(Vehicles vehicle:vehicles) {
				if(vehicle instanceof Cars) {
					Cars cars = (Cars)vehicle;
					//Ʒ�ƺ��ͺ�
					if(cars.getBrand().equals(brand)&&cars.getType().equals(type)) {
						v = cars;
						break;
					}else if(vehicle instanceof Bus) {
						Bus bus = (Bus)vehicle;
						//Ʒ�ƺ��ͺ�
						if(bus.getBrand().equals(brand)&&bus.getSeatCount() == seatCount) {
							v = bus;
							break;
					}
				}
			}
		}
			return v;
	}
}
