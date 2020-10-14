package bookingcaragain;

/**
*@author Chao
*@version time：VehicleOperation.java2020年10月14日上午11:09:16
*类说明
*/
public class VehicleOperation {
	//保存车的数组
	Vehicles[] vehicles = new Vehicles[8];
	//汽车信息初始化
		public void init() {//轿车：String brand, String cehicleId, int perRent,String type
			//客车：String brand, String cehicleId, int perRent,int seatCount
			vehicles[0] = new Cars("宝马","京N85764",800,"X6");
			vehicles[1] = new Cars("宝马","京L79654",600,"550i");
			vehicles[2] = new Cars("别克","京Y96584",400,"林荫大道");
			vehicles[3] = new Cars("别克","京Y85754",800,"GL8");
			vehicles[4] = new Bus("金龙","京N85764",1000,34);
			vehicles[5] = new Bus("金龙","京U88884",800,16);
			vehicles[6] = new Bus("金杯","京T86694",1200,34);
			vehicles[7] = new Bus("金杯","京P87873",700,16);
		}
		//租车
		//品牌、座位数、型号
		public Vehicles rentVehicle(String brand, String type, int seatCount) {
			Vehicles v = null;
			//遍历汽车信息
			for(Vehicles vehicle:vehicles) {
				if(vehicle instanceof Cars) {
					Cars cars = (Cars)vehicle;
					//品牌和型号
					if(cars.getBrand().equals(brand)&&cars.getType().equals(type)) {
						v = cars;
						break;
					}else if(vehicle instanceof Bus) {
						Bus bus = (Bus)vehicle;
						//品牌和型号
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
