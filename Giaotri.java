//Bùi Công Anh - 715105005
package BuiCongAnh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Giaotri extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenGT;
	private JTextField txtMaGt;
	private JTextField txtGiaGt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giaotri frame = new Giaotri();
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
	public Giaotri() {
		setTitle("Giao trinh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin giáo trình");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(200, 28, 242, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên giáo trình");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(38, 106, 126, 35);
		contentPane.add(lblNewLabel_1);
		
		txtTenGT = new JTextField();
		txtTenGT.setBounds(38, 142, 115, 20);
		contentPane.add(txtTenGT);
		txtTenGT.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Loại giáo trình");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(38, 173, 126, 20);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbNangcao = new JRadioButton("Nâng cao");
		rdbNangcao.setBounds(38, 212, 109, 23);
		contentPane.add(rdbNangcao);
		
		JRadioButton rdbCoban = new JRadioButton("Cơ bản");
		rdbCoban.setBounds(38, 250, 109, 23);
		contentPane.add(rdbCoban);
		
		JLabel lblNewLabel_3 = new JLabel("Mã giáo trình");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(334, 112, 106, 23);
		contentPane.add(lblNewLabel_3);
		
		txtMaGt = new JTextField();
		txtMaGt.setBounds(334, 142, 96, 20);
		contentPane.add(txtMaGt);
		txtMaGt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Giá");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(334, 172, 46, 23);
		contentPane.add(lblNewLabel_4);
		
		txtGiaGt = new JTextField();
		txtGiaGt.setBounds(334, 206, 86, 20);
		contentPane.add(txtGiaGt);
		txtGiaGt.setColumns(10);
		
		JButton btnThemGT = new JButton("Thêm");
		btnThemGT.setForeground(new Color(0, 0, 0));
		btnThemGT.setBackground(new Color(255, 0, 0));
		btnThemGT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThemGT.setBounds(43, 333, 89, 23);
		contentPane.add(btnThemGT);
		
		JButton btnluuGt = new JButton("Lưu dữ liệu");
		btnluuGt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnluuGt.setBackground(new Color(255, 0, 0));
		btnluuGt.setBounds(218, 334, 115, 23);
		contentPane.add(btnluuGt);
		
		JButton btnthoat = new JButton("Thoát");
		btnthoat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnthoat.setBackground(new Color(255, 0, 0));
		btnthoat.setBounds(409, 334, 89, 23);
		contentPane.add(btnthoat);
	}
}
