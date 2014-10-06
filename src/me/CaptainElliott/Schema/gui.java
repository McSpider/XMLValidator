package me.CaptainElliott.Schema;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.xml.sax.SAXException;

public class gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String version = "Dev 1.0";

	final JFrame frame = new JFrame();

	private JLabel text1;
	private JLabel text2;
	private JLabel error1;
	private JLabel error2;
	private JButton browsebtn;
	private JButton Validatebtn;
	public String file;

	public gui() {
		super("OCN XML Validator Version: " + version);
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setLayout(new FlowLayout());

		text1 = new JLabel();
		getContentPane().add(text1);
		text1.setText("This is a validator the xml maps used on the Overcast network.");

		text2 = new JLabel();
		getContentPane().add(text2);
		text2.setText("Developed by Captain_Elliott");
		
		error1 = new JLabel();
		getContentPane().add(error1);
		
		error2 = new JLabel();
		getContentPane().add(error2);

		browsebtn = new JButton();
		getContentPane().add(browsebtn);
		browsebtn.setText("Browse!");

		Validatebtn = new JButton();
		getContentPane().add(Validatebtn);
		Validatebtn.setVisible(false);

		handler handler = new handler();
		browsebtn.addActionListener(handler);
		Validatebtn.addActionListener(handler);
	}

	private class handler implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (browsebtn.isEnabled()) {
				JFileChooser fc = new JFileChooser();
				int response = fc.showOpenDialog(null);
				if (response == JFileChooser.APPROVE_OPTION) {
					file = fc.getSelectedFile().toString();
					browsebtn.setVisible(false);
					boolean flag = true;
					try {
						Validator.validate(file, "XMLSchema.xsd");
					} catch (SAXException | IOException e) {
						flag = false;
						error1.setText(e.getMessage());
						e.printStackTrace();
					}
					text1.setText("The XML Document is valid: " + flag);
					

				} else {
					text1.setText("Operation Canceled");
				}



				}

			}

		}
	
	public String getFile(){
		return this.file;
	}

	}
