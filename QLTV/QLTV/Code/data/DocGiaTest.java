package data;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;

import org.junit.Before;
import org.junit.Test;
import javax.swing.table.DefaultTableModel;

public class DocGiaTest {
	 private GDadmin gd;
	 ResultSet rs;
	 Connection conn;
	 @Before
	 public void setUp() throws Exception {
	        gd = new GDadmin();
	        
	 }

	@Test
	public void SachTest_1() {
		String[] headers = { "Mã sách", "Tên sách", "Tên tác giả", "Nhà xuất bản", "Số lượng","Thể loại" };
        DefaultTableModel tblModel = new DefaultTableModel(headers, 0);
		gd.textField.setText("Trung");
//		gd.table.setModel(tblModel);
		int x = gd.table.getSelectedRow();
		if (x >= 0) {
			assertEquals("MS08", gd.table.getValueAt(x, 0)+ "");
			assertEquals("Trung", gd.table.getValueAt(x, 1)+ "");
			assertEquals("Tru", gd.table.getValueAt(x, 2)+ "");
			assertEquals("Trun", gd.table.getValueAt(x, 3)+ "");
			assertEquals("11", gd.table.getValueAt(x, 4)+ "");
			assertEquals("Magazine", gd.table.getValueAt(x, 5)+ "");
		}	
	}

}
