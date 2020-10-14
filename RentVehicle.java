package bookingcaragain;

import java.util.Scanner;

/**
*@author Chao
*@version time：RentVehicle.java2020年10月14日下午12:15:54
*类说明
*/
public class RentVehicle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOperation vo = new VehicleOperation();
		System.out.println("********欢迎来到云卷骐程汽车租聘（手动狗头）*********");
		System.out.println("请输入你要租车的类型：1.轿车，2.客车");
		int choose =  input.nextInt();
		//输入品牌，座位数，型号
				String brand = "";
				int seatCount = 0;
				String type = "";
			switch (choose) {
			case 1:
				System.out.println("请输入你要租车的品牌：1.宝马，2.别克");
				int brandVeh = input.nextInt();
				if(brandVeh == 1) {
					brand = "宝马";
					System.out.println("请输入你要租车的型号：1.X6，2.550i");
					int type1 = input.nextInt();
					switch (type1) {
					case 1:
						type = "X6";
						break;
					case 2:
						type = "550i";
						break;
					}
				}else {
					System.out.println("请输入你要租车的型号：1.林荫大道，2.GL8");
					int type2 = input.nextInt();
				}
				break;
			case 2:
				System.out.println("请输入你要租车的品牌：1.金龙，2.金杯");
				brand = (input.nextInt() == 1)?"金龙":"金杯";
				System.out.println("请输入你要租车的座位数：1.16，2.34");
				seatCount = (input.nextInt() == 1)?16:34;
			}
			vo.init();
			//租车
			Vehicles v = vo.rentVehicle(brand, type, seatCount);
			System.out.println("请输入你要租的天数：");
			int days = input.nextInt();
			float price = v.vehiclesRent(days);
			System.out.println("您好！分配给你的车为："+v.getVehicleID()+"\n"+"租金为："+price+"元");
			
	}
}
