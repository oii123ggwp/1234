
public class employee_authentication {
	private String employee_id;
	private String employee_password;
	
	public employee_authentication() {
		employee_id = "48763";
		employee_password = "69_420";
	}
	public employee_authentication(String eid, String epassword) {
		employee_id = eid;
		employee_password = epassword;
	}
	
	public String getemployeeid() {
		return employee_id;
	}
	public String getemployeepassword() {
		return employee_password;
	}
	public void setempoloyeeid(String setValue) {
		employee_id = setValue;
	}
	public void setempolyeepassword(String setValue) {
		employee_password = setValue;
	}
}
