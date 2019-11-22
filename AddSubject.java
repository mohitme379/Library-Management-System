import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AddSubject extends JPanel {
	Connection con = DBInfo.getConn();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public AddSubject() {
		
		JLabel lblAddNewSubject = new JLabel("Add New Subject");
		lblAddNewSubject.setFocusable(false);
		lblAddNewSubject.setFont(lblAddNewSubject.getFont ().deriveFont (13.0f));
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFocusable(false);
		
		JLabel label_2 = new JLabel("Id");
		label_2.setFocusable(false);
		
		JLabel label_3 = new JLabel("");
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String query = "insert into subject values(?,?)";
				String query2 = "select * from subject";
				String authName = "";
				String id = "";
				String a = textField.getText();
				String b = textField_1.getText();
				
				PreparedStatement ps2;
				
				try {
					ps2 = con.prepareStatement(query2);
					ResultSet res = ps2.executeQuery();
					while(res.next())
					{
						id = res.getString(1);
						authName = res.getString(2);
					}
						
						if(id.equalsIgnoreCase(a) || authName.equalsIgnoreCase(b))
						{
							JOptionPane.showMessageDialog(getParent(), "Subject Already Exits","Error !",JOptionPane.ERROR_MESSAGE);
							textField.setText(null);
							textField_1.setText(null);
						}
						
						else
						{
						
							try {
								
								PreparedStatement ps = con.prepareStatement(query);
								ps.setString(1, textField.getText().toUpperCase());
								ps.setString(2, textField_1.getText().toUpperCase());
								ps.executeUpdate();
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							textField.setText(null);
							textField_1.setText(null);
							System.exit(0);
							
						}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				LibrarianPage lp = new LibrarianPage();
				lp.dispose();
				lp.setVisible(true);
			}
		});
		button.setOpaque(false);
		button.setFocusable(false);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(189)
							.addComponent(lblAddNewSubject, GroupLayout.PREFERRED_SIZE, 75, Short.MAX_VALUE)
							.addGap(149))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(10))
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
							.addGap(10)))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddNewSubject)
					.addGap(62)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(label_2))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(label_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
