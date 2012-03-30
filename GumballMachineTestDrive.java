//package headfirst.state.gumballstate;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter(1);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter(0);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(1);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
