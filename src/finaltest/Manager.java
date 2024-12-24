package finaltest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager implements MobileManager{
	
	List<Mobile> mobiles = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addMobile(Mobile m) throws Exception {
		boolean a = mobiles.add(m);
		if(!a)
		{
			throw new Exception("Error add");
		}
		
	}

	@Override
	public void delMobile(Mobile m) throws Exception {
		List<Mobile> mobilesRemove = new ArrayList<>();
		boolean a = false;
		for(Mobile mobile : mobiles)
		{
			if(mobile.getName().contains(m.getName()))
			{
				mobilesRemove.add(mobile);
				a = true;
			}
		}
		if(!a)
		{
			throw new Exception("Error delete");
		}
		mobiles.removeAll(mobilesRemove);
	}

	@Override
	public List<Mobile> searchMobile(String name) throws Exception {
		List<Mobile> results = new ArrayList<>();
		boolean found = false;
		for(Mobile mobile : mobiles)
		{
			if(mobile.getName().toLowerCase().contains(name.toLowerCase())){
				results.add(mobile);
				found = true;
			}
		}
		if(!found) {
			throw new Exception("Khong tim thay ten");
		}
		return results;
	}

	@Override
	public double getTotalStorage() throws Exception {
		double total = 0;
		try {
			for(Mobile mobile : mobiles)
			{
				total += mobile.getTotalPrice();
			}
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		return total;
	}
	
	public Mobile input()
	{
		System.out.println("Id:");
		String id = sc.nextLine();
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Total");
		int total = sc.nextInt();
		sc.nextLine();
		System.out.println("Manufacturer");
		String manufacturer = sc.nextLine();
		System.out.println("Ram: ");
		double ram = sc.nextDouble();
		sc.nextLine();
		return new Mobile(id,name,price,total,manufacturer,ram);
	}
	
	public void printMobiles()
	{
		for(Mobile mobile : mobiles)
		{
			System.out.println(mobile);
		}
	}
}
