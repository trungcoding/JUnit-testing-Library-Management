package data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField;
	public JPasswordField passwordField;
	public JButton btnNewButton;
	public GDadmin gd;

	Connect cn = new Connect();
	Connection conn;
	public Object result;
	public Object gdadmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("QUẢN LÝ THƯ VIỆN");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/image/H.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD TH\u01AF VI\u1EC6N");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel.setBounds(232, 10, 241, 30);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(471, 126, 217, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("T\u00E0i kho\u1EA3n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(387, 126, 74, 30);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("M\u1EADt kh\u1EA9u");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(387, 194, 74, 30);
		contentPane.add(lblNewLabel_1_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(471, 194, 217, 30);
		contentPane.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/B.png")));
		lblNewLabel_2.setBounds(60, 61, 272, 305);
		contentPane.add(lblNewLabel_2);

		JButton btnThot = new JButton("Thoát");
		btnThot.setIcon(new ImageIcon(Login.class.getResource("/image/G.png")));
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnThot.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnThot.setBounds(514, 319, 137, 38);
		contentPane.add(btnThot);


		JButton btnNewButton = new JButton("\u0110\u0103ng nh\u1EADp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					result = "Chưa nhập Tài khoản!";
					JOptionPane.showMessageDialog(null, "Chưa nhập Tài khoản!", "Empty", JOptionPane.WARNING_MESSAGE);
				}
				else if (!isValidUsername(textField.getText())) {
					result = "Tài khoản chứa ký tự đặc biệt!";
                    JOptionPane.showMessageDialog(null, "Tài khoản chứa ký tự đặc biệt!", "Invalid Username", JOptionPane.WARNING_MESSAGE);
				}
				else if (passwordField.getText().equals("")) {
					result = "Chưa nhập Mật khẩu!";
					JOptionPane.showMessageDialog(null, "Chưa nhập Mật khẩu!", "Empty", JOptionPane.WARNING_MESSAGE);
				}
				else if (!isValidPassword(passwordField.getText())) {
					result = "Mật khẩu chứa ký tự đặc biệt!";
                    JOptionPane.showMessageDialog(null, "Mật khẩu chứa ký tự đặc biệt!", "Invalid Password", JOptionPane.WARNING_MESSAGE);
				}
				else {
					try {
						conn = cn.getConnection();
						String sql = "SELECT * FROM QUAN_TRI WHERE Ma_Admin=? AND Password=?";
						PreparedStatement ps = conn.prepareStatement(sql);
						ps.setString(1, textField.getText());
						ps.setString(2, passwordField.getText());
						ResultSet rs = ps.executeQuery();
						if (rs.next()) {
							result = "Đăng nhập thành công!";
							GDadmin gd = new GDadmin();
							JOptionPane.showMessageDialog(null, "Đăng nhập thành công!", "Done", JOptionPane.INFORMATION_MESSAGE);
							gd.setVisible(true);
						} else {
							result = "Sai tài khoản hoặc mật khẩu!";
							JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu!", "Failed", JOptionPane.ERROR_MESSAGE);
						}

					} catch (Exception e1) {

					}
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/image/A.png")));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(514, 271, 137, 38);
		contentPane.add(btnNewButton);
		this.btnNewButton = btnNewButton;
		
	}
	 private boolean isValidUsername(String username) {
	        String regex = "^[a-zA-Z0-9_]+$";
	        return username.matches(regex);
	    }
	 
	  private boolean isValidPassword(String password) {
	        String regex = "^[a-zA-Z0-9_!@#$%^&*()]+$";
	        return password.matches(regex);
	    }
	}