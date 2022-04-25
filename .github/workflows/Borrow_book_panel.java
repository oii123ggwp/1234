import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Borrow_book_panel extends JFrame{

	public static ArrayList<Book> burh_book = new ArrayList<Book>();//will be deleted
	public static ArrayList<Customer> burh_c = new ArrayList<Customer>();//will be deleted
	public static ArrayList<Borrow_transaction> burh_tt = new ArrayList<Borrow_transaction>();//will be deleted
	public static String employee_ID = "ggwp";//will be deleted

	private static final long serialVersionUID = 1L;
	private JLabel Book_id_label = new JLabel("Book ID");
	private JTextField Book_id_textfield = new JTextField("Only enter number");
	private JLabel Customer_id_label = new JLabel("Customer ID");
	private JTextField Customer_id_textfield = new JTextField("Only enter number");
	private JButton submit_button = new JButton("Submit");
	
	JFrame dialog = new JFrame();
	
		
	private static boolean book_exist;
	private static boolean cid_exist;
	static int b;
	static int c;
	
	private static int n;
	

	public static void main(String[] args) {
		Book abc = new Book("123", "123", "abc", "bcd", "adf.gif");//will be deleted
		Customer cde = new Customer("a","a","a","a");//will be deleted
		burh_book.add(abc);//will be deleted
		burh_c.add(cde);//will be deleted
		Borrow_book_panel ggwp = new Borrow_book_panel();//will be deleted
		ggwp.setLocationRelativeTo(null);//will be deleted
		ggwp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//will be deleted
		ggwp.setSize(500,200);//will be deleted
		ggwp.setVisible(true);//will be deleted
	}
	
	
	
	
	
	
	
	public Borrow_book_panel() {
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel panel_c = new JPanel();
		JPanel panel_s = new JPanel();
		JPanel panel_w = new JPanel();
		JPanel panel_e = new JPanel();
		JPanel panel_n = new JPanel();
		
		panel_c.setLayout(new GridLayout(2,2,5,5));
		panel_s.setLayout(new FlowLayout());
		
		panel_c.add(Book_id_label);
		panel_c.add(Book_id_textfield);
		panel_c.add(Customer_id_label);
		panel_c.add(Customer_id_textfield);
		
		panel_s.add(submit_button);
		
		container.add(panel_c, BorderLayout.CENTER);
		container.add(panel_s, BorderLayout.SOUTH);
		container.add(panel_w, BorderLayout.WEST);
		container.add(panel_e, BorderLayout.EAST);
		container.add(panel_n, BorderLayout.NORTH);
		
		submit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input_bookid_text = Book_id_textfield.getText();
				int input_bookid = Integer.parseInt(input_bookid_text);
				String input_customerid_text = Customer_id_textfield.getText();
				int input_customerid = Integer.parseInt(input_customerid_text);
				book_exist = false;
				cid_exist = false;

					
				for (int i = 0; i < burh_book.size(); i++) {
					 if (burh_book.get(i).getBookID() == input_bookid) {
						 book_exist = true;
						 b = i;
					 }	 
				}
				for (int i = 0; i < burh_c.size(); i++) {
					if (burh_c.get(i).getCustomerid() == input_customerid) {
						 cid_exist = true;
						 c = i;
					 }	 
				}
				
				if ((burh_c.get(c).getcanBorrowbook()) && (burh_book.get(b).getAvaible()) ) {
					
					if(book_exist && cid_exist) {
					
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						n = JOptionPane.showConfirmDialog(dialog,"Are you sure the data is fine and you want to sumbit the borrow request?", "Confrime borrow request", JOptionPane.YES_NO_OPTION);
						if(n == 0) {
						burh_book.get(b).settounAvaible();
						burh_c.get(c).setcanBorrowbooktofalse();
						
						
						burh_c.get(c).addborrowbookcount();
						
						burh_book.get(b).renew_rent_time();
						burh_tt.add(new Borrow_transaction(burh_book.get(b).getBookID(), employee_ID, burh_c.get(c).getCustomerid()));
						
						}
			
						
					}
					else if(book_exist && (cid_exist == false)) {
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JOptionPane.showConfirmDialog(dialog,"The customer id doesn't exist", "ERROR", JOptionPane.WARNING_MESSAGE);
					}
					else if((book_exist == false) && cid_exist) {
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JOptionPane.showConfirmDialog(dialog,"The Book id doesn't exist", "ERROR", JOptionPane.WARNING_MESSAGE);
					}
					else if((book_exist == false) && (cid_exist == false)) {
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JOptionPane.showConfirmDialog(dialog,"Customer id and Book id don't exist", "ERROR", JOptionPane.WARNING_MESSAGE);
					}
				}
				else if ((burh_c.get(c).getcanBorrowbook() == false) && (burh_book.get(b).getAvaible()) ){
					dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JOptionPane.showConfirmDialog(dialog,"The customer is not allowed to borrow book", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				else if(( burh_book.get(b).getAvaible() == false) &&(burh_c.get(c).getcanBorrowbook() )) {
					dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JOptionPane.showConfirmDialog(dialog,"The Book is not allowed to be borrowed", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				else if ((burh_c.get(c).getcanBorrowbook() == false)&&(burh_book.get(b).getAvaible() == false)){
					dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JOptionPane.showConfirmDialog(dialog,"The Book is not allowed to be borrowed and the customer is not allowed to borrow book ", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}	
		 });		
	     
	}
}	
