package student;

public class Handler {
	// 여러 Student 객체를 저장할 공간
	// null, null, null, null, null, null, null, null, null, null

	// 이름이 일치하는 학생 객체를 삭제
	// 검색어를 포함하는 이름을 가진 학생의 배열을 반환
	
	private Student[] arr = new Student[10];

	Handler(Student[] arr) {
		this.arr = arr;
	}

	Handler() {
	}

	// Student 타입의 객체를 추가
		public int add(Student st) {
			int row = 0;
			for(int i = 0;i<arr.length;i++) {	// 배열을 순회하면서
				if(arr[i] == null) {
					arr[i] = st;									// 빈칸에 전달받은 학생 객체를 저장
					row = 1;										// 1개 추가함
					break;											// 반복 중단
				}
			}
			return row;
		}
		
		
		// 전체 목록을 반환 
		public Student[] getArr() {
			return arr;
		}
	
		public int delete(String name) {
			int row = 0;
			for(int i=0;i<arr.length;i++) {				
				for(int j=i;j<arr.length;j++) {		// 동명이인을 모두 지운다고 한다면 반복을 한 번 더 반복해준다.
					if(arr[j] != null && arr[j].getName().equals(name)) {
						arr[j] = null;
						row = 1;
						i = j;
						break;
					}
				}	
			}
			return row;
		}
		// 검색어를 포함하는 이름을 가진 학생의 배열을 반환
		// 1) 검색어를 포함하는 인원수를 체크한다.
		// 2) 인원수 만큼의 크기를 가지는 배열을 생성한다.
		// 3) 검색어를 포함하는 객체를 배열에 복사하여 저장한다.
	
		public Student[] search(String keyword) {
			Student[] result = null;
			int count = 0;
			for(int i=0;i<arr.length; i++) {
				if(arr[i]!= null && arr[i].getName().contains(keyword)) {
					count++;
				}
			}
			result = new Student[count];
			int index = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!= null && arr[i].getName().contains(keyword)) {
					result[index++] = arr[i];
				}
			}
			return result;
		}
		
	
}
