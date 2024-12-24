package finaltest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		try {
			Mobile m1 = new Mobile("m1","Galaxy s22",555.4,15,"Samsung",64);
			Mobile m2 = new Mobile("m2","Iphone 15",600.5,25,"Apple",64);
			Mobile m3 = new Mobile("m3","Xiaomi s22",565.4,15,"Xiaomi",64);
			
			manager.addMobile(m1);
			manager.addMobile(m2);
			manager.addMobile(m3);
		} catch (Exception e) {
			System.out.println("Loi");
		}

		
		do {
			System.out.println("----------------MENU----------------");
			System.out.println("1.Hien thi");
			System.out.println("2.Them san pham");
			System.out.println("3.Xoa san pham");
			System.out.println("4.Tim san pham");
			System.out.println("5.Tinh tong tien");
			System.out.println("6.Thoat chuong trinh");
			System.out.println("----------------MENU----------------");
			System.out.print("Nhap lua chon: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				manager.printMobiles();
				break;
			case 2:
				Mobile t1 = manager.input();
				try {
					manager.addMobile(t1);
				} catch (Exception e) {
					System.out.println("Loi: " + e.getMessage());
				}
				break;
			case 3:
				System.out.println("Nhap ten can xoa: ");
				try {
					String idx = sc.nextLine();
					Mobile t2 = new Mobile();
					t2.setName(idx);
					manager.delMobile(t2);
					System.out.println("Xoa thanh cong");
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
					}
				break;
			case 4:
				System.out.println("Nhap ten can tim");
				try {
					sc.nextLine();
					String namesearch = sc.nextLine();
					for(Mobile mobile : manager.searchMobile(namesearch))
					{
						System.out.println(mobile);
					}
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Tong tien toan bo : " + manager.getTotalStorage());
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			case 6:
				System.out.println("Thoat chuong trinh");
				break;
				default :
					System.out.println("Yeu cau nhap lai");
					break;
			}
		}while(true);
	}

}
