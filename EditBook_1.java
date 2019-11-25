import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EditBook_1 extends JFrame {
	
	String BookID;
	Connection con = DBInfo1.getConn();
	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditBook_1 frame = new EditBook_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditBook_1() {
		setTitle("Edit Book");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 458, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(this);
		
		JLabel label_1 = new JLabel("Quantity");
		label_1.setFocusable(false);
		
		JLabel label_2 = new JLabel("Price");
		label_2.setFocusable(false);
		
		JLabel label_3 = new JLabel("ISBN");
		label_3.setFocusable(false);
		
		JLabel label_4 = new JLabel("Subject");
		label_4.setFocusable(false);
		
		JLabel label_5 = new JLabel("Category");
		label_5.setFocusable(false);
		
		JLabel label_6 = new JLabel("Publication");
		label_6.setFocusable(false);
		
		JLabel label_7 = new JLabel("Author");
		label_7.setFocusable(false);
		
		JLabel label_8 = new JLabel("Title");
		label_8.setFocusable(false);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox(DBInfo1.getValues("author"));
		comboBox_3.setFocusable(false);
		
		JComboBox comboBox_2 = new JComboBox(DBInfo1.getValues("publication"));
		comboBox_2.setFocusable(false);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox(DBInfo1.getValues("category"));
		comboBox_1.setFocusable(false);
		
		JComboBox comboBox = new JComboBox(DBInfo1.getValues("subject"));
		comboBox.setFocusable(false);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		
		JButton btnDelete = new JButton("Delete");
		
		JLabel lblEditBook = new JLabel("Edit Book");
		
		JLabel label = new JLabel("Id");
		label.setFocusable(false);
		
		textField_1 = new JTextField((String) null);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		
		String query = "select * from books where Id = "+BookID;
		
		String title = "";
		String author = "";
		String publication = "";
		String category = "";
		String subject = "";
		String isbn = "";
		String price = "";
		String qnt = "";
		
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				title = res.getString(2);
				author = res.getString(3);
				publication = res.getString(4);
				category = res.getString(5);
				subject = res.getString(6);
				isbn = res.getString(7);
				price = res.getString(8);
				qnt = res.getString(9);
			}
			
			textField_1.setText(BookID);
			textField_2.setText(title);
			textField_3.setText(isbn);
			textField_4.setText(price);
			textField_5.setText(qnt);
			comboBox_3.setSelectedItem(author);
			comboBox_2.setSelectedItem(publication);
			comboBox_1.setSelectedItem(category);
			comboBox.setSelectedItem(subject);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(187, Short.MAX_VALUE)
					.addComponent(lblEditBook, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(146))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(55)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addGap(43)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))))
							.addGap(27))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEditBook)
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_8))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_7))
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_6))
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(label_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDelete)
						.addComponent(btnUpdate))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
