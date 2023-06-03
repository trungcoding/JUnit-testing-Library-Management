package data;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LoginTest {

    private Login login;

    @Before
    public void setUp() throws Exception {
        login = new Login();
    }

    @Test
    public void loginTest_1() {
        login.textField.setText("admin");
        login.passwordField.setText("admin");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Đăng nhập thành công!", login.result);
    }
    
    @Test
    public void loginTest_2() {
    login.textField.setText("admin");
    login.passwordField.setText("password");
    login.btnNewButton.doClick();
    assertEquals("Sai tài khoản hoặc mật khẩu!", login.result);
    }

    @Test
    public void loginTest_3() {
        login.textField.setText("username");
        login.passwordField.setText("admin");
        login.btnNewButton.doClick();
        assertEquals("Sai tài khoản hoặc mật khẩu!", login.result);
    }

    @Test
    public void loginTest_4() {
        login.textField.setText("");
        login.passwordField.setText("");
        login.btnNewButton.doClick();
        assertEquals("Chưa nhập Tài khoản!", login.result);
    }
    
    @Test
    public void loginTest_5() {
        login.textField.setText("admin");
        login.passwordField.setText("");
        login.btnNewButton.doClick();
        assertEquals("Chưa nhập Mật khẩu!", login.result);
    }
    
    @Test
    public void loginTest_6() {
        login.textField.setText("");
        login.passwordField.setText("admin");
        login.btnNewButton.doClick();
        assertEquals("Chưa nhập Tài khoản!", login.result);
    }
    
    @Test
    public void loginTest_7() {
        login.textField.setText("admin@");
        login.passwordField.setText("admin");
        login.btnNewButton.doClick();
        assertEquals("Tài khoản chứa ký tự đặc biệt!", login.result);   
    }
    
    @Test
    public void loginTest_8() {
        login.textField.setText("admin");
        login.passwordField.setText("@admin");
        login.btnNewButton.doClick();
        assertEquals("Mật khẩu chứa ký tự đặc biệt!", login.result);   
    }
    
    @Test
    public void loginTest_9() {
        login.textField.setText("ADMIN");
        login.passwordField.setText("ADMIN");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Đăng nhập thành công!", login.result);
    }
    
    @Test
    public void loginTest_10() {
        login.textField.setText("    ");
        login.passwordField.setText("   ");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Chưa nhập Tài khoản!", login.result);
    }
    
    @Test
    public void loginTest_13() {
        login.textField.setText("     admin");
        login.passwordField.setText("    admin");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Đăng nhập thành công!", login.result);
    }
    @Test
    public void loginTest_14() {
        login.textField.setText("admin1");
        login.passwordField.setText("    admin");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Tên đăng nhập chứa ký tự số!", login.result);
    }
    @Test
    public void loginTest_15() {
        login.textField.setText("admin");
        login.passwordField.setText("    admin1");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Mật khẩu chứa ký tự số!", login.result);
    }
    
    @Test
    public void loginTest_16() {
        login.textField.setText("admin@1");
        login.passwordField.setText("admin1");
        login.btnNewButton.doClick();
        GDadmin gd = new GDadmin();
        gd.setVisible(true);
        assertEquals("Tên đăng nhâp chứa ký tự số và ký tự đặt biệt!", login.result);
    }
}

