package product;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Handler {
	Product[] arr = new Product[10];
	Object[] compArray =new Comparator[4];
	
	public Handler() {
		Comparator<Product> comp1 = (a,b) -> a != null && b != null ? a.getName().compareTo(b.getName()) : 0;
		Comparator<Product> comp2 = (a,b) -> a != null && b != null ? b.getName().compareTo(a.getName()) : 0;
		Comparator<Product> comp3 = (a,b) -> a != null && b != null ? a.getPrice()- b.getPrice() : 0;
		Comparator<Product> comp4 = (a,b) -> a != null && b != null ? b.getPrice()- a.getPrice() : 0;
		
		compArray[0] = comp1;
		compArray[1] = comp1;
		compArray[2] = comp1;
		compArray[3] = comp1;
		
	}
	
	
	
	public Product[] selectAll() {
		if(arr!=null) {
			return arr;
		}
		return null;
	}
	
	// 전체 목록
	
	// 추가
	public int insert(Product tmp) {
		int row = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=tmp;
				row =1;
				break;
			}
		}
		return row;
	}
	
	// 검색

	
	public Product[] getArr() {
		return arr;
	}

	public void setArr(Product[] arr) {
		this.arr = arr;
	}

	public Product[] search(String keyword) {
		Product[] tmp = new Product[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null && arr[i].getName().contains(keyword)) {
				tmp[index] = arr[i];
				index ++;
			}
		}
		return tmp;
	}

	public int delete(String name) {
		int row = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				if(arr[i].getName().equals(name)) {
					arr[i] = null;
					row += 1;
				}
			}
		}
		return row;
	}

	public Product[] sort() {
		Arrays.sort(arr , new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1 != null && o2 != null) {
					return o1.getName().compareTo(o2.getName());
				}
				return 0;
			}	
		});
		return arr;
	}
	
	
	public Product[] sort2(Product[] arr) {
		Arrays.sort(arr, (o1,o2) -> (o1 != null && o2 != null) ? o1.getName().compareTo(o2.getName()) : 0 );
		return arr;
	}
	
	public Product[] sort3(int option) {
		if(0 <= option && option < compArray.length) {
			Arrays.sort(arr, (Comparator<Product>)compArray[option]);
		}
		return arr;
	}
	
	//
	
	// 삭제
	
	// 정렬
	
	
}
