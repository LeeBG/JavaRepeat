package oop;


public class Ex01 {
	public static void main(String[] args) {
		String [] nameArray = {"짱구", "유리", "훈이", "맹구", "철수"};
		double[] heightArray = {105.9, 104.2, 106.2, 113.9, 108.7};
		
		for(int i =0;i<nameArray.length;i++) {
			String name = nameArray[i];
			double height = heightArray[i];
			System.out.printf("%s의 키는 %.1fcm입니다. \n",name,height);
		}
		System.out.println();
		
		for(int i=0;i<nameArray.length-1;i++) {
			for(int j=i+1;j<nameArray.length;j++) {
				if(nameArray[i].compareTo(nameArray[j]) > 0) {
					String tmp = nameArray[j];
					double hightmp = heightArray[j];
					
					nameArray[j] = nameArray[i];
					heightArray[j] = heightArray[i];
					
					nameArray[i] = tmp;
					heightArray[i] = hightmp;
				}
			}		
		}
		
		
		for(int i =0;i<nameArray.length;i++) {
			String name = nameArray[i];
			double height = heightArray[i];
			System.out.printf("%s의 키는 %.1fcm입니다. \n",name,height);
		}
	}
}
