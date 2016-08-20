package self.swing.practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class TextFieldDemo {
	JLabel label=null;
	public TextFieldDemo() {
		JFrame jfrm = new JFrame("Text Demo");
		jfrm.setSize(300, 500);
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JTextField jtextField=new JTextField("Enter Text Here",50);
		jtextField.setBackground(Color.CYAN);
		jtextField.setCaretColor(Color.RED);
		label= new JLabel("<<Current Input>>");
		jfrm.add(jtextField);
		jfrm.add(label);
		jtextField.addCaretListener(new CaretListener() {
			
			public void caretUpdate(CaretEvent arg0) {
				// TODO Auto-generated method stub
				if(null!=label)
				{
				label.setText(jtextField.getText().toUpperCase());
				label.setToolTipText(jtextField.getSelectedText());
				label.setSize(10, 20);
				label.setAlignmentX(20);
				label.setAlignmentY(50);
				}
				
			}
		});
		
		jfrm.setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					new TextFieldDemo();
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
