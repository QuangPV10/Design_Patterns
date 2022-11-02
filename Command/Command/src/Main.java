import commands.Command;
import commands.CommandOff;
import commands.CommandOn;
import editor.Light;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		Command c1 = new CommandOff(light);
		Command c2 = new CommandOn(light);
		rc.SetCommand(c1);
		rc.PressButton();

		rc.SetCommand(c2);
		rc.PressButton();
	}

}
