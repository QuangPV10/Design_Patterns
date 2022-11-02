package commands;

import editor.Light;

public class CommandOn implements Command {
	private Light light;

	public CommandOn(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void excute() {
		light.SwitchOn();

	}

}
