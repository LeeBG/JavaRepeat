package abstractClass;

class Student2 /* extends Object */ {
	String name;
	int kor, eng, mat, sum;
	double avg;
	Student2(String name, int k, int e, int m) {
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
	
	@Override
		public String toString() {
			String format = "%s] %3d, %3d, %3d, %3d, %.2f \n";
			Object[] args = {name, kor, eng, mat, sum, avg};
			String s = String.format(format, args);
			return s;
		}
}

public class Ex09 {
	public static void main(String[] args) {
		Student2 s1 = new Student2("짱구",11,12,13);
		Student2 s2 = new Student2("유리",21,22,23);
		
		s1.show();
		System.out.println(s2.toString());
				
	}
}
