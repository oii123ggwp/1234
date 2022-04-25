import java.util.Calendar;
import java.util.Date;

public class Customer {
	private static int cid = 0;
	private String Firstname;
	private String Lastname;
	private String contact_no;
	private int customer_id;
	private String IDcardnumber;
	private Calendar customeraccount_create_time_c;
	private Date customeraccount_create_time_d;
	private Boolean canBorrowbook;
	private int borrowbookcount;
	
	public Customer(String Fname, String Lname, String contactno, String IDcNumber) {
		Firstname = Fname;
		Lastname = Lname;
		contact_no = contactno;
		IDcardnumber = IDcNumber;
		customeraccount_create_time_c = Calendar.getInstance();
		customeraccount_create_time_d = customeraccount_create_time_c.getTime();
		canBorrowbook = true;
		borrowbookcount = 0;
		customer_id = cid++;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public String getContactno() {
		return contact_no;
	}
	public int getCustomerid() {
		return customer_id;
	}
	public String getIDcardnumber() {
		return IDcardnumber;
	}
	public Calendar getcustomeraccountCreateTime_c() {
		return customeraccount_create_time_c;
	}
	public Date getcustomeraccountCreateTime_d() {
		return customeraccount_create_time_d;
	}
	public Boolean getcanBorrowbook() {
		return canBorrowbook;
	}
	public int getborrowbookcount() {
		return borrowbookcount;
	}
	public void setcanBorrowbooktofalse() {
		canBorrowbook = false;
	}
	public void addborrowbookcount() {
		borrowbookcount += 1;
	}
	public void setcanBorrowbooktotrue() {
		canBorrowbook = true;
	}
}
