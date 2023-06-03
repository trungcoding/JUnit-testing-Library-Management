package data;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;

public class SachTest {
	ResultSet rs;
	Connection conn;
	@Before
	public void setUp() throws Exception {
		GDadmin gdAdmin = new GDadmin();
	}       
    @Test
    public void sachTest_1() {
    	GDadmin gdAdmin = new GDadmin();     
        gdAdmin.textField_1.setText("");
        gdAdmin.textField_2.setText("");
        gdAdmin.textField_3.setText("");
        gdAdmin.textField_4.setText("");
        gdAdmin.textField_10.setText("");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Vui lòng nhập đủ thông tin!", gdAdmin.result);
        
        
    }
//   PASS
    @Test
    public void sachTest_3() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS01");
        gdAdmin.textField_2.setText("BGD-DT");
        gdAdmin.textField_3.setText("BGD-DT");
        gdAdmin.textField_4.setText("Tiếng Anh");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Mã sách đã tồn tại!", gdAdmin.result);   
    }
//   PASS
    @Test
    public void sachTest_5() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS11");
        gdAdmin.textField_2.setText("BGD-DT");
        gdAdmin.textField_3.setText("BGD-DT");
        gdAdmin.textField_4.setText("Tiếng Anh");
        gdAdmin.textField_10.setText("-1");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Số lượng là số tự nhiên", gdAdmin.result);    
    }
    
    @Test
    public void sachTest_7() {   
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02");
        gdAdmin.textField_2.setText("BGD-DT");
        gdAdmin.textField_3.setText("BGD-DT");
        gdAdmin.textField_4.setText("Tiếng Anh");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Sửa thành công!", gdAdmin.result);
    }
//    PASS
    @Test
    public void sachTest_8() { 
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02");
        gdAdmin.textField_2.setText("");
        gdAdmin.textField_3.setText("BGD-DT");
        gdAdmin.textField_4.setText("Tiếng Anh");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Vui lòng nhập đủ thông tin!", gdAdmin.result);        
    }
    
    @Test
    public void sachTest_10() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02");
        gdAdmin.textField_2.setText("BGD-DT");
        gdAdmin.textField_3.setText("");
        gdAdmin.textField_4.setText("Tiếng Anh");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Sửa thất bại!", gdAdmin.result);
    }
    
//    PASS
    @Test
    public void sachTest_11() {    
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02");
        gdAdmin.textField_2.setText("andb");
        gdAdmin.textField_3.setText("BGD-DT");
        gdAdmin.textField_4.setText("");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Vui lòng nhập đủ thông tin!", gdAdmin.result);  
    }
    
//    PASS
    @Test
    public void sachTest_13() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02");
        gdAdmin.textField_2.setText("");
        gdAdmin.textField_3.setText("");
        gdAdmin.textField_4.setText("");
        gdAdmin.textField_10.setText("-1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Vui lòng nhập đủ thông tin!", gdAdmin.result);
    }
//    PASS
    @Test
    public void sachTest_14() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02");
        gdAdmin.textField_2.setText("andb");
        gdAdmin.textField_3.setText("BGD-DT");
        gdAdmin.textField_4.setText("");
        gdAdmin.textField_10.setText("");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Vui lòng nhập đủ thông tin!", gdAdmin.result); 
    }
//    PASS
    @Test
    public void sachTest_16() {  
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("");
        gdAdmin.textField_2.setText("abc");
        gdAdmin.textField_3.setText("sach");
        gdAdmin.textField_4.setText("sach");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Vui lòng nhập đủ thông tin!", gdAdmin.result);
    }
//    FAILED
    @Test
    public void sachTest_17() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS02@");
        gdAdmin.textField_2.setText("andb@");
        gdAdmin.textField_3.setText("BGD-DT@");
        gdAdmin.textField_4.setText("asđ");
        gdAdmin.textField_10.setText("11");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Mã sách đã tồn tại!", gdAdmin.result);  
    }
//    FAILED
    @Test
    public void sachTest_19() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS01");
        gdAdmin.textField_2.setText("abc@");
        gdAdmin.textField_3.setText("sach@");
        gdAdmin.textField_4.setText("sach@");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Sửa thành công!", gdAdmin.result);
    }
//    PASS
    @Test
    public void sachTest_20() { 
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS01");
        gdAdmin.textField_2.setText("andb@");
        gdAdmin.textField_3.setText("BGD-DT@");
        gdAdmin.textField_4.setText("asđ");
        gdAdmin.textField_10.setText("11");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Mã sách đã tồn tại!", gdAdmin.result); 
    }
    
    @Test
    public void sachTest_22() {  
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS100");
        gdAdmin.textField_2.setText("abc@");
        gdAdmin.textField_3.setText("sach@");
        gdAdmin.textField_4.setText("sach@");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Sửa thành công!", gdAdmin.result);
    }
//    failed
    @Test
    public void sachTest_23() {   
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS01");
        gdAdmin.textField_2.setText("    ");
        gdAdmin.textField_3.setText("BGD-DT@");
        gdAdmin.textField_4.setText("asđ");
        gdAdmin.textField_10.setText("0");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Thêm thất bại!", gdAdmin.result);
    }
    
