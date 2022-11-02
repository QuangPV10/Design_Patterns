package editor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import commands.Command;
import commands.CopyCommand;
import commands.PasteCommand;

public class Editor {
	public JTextArea textField;
	public String clipboard;

	public void init() {
		JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
		JPanel content = new JPanel();
		frame.setContentPane(content);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		textField = new JTextArea();
		textField.setLineWrap(true);
		content.add(textField);
		JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton ctrlC = new JButton("Ctrl+C");
		JButton ctrlV = new JButton("Ctrl+V");
		Editor editor = this;
		ctrlC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executeCommand(new CopyCommand(editor));
			}
		});
		ctrlV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executeCommand(new PasteCommand(editor));
			}
		});

		buttons.add(ctrlC);
		buttons.add(ctrlV);
		content.add(buttons);
		frame.setSize(450, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void executeCommand(Command command) {
		command.execute();

	}

}