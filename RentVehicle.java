package bookingcaragain;

import java.util.Scanner;

/**
*@author Chao
*@version time��RentVehicle.java2020��10��14������12:15:54
*��˵��
*/
public class RentVehicle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOperation vo = new VehicleOperation();
		System.out.println("********��ӭ�����ƾ����������Ƹ���ֶ���ͷ��*********");
		System.out.println("��������Ҫ�⳵�����ͣ�1.�γ���2.�ͳ�");
		int choose =  input.nextInt();
		//����Ʒ�ƣ���λ�����ͺ�
				String brand = "";
				int seatCount = 0;
				String type = "";
			switch (choose) {
			case 1:
				System.out.println("��������Ҫ�⳵��Ʒ�ƣ�1.����2.���");
				int brandVeh = input.nextInt();
				if(brandVeh == 1) {
					brand = "����";
					System.out.println("��������Ҫ�⳵���ͺţ�1.X6��2.550i");
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
					System.out.println("��������Ҫ�⳵���ͺţ�1.��������2.GL8");
					int type2 = input.nextInt();
				}
				break;
			case 2:
				System.out.println("��������Ҫ�⳵��Ʒ�ƣ�1.������2.��");
				brand = (input.nextInt() == 1)?"����":"��";
				System.out.println("��������Ҫ�⳵����λ����1.16��2.34");
				seatCount = (input.nextInt() == 1)?16:34;
			}
			vo.init();
			//�⳵
			Vehicles v = vo.rentVehicle(brand, type, seatCount);
			System.out.println("��������Ҫ���������");
			int days = input.nextInt();
			float price = v.vehiclesRent(days);
			System.out.println("���ã��������ĳ�Ϊ��"+v.getVehicleID()+"\n"+"���Ϊ��"+price+"Ԫ");
			
	}
}
