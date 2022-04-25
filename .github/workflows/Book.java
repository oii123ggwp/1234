import java.awt.*;
import java.util.*;

import javax.swing.*;

public class Book {
	private static int bid = 0;
	private String ISBN;
	private String Book_title;
	private String Author_name;
	private String Publisher_name;
	private Boolean Available;
	private int Book_id;
	private Calendar last_rent_time_c;
	private Calendar Book_added_time_c;
	private Date last_rent_time;
	private Date Book_added_time;
	private ImageIcon bookimageIcon;
	private Image bookimage;
	
	public Book(String ISBN, String Book_t, String Author_n, String Publisher_n , String imagename) {
		this.ISBN = ISBN;
		Book_title = Book_t;
		Author_name = Author_n;
		Publisher_name = Publisher_n;
		Available = true;
		Book_id = bid++;
		Book_added_time_c = Calendar.getInstance();
		Book_added_time = Book_added_time_c.getTime();
		bookimageIcon = new ImageIcon(imagename);
		bookimage = bookimageIcon.getImage();
	}
	public int getBookID() {
		return Book_id;
	}
	public String getISBN(){
		return ISBN;
	}
	public String getBooktitle() {
		return Book_title;
	}
	public String getAuthorname() {
		return Author_name;
	}
	public String getPublishername() {
		return Publisher_name;
	}
	public Boolean getAvaible() {
		return Available;
	}
	public void renew_rent_time(){
		last_rent_time_c = Calendar.getInstance();
		last_rent_time = last_rent_time_c.getTime();
	}
	public void settoAvaible() {
		Available = true;
	}
	public void settounAvaible() {
		Available = false;
	}
	public Date getLastrentTime_date() {
		return last_rent_time;
	}
	public Date getBookaddedTime_date() {
		return Book_added_time;
	}
	public Calendar getLastrentTime_c() {
		return last_rent_time_c;
	}
	public Calendar getBookaddedTime_c() {
		return Book_added_time_c;
	}
	public Image getbookimage() {
		return bookimage;
	}
	public ImageIcon getbookimageicon() {
		return bookimageIcon;
	}
	public void setNewbookimage(String newbookimagename) {
		bookimageIcon = new ImageIcon(newbookimagename);
		bookimage = bookimageIcon.getImage();
	}
}
