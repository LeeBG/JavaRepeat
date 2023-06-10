package product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler(); 	// Handler
		
		Product tmp = null; 		// Product를 추가할 때 값을 받아야하기 때문에 임시변수
		Product[] arr = null;
		
		int menu;
		int row = 0;
		String name;
		int price;
		String expireDate;
		String madeIn;
		
		handler.insert(new Food("월드콘", 2200, "2023-11-08"));
		handler.insert(new Food("월드콘", 2000, "2023-12-08"));
		handler.insert(new Food("콘칩", 1500, "2024-01-08"));
		handler.insert(new Food("고구마칩", 2500, "2024-01-08"));
		handler.insert(new IndustrialProduct("KF94 마스크", 2800, "Singapore"));
		handler.insert(new IndustrialProduct("마스크", 1500, "Korea"));
		handler.insert(new IndustrialProduct("에너자이저 건전지", 4800, "China"));
		
		// Scanner
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 전체 목록(Handler에서 배열을 받아와서 반복문으로 출력)
				arr = handler.selectAll();
				for(Product p : arr) {
					if(p!=null) System.out.println(p);
				}
				break;
			case 2: // 추가 (입력받은 데이터를 객체화해서 Handler에게 전달)
				System.out.println("1) 식품 2) 공산품 0) 취소");
				System.out.print("상품의 유형을 선택하세요 >> ");
				menu = Integer.parseInt(sc.nextLine());
				System.out.println();
				
				switch (menu) {
				case 1:
					tmp = makeFood(sc);
					break;
				case 2:
					tmp = makeIndustProduct(sc);
					break;
				case 0:
					break;
				default:
					System.out.println("잘못입력!!");
					break;
				}
				row = handler.insert(tmp);
				System.out.println(row == 0 ? "추가 실패" : "추가 성공");
				break;
			case 3: // 검색 (입력받은 검색어를 전달하여 조건에 맞는 배열을 받아오기)
				System.out.print("검색할 키워드를 입력하세요 >> ");
				String keyword = sc.nextLine();
				
				arr = handler.search(keyword);
				showArr(arr);
				break;
			case 4: // 삭제 (입력받은 이름으로 일치하는 항목을 삭제하기)
				System.out.print("삭제할 상품의 이름을 입력하세요 >> ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println("삭제된 갯수 : " + row);
				System.out.println(row==0 ? "삭제 실패" : "삭제 성공");
				break;
			case 5: // 정렬 (상품 이름 순으로 정렬하기)
				arr = handler.sort();
				for(Product p : arr) {
					if(p!=null) System.out.println(p);
				}
				break;
			case 6: // 다른 방법의 정렬
				System.out.print("정렬 기준 선택 (1 ~ 4) : ");
				menu = Integer.parseInt(sc.nextLine());
				
				arr = handler.sort3(menu-1);
				for(int i=0;i<arr.length;i++) {
					if(arr[i] != null) {
						System.out.println(arr[i]);
					}
				}
				break;
				
			case 0: // 종료
				sc.close();
				System.out.println("프로그램 종료");
				return; // main 함수 종료

			default:
				System.err.println("메뉴를 잘못 선택하셨습니다.");
			}
			System.out.println();
		}
	}

	private static void showArr(Product[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.println("상품 이름 : " + arr[i].getName());
				System.out.println("상품 가격 : " + arr[i].getPrice());
				System.out.println();
			}
		}
	}

	private static Product makeIndustProduct(Scanner sc) {
		System.out.print("공산품 이름은? >> ");
		String name = sc.nextLine();
		System.out.print("공산품 가격은? >> ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("공산품의 생산국은? >> ");
		String madeIn = sc.nextLine();
		
		IndustrialProduct industrialProduct = new IndustrialProduct(name, price, madeIn);
		return industrialProduct;
	}

	private static Product makeFood(Scanner sc) {
		System.out.print("음식이름은? >> ");
		String name = sc.nextLine();
		System.out.print("음식가격은? >> ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("음식의 유통기한은? >> ");
		String expireDate = sc.nextLine();
		Food food = new Food(name, price, expireDate);
		return food;
	}
}
