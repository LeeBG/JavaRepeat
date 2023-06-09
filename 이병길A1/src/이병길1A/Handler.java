package 이병길1A;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Handler {
	private Member[] members;
	
	public Handler() {										
		members = new Member[100];	// 100명의 회원을 관리할 수 있다.
	}

	// 회원 가입
	public int join(int menu, Scanner sc) {
		int res = 0;
		boolean isInvalidID = false;			// while문을 타기 위해 초기값 false
		String id = null;

		System.out.println();
		while (!isInvalidID) {
			System.out.print("아이디를 입력하세요 >> ");
			id = sc.nextLine();
			isInvalidID = id_check(id); // 중복체크
		}

		System.out.print("비밀번호를 입력하세요 >> ");
		String passwd = sc.nextLine();

		System.out.print("이름을 입력하세요 >> ");
		String name = sc.nextLine();

		if (menu == 1) {
			System.out.print("배송 주소를 입력해주세요 >> ");
			String address = sc.nextLine();
			for (int i = 0; i < members.length; i++) {
				if (members[i]==null) {
					members[i] = new Customer(id, passwd, name, address);
					res +=1;
					break;
				}
			}
		} else if (menu == 2) {
			System.out.print("가게 이름을 입력해주세요 >>");
			String storeName = sc.nextLine();
			for (int i = 0; i < members.length; i++) {
				if (members[i] == null) {
					members[i] = new Seller(id, passwd, name, storeName);
					res +=1;
					break;
				}
			}
		}
		return res;
	}

	// 아이디 중복 체크
	public boolean id_check(String id) {
		for (Member m : members) {
			if (m != null && m.getId().equals(id)) {
				System.out.println("중복된 아이디 입니다. 다시입력하세요");
				return false;
			}
		}
		return true;
	}


	// 탈퇴
	public int out(String id, Scanner sc) {
		int res = 3;
		for(Member m : members) {
			if(m != null && m.getId().equals(id)) {
				System.out.println();
				System.out.print("정말 탈퇴 하시겠습니까? (Y or N) >>");
				char ch = sc.next().charAt(0);													// 첫 글자가 y인지 Y인지 n인지 N인지 검사 no나 yes와 같은 답변도 처리가능
				sc.nextLine();																						// 버퍼 비우기
				if(ch==89 || ch==121) {																		// y, Y, Yes
					m = null;
					res = 1;
					break;
				}else if(ch == 78 || ch == 110) {														// n, N, No
					res = 0;
					break;
				}else {
					break;
				}
			}
		}
		return res;
	}

	
	// 검색
	public Member[] searchMember(String keyword) {
		int index = 0;
		for(int i=0;i<members.length;i++) {
			if(members[i] != null) {
				if(members[i].getId().contains(keyword))
				index ++;
			}
		}
		
		Member[] searchedArray = new Member[index];
		index = 0;
		
		for(int i=0;i<members.length;i++) {
			if(members[i] != null ) {
				if(members[i].getId().contains(keyword)) {
					searchedArray[index] = members[i];
					index++;
				}
			}
		}
		
		return searchedArray;
	}

	public void selectAll() {
		System.out.println("\t\t 전체 회원 정보 ");
		int cIndex = 0;		// 구매자 index
		int sIndex = 0;		// 판매자 index

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getClass().toString().split("\\.")[1].equals("Customer")) {
					cIndex++;
				} else {																											// Seller
					sIndex++;
				}
			} // end of members null
		}
		Customer[] customers = new Customer[cIndex];
		Seller[] sellers = new Seller[sIndex];
		cIndex = 0;
		sIndex = 0;

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getClass().toString().split("\\.")[1].equals("Customer")) {
					customers[cIndex] = (Customer) members[i];
					cIndex++;
				} else {
					sellers[sIndex] = (Seller) members[i];
					sIndex++;
				}
			} // end of members null
		}

		System.out.println(cIndex==0 ? "":"[구매자 정보]");
		for (int i = 0; i < customers.length; i++) {
			System.out.println("ID : " + customers[i].getId());
			System.out.println("Passwd : " + customers[i].getPasswd().replaceAll(".", "*"));
			System.out.println("Name : " + customers[i].getName());
			System.out.println("배송주소 : " + customers[i].getAddress());
			System.out.println();
		}

		System.out.println(sIndex==0 ? "":"[판매자 정보]");
		for (int i = 0; i < sellers.length; i++) {
			System.out.println("ID : " + sellers[i].getId());
			System.out.println("Passwd : " + sellers[i].getPasswd().replaceAll(".", "*"));
			System.out.println("Name : " + sellers[i].getName());
			System.out.println("배송주소 : " + sellers[i].getStoreName());
			System.out.println();
		}
	}

	public Member[] getMembers() {
		return members;
	}

	public void selectAll(Member[] searchedmember) {
		int cIndex = 0;
		int sIndex = 0;
		
		for (int i = 0; i < searchedmember.length; i++) {
			if (searchedmember[i] != null) {
				if (searchedmember[i].getClass().toString().split("\\.")[1].equals("Customer")) {
					cIndex++;
				} else {
					sIndex++;
				}
			} // end of members null
		}
		Customer[] customers = new Customer[cIndex];
		Seller[] sellers = new Seller[sIndex];
		cIndex = 0;
		sIndex = 0;
		
		for (int i = 0; i < searchedmember.length; i++) {
			if (searchedmember[i] != null) {
				if (searchedmember[i].getClass().toString().split("\\.")[1].equals("Customer")) {
					customers[cIndex] = (Customer) searchedmember[i];
					cIndex++;
				} else {
					sellers[sIndex] = (Seller) searchedmember[i];
					sIndex++;
				}
			} // end of members null
		}

		System.out.println(cIndex==0 ? "":"[구매자 정보]");
		for (int i = 0; i < customers.length; i++) {
			System.out.println("ID : " + customers[i].getId());
			System.out.println("Passwd : " + customers[i].getPasswd().replaceAll(".", "*"));
			System.out.println("Name : " + customers[i].getName());
			System.out.println("배송주소 : " + customers[i].getAddress());
			System.out.println();
		}

		System.out.println(sIndex==0 ? "":"[판매자 정보]");
		for (int i = 0; i < sellers.length; i++) {
			System.out.println("ID : " + sellers[i].getId());
			System.out.println("Passwd : " + sellers[i].getPasswd().replaceAll(".", "*"));
			System.out.println("Name : " + sellers[i].getName());
			System.out.println("배송주소 : " + sellers[i].getStoreName());
			System.out.println();
		}
		
	}
	
	public void setMembers(Member[] members) {
		this.members = members;
	}

	// 정렬
	public void sort() {
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				if(o1 != null && o2 != null) {
					return o2.getId().compareTo(o1.getId());			// 오름차순
				}
				return 0;
			}
		});
		selectAll();
	}
	
}