//    failed
    @Test
    public void sachTest_25() {     
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("MS1");
        gdAdmin.textField_2.setText("      ");
        gdAdmin.textField_3.setText("sach");
        gdAdmin.textField_4.setText("sach");
        gdAdmin.textField_10.setText("1");
        gdAdmin.btnNewButton_1_1.doClick();
        assertEquals("Sửa thất bại!", gdAdmin.result);
    }
    
//    pass
    @Test
    public void sachTest_26() {
        GDadmin gdAdmin = new GDadmin();
        gdAdmin.textField_1.setText("     ");
        gdAdmin.textField_2.setText(" accvv ");
        gdAdmin.textField_3.setText("BGD-DT@");
        gdAdmin.textField_4.setText("asđ");
        gdAdmin.textField_10.setText("0");
        gdAdmin.btnNewButton_1.doClick();
        assertEquals("Thêm thất bại!", gdAdmin.result);     
    }
    
//  failed
  @Test
  public void sachTest_28() {   
      GDadmin gdAdmin = new GDadmin();
      gdAdmin.textField_1.setText("MS1");
      gdAdmin.textField_2.setText("1234 ");
      gdAdmin.textField_3.setText("sach");
      gdAdmin.textField_4.setText("sach");
      gdAdmin.textField_10.setText("1");
      gdAdmin.btnNewButton_1_1.doClick();
      assertEquals("Sửa thất bại!", gdAdmin.result);   
  }
  
//  FAILED
  @Test
  public void sachTest_29() {
    
      GDadmin gdAdmin = new GDadmin(); 
      gdAdmin.textField_1.setText("MS01 ");
      gdAdmin.textField_2.setText(" accvv ");
      gdAdmin.textField_3.setText("      ");
      gdAdmin.textField_4.setText("asđ");
      gdAdmin.textField_10.setText("0");
      gdAdmin.btnNewButton_1.doClick();
      assertEquals("Thêm thất bại!", gdAdmin.result);
      
      
  }
  
//FAILED
@Test
public void sachTest_31() {
    GDadmin gdAdmin = new GDadmin();
    gdAdmin.textField_1.setText("MS1");
    gdAdmin.textField_2.setText("1234 ");
    gdAdmin.textField_3.setText("sach");
    gdAdmin.textField_4.setText("            ");
    gdAdmin.textField_10.setText("1");
    gdAdmin.btnNewButton_1_1.doClick();
    assertEquals("Sửa thất bại!", gdAdmin.result);
    
    
}

//PASS
@Test
public void sachTest_32() {

  GDadmin gdAdmin = new GDadmin();
  gdAdmin.textField_1.setText("     ");
  gdAdmin.textField_2.setText("      ");
  gdAdmin.textField_3.setText("      ");
  gdAdmin.textField_4.setText("BGD-DT");
  gdAdmin.textField_10.setText("0");
  gdAdmin.btnNewButton_1.doClick();
  assertEquals("Thêm thất bại!", gdAdmin.result);
  
  
}

@Test
public void sachTest_34() {
  
    GDadmin gdAdmin = new GDadmin();
    gdAdmin.textField_1.setText("MS1");
    gdAdmin.textField_2.setText("SACH@ ");
    gdAdmin.textField_3.setText("NHAN");
    gdAdmin.textField_4.setText("BGD-DT");
    gdAdmin.textField_10.setText("1");
    gdAdmin.btnNewButton_1_1.doClick();
    assertEquals("Sửa thất bại!", gdAdmin.result);
    
    
}
//FAIL
@Test
public void sachTest_35() {

  GDadmin gdAdmin = new GDadmin();
  gdAdmin.textField_1.setText("MS100");
  gdAdmin.textField_2.setText("SACH");
  gdAdmin.textField_3.setText("NHAN@");
  gdAdmin.textField_4.setText("BGD-DT"); 
  gdAdmin.textField_10.setText("0");
  gdAdmin.btnNewButton_1.doClick();
  assertEquals("Thêm thất bại!", gdAdmin.result);
  
  
}
//FAIL
@Test
public void sachTest_37() {
  
    GDadmin gdAdmin = new GDadmin();
    gdAdmin.textField_1.setText("MS1");
    gdAdmin.textField_2.setText("SACH");
    gdAdmin.textField_3.setText("NHAN");
    gdAdmin.textField_4.setText("BGD-DT@");
    gdAdmin.textField_10.setText("1");
    gdAdmin.btnNewButton_1_1.doClick();
    assertEquals("Sửa thất bại!", gdAdmin.result);
    
    
}
//PASS
@Test
public void sachTest_38() {
  GDadmin gdAdmin = new GDadmin();
  gdAdmin.textField_1.setText("MS100");
  gdAdmin.textField_2.setText("");
  gdAdmin.textField_3.setText("");
  gdAdmin.textField_4.setText("");
  gdAdmin.textField_10.setText("1");
  gdAdmin.btnNewButton_1.doClick();
  assertEquals("Thêm thất bại!", gdAdmin.result);
  
  
}
}

