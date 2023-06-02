package phone;

public class Main {
	public static void main(String[] args) {
		Phone ph1 = new Phone("홍길동","010-1234-4321");
		Phone ph2 = new Phone("장보고","010-7777-7777");
		Phone ph3 = new Phone("임꺽정","010-4321-1234");
		
		
		ph1.turn();
		ph2.turn();
		ph3.turn();
		
		ph1.send(ph2,"msg1");
		ph1.send(ph3,"msg2");
		ph2.send(ph1,"msg3");
		ph2.send(ph1,"msg4");
		ph2.send(ph1,"msg5");
		ph1.send(ph2,"msg6");
		ph1.send(ph2,"msg7");
		ph2.send(ph1,"msg8");
		ph2.send(ph1,"msg9");
		ph2.send(ph1,"msg10");
		ph2.send(ph1,"msg11");
		 
	}
}
