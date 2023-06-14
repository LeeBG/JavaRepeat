package hidePhoneNumber;
// 핸드폰 번호 가리기
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length()-4;
        String star = "";
        for(int i=0;i<index;i++) {
        	star += "*";
        }
        answer = phone_number.replace(phone_number.substring(0,index), star) ;
        
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String phone_number = "023344321";
		Solution s = new Solution();
		System.out.println(s.solution(phone_number));
	}
}
