package BehavioralPattern.CommandPattern;
//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
