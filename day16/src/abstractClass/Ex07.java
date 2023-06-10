package abstractClass;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	String name;
	int kor, eng, mat, sum;
	double avg;
	Student(String name, int k, int e, int m) {
		this.name = name;
		this.kor = k;
		this.eng = e;
		this.mat = m;
		this.sum = k+e+m;
		avg = sum / 3.0;
	}
	
	public void show() {
		System.out.printf("%s] %3d, %3d, %3d, %3d, %.2f\n",name,kor,eng,mat,sum,avg);
	}
}
public class Ex07 {
	
	static void showArray(Student[] arr) {
		if(arr==null) {
			return;
		}
		
		for(Student i : arr) {
			i.show();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Student[] arr = {
				new Student("짱구", 91, 62, 76),
				new Student("훈이", 42, 23, 57),
				new Student("철수", 89, 92, 78),
				new Student("유리", 62, 64, 88),
				new Student("맹구", 34, 45, 58)
		};
		
		showArray(arr);
		
		// 잠깐, 정수의 배열을 정렬해보자.
		Integer[] arr2 = {4,8,2,7,6};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2,null);
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		// 다시 학생 배열로 돌아와서, 방식을 지정하지 않고 정렬을 시도한다.
//		Arrays.sort(arr,null);	// 실행 불가 : Student cannot be cast to Comparable
		// Student는 Comparable 타입으로 변환할 수 없다.
		// = Student는 비교가능한 타입이 아니다.(크기 비교에 대한 기준이 없다.)
		
		// 대신, 선택정렬을 이용하여 합계순으로 내림차순 정렬하는함수를 작성해보자
		selectionSortOrderBySumDesc(arr);
		showArray(arr);
		
		// 서로 다른 두 객체를 비교하는 내용을 담은 함수를 전달해야한다.
		// 함수는 객체 취급 될 수 있어서, 함수를 포함하는 객체를 생성해서 전달한다.
		// 1) 국어 점수를 기준으로 내림차순 정렬하는 객체를 익명클래스로 작성하기
		
		Comparator<Student> korComp = new Comparator<Student>() {
			
			@Override
			public int compare(Student a, Student b) {
				return b.kor-a.kor;			// 내림차순
			}
		};
		Arrays.sort(arr,korComp);
		showArray(arr);
	}

	private static void selectionSortOrderBySumDesc(Student[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				Student a = arr[i];
				Student b = arr[j];
				if(a.sum - b.sum < 0) {
					Student tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}
}
