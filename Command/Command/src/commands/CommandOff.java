package commands;

import editor.Light;

public class CommandOff implements Command {
	private Light light;

	public CommandOff(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.SwitchOff();

	}

}
