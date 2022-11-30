package Debug;

public class DebugExample {
	
	public String invite() {
		return "All are Welcome";
	}
	public static void main(String[] args) {
		int a=10;
		int b;
		DebugExample de=new DebugExample();
		ArithmeticOperations ao=new ArithmeticOperations();
		System.out.println(de.invite());
		ao.add();
		ao.sub();
		ao.mul();
		ao.div();
		
	}

}
