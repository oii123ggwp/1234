import java.util.*;

public class Borrow_transaction {
	private static int tid = 0;
	int Book_id;
	String employee_id;
	Calendar transaction_create_time_c;
	Date transaction_create_time_d;
	int Transaction_id;
	int customer_id;
	
	public Borrow_transaction(int Book_id, String employee_id, int customer_id) {
		this.Book_id = Book_id;
		this.employee_id = employee_id;
		this.customer_id = customer_id;
		transaction_create_time_c = Calendar.getInstance();
		transaction_create_time_d = transaction_create_time_c.getTime();
		Transaction_id = tid++;
	}
	public int getCustomerID_t() {
		return customer_id;
	}
	
	public int getBookID_t() {
		return Book_id;
	}
	public String getEmployeeID_t() {
		return employee_id;
	}
	public Calendar getTranCreatetime_c() {
		return transaction_create_time_c;
	}
	public Date getTranCreatetime_d() {
		return transaction_create_time_d;
	}
	public int getTranID() {
		return Transaction_id;
	}
}
