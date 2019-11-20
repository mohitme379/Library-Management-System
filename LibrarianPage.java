import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class LibrarianPage extends JFrame {
	
	JPanel contentPane = new JPanel();
	AddBook addBook = new AddBook();
	AddStudent addStudent = new AddStudent();
	AddAuthor addAuthor = new AddAuthor();
	AddPublication addPublication = new AddPublication();
	AddCategory addCategory = new AddCategory();
	AddSubject addSubject = new AddSubject();
	Welcome welcome = new Welcome();

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianPage frame = new LibrarianPage();
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
	public LibrarianPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 498);
		getContentPane().setLayout(null);
		contentPane.setBounds(0, 0, 471, 461);
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFocusable(false);
		menuBar.setBounds(0, 0, 471, 22);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAllBooks = new JMenuItem("All Books");
		mnFile.add(mntmAllBooks);
		
		JMenuItem mntmIssuedBooks = new JMenuItem("Issued Books");
		mnFile.add(mntmIssuedBooks);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnAdd = new JMenu("Add");
		mnAdd.setFocusable(false);
		menuBar.add(mnAdd);
		
		JMenuItem mntmStudent = new JMenuItem("Student");
		mntmStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudent.setVisible(true);
				addBook.setVisible(false);
				addAuthor.setVisible(false);
				addPublication.setVisible(false);
				addCategory.setVisible(false);
				addSubject.setVisible(false);
				welcome.setVisible(false);
			}
		});
		mnAdd.add(mntmStudent);
		
		JMenuItem mntmBook = new JMenuItem("Book");
		mntmBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBook.setVisible(true);
				addStudent.setVisible(false);
				addAuthor.setVisible(false);
				addPublication.setVisible(false);
				addCategory.setVisible(false);
				addSubject.setVisible(false);
				welcome.setVisible(false);
			}
		});
		mnAdd.add(mntmBook);
		
		JMenuItem mntmAuthor = new JMenuItem("Author");
		mntmAuthor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudent.setVisible(false);
				addBook.setVisible(false);
				addAuthor.setVisible(true);
				addPublication.setVisible(false);
				addCategory.setVisible(false);
				addSubject.setVisible(false);
				welcome.setVisible(false);
			}
		});
		mnAdd.add(mntmAuthor);
		
		JMenuItem mntmPublication = new JMenuItem("Publication");
		mntmPublication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudent.setVisible(false);
				addBook.setVisible(false);
				addAuthor.setVisible(false);
				addPublication.setVisible(true);
				addCategory.setVisible(false);
				addSubject.setVisible(false);
				welcome.setVisible(false);
			}
		});
		mnAdd.add(mntmPublication);
		
		JMenuItem mntmCategory = new JMenuItem("Category");
		mntmCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudent.setVisible(false);
				addBook.setVisible(false);
				addAuthor.setVisible(false);
				addPublication.setVisible(false);
				addCategory.setVisible(true);
				addSubject.setVisible(false);
				welcome.setVisible(false);
			}
		});
		mnAdd.add(mntmCategory);
		
		JMenuItem mntmSubject = new JMenuItem("Subject");
		mntmSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudent.setVisible(false);
				addBook.setVisible(false);
				addAuthor.setVisible(false);
				addPublication.setVisible(false);
				addCategory.setVisible(false);
				addSubject.setVisible(true);
				welcome.setVisible(false);
			}
		});
		mnAdd.add(mntmSubject);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setFocusable(false);
		menuBar.add(mnEdit);
		
		JMenuItem menuItem = new JMenuItem("Student");
		mnEdit.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Book");
		mnEdit.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Author");
		mnEdit.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Publication");
		mnEdit.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Category");
		mnEdit.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Subject");
		mnEdit.add(menuItem_5);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(218, 218, 1, 1);
		contentPane.add(layeredPane);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 471, Short.MAX_VALUE)
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 423, Short.MAX_VALUE)
		);
		layeredPane.setLayout(gl_layeredPane);
		
		welcome.setBounds(0, 102, 471, 265);
		contentPane.add(welcome);
		welcome.setVisible(true);
		
		addBook.setBounds(0, 18, 471, 443);
		contentPane.add(addBook);
		addBook.setVisible(false);
		
		addStudent.setBounds(0, 18, 471, 443);
		contentPane.add(addStudent);
		addStudent.setVisible(false);
		
		addAuthor.setBounds(0, 18, 471, 443);
		contentPane.add(addAuthor);
		addAuthor.setVisible(false);
		
		addPublication.setBounds(0, 18, 471, 443);
		contentPane.add(addPublication);
		addPublication.setVisible(false);
		
		addCategory.setBounds(0, 18, 471, 443);
		contentPane.add(addCategory);
		addCategory.setVisible(false);
		
		addSubject.setBounds(0, 18, 471, 443);
		contentPane.add(addSubject);
		addSubject.setVisible(false);
		
		
	}
}
