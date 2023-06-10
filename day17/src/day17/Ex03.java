package day17;

import java.util.Arrays;

// 현재 패키지 내부에서 다른 패키지의 클래스를 참조하여 사용하려면 import를 한다.

abstract class Product {
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract String toString();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
}

class Food extends Product{
	String expireDate;		// 유통기한
	
	public Food(String name, int price,String expireDate) {
		super(name,price);
		this.expireDate=expireDate;
	}
	@Override
	public String toString() {
		String format = "%s] %,d원 (유통기한 : %s)";
		Object[] args = {name, price, expireDate};
		
		return String.format(format, args);
	}
}

class IndustrialProduct extends Product{

	String madeIn;
	
	public IndustrialProduct(String name, int price, String madeIn) {
		super(name, price);
		this.madeIn = madeIn;
	}

	@Override
	public String toString() {
		String format = "%s] %,d원 (made in %s )";
		Object[] args = { name, price, madeIn };
		
		return String.format(format, args);
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Product[] arr1 = new Product[] {
				new Food("월드콘", 2000, "2023-12-08"),
				new Food("콘칩", 1500, "2024-01-08"),
				new Food("고구마칩", 2500, "2024-01-08"),
				new IndustrialProduct("철사", 2800, "Singapore"),
				new IndustrialProduct("마스크", 1500, "Korea"),
				new IndustrialProduct("에너자이저 건전지", 4800, "China")
		};
		String search = "콘";
		
		int length = 0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != null && arr1[i].getName().contains(search)) {
				length++;
			}
		}
		Product[] arr2 = new Product[length];
		int  j = 0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != null && arr1[i].getName().contains(search)) {
				arr2[j] = arr1[i];
				j++;
			}
		}
		for(Product p : arr1) {
			System.out.println(p);
		}
		System.out.println();
		for(Product p : arr2) {
			System.out.println(p);
		}
	}
}
