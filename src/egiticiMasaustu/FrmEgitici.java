package egiticiMasaustu;

import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmEgitici {

	private JFrame frame;
	private JTextField txtAd;
	private JTextField txtSoyad;
	private JTextField txtAdres;
	private JTextField txtBrans;
	JFormattedTextField txtTC;
	JFormattedTextField txtCalismaSaatleri;
	JFormattedTextField txtGSM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEgitici window = new FrmEgitici();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public FrmEgitici() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ad:");
		lblNewLabel.setBounds(10, 21, 77, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Soyad:");
		lblNewLabel_1.setBounds(10, 53, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TC Kimlik No:");
		lblNewLabel_2.setBounds(10, 94, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblGsm = new JLabel("GSM:");
		lblGsm.setBounds(10, 139, 77, 14);
		frame.getContentPane().add(lblGsm);
		
		JLabel lblAdres = new JLabel("Adres:");
		lblAdres.setBounds(232, 94, 91, 14);
		frame.getContentPane().add(lblAdres);
		
		JLabel lblNewLabel_3 = new JLabel("Bran\u015F:");
		lblNewLabel_3.setBounds(232, 21, 91, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblalmaSaatleri = new JLabel("\u00C7al\u0131\u015Fma Saatleri:");
		lblalmaSaatleri.setBounds(232, 53, 91, 14);
		frame.getContentPane().add(lblalmaSaatleri);
		
		txtAd = new JTextField();
		txtAd.setBounds(107, 18, 105, 20);
		frame.getContentPane().add(txtAd);
		txtAd.setColumns(10);
		
		txtSoyad = new JTextField();
		txtSoyad.setBounds(107, 50, 105, 20);
		frame.getContentPane().add(txtSoyad);
		txtSoyad.setColumns(10);
		
		JFormattedTextField txtTC = new JFormattedTextField(new MaskFormatter("###########"));
		txtTC.setBounds(107, 91, 105, 20);
		frame.getContentPane().add(txtTC);
		
		JFormattedTextField txtGSM = new JFormattedTextField(new MaskFormatter("0###-###-##-##"));
		txtGSM.setBounds(107, 136, 105, 20);
		frame.getContentPane().add(txtGSM);
		
		txtAdres = new JTextField();
		txtAdres.setBounds(354, 90, 105, 63);
		frame.getContentPane().add(txtAdres);
		txtAdres.setColumns(10);
		
		txtBrans = new JTextField();
		txtBrans.setBounds(354, 18, 105, 20);
		frame.getContentPane().add(txtBrans);
		txtBrans.setColumns(10);
		
		JButton btnYeniKayit = new JButton("Yeni Kay\u0131t");
		btnYeniKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ekraniTemizle();
			}
		});
		btnYeniKayit.setBounds(10, 211, 89, 23);
		frame.getContentPane().add(btnYeniKayit);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(107, 211, 89, 23);
		frame.getContentPane().add(btnKaydet);
		
		JButton btnDuzenle = new JButton("D\u00FCzenle");
		btnDuzenle.setBounds(232, 211, 89, 23);
		frame.getContentPane().add(btnDuzenle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(331, 211, 89, 23);
		frame.getContentPane().add(btnSil);
		
		JButton btnCikis = new JButton("\u00C7IKI\u015E");
		btnCikis.setBounds(331, 262, 89, 56);
		frame.getContentPane().add(btnCikis);
		
		JFormattedTextField txtCalismaSaatleri = new JFormattedTextField(new MaskFormatter("##:## - ##:##"));
		txtCalismaSaatleri.setBounds(354, 50, 105, 20);
		frame.getContentPane().add(txtCalismaSaatleri);
	}
	
	
	public void ekraniTemizle() {
		txtAdres.setText("");
		txtBrans.setText("");
		txtSoyad.setText("");
		txtTC.setText("");
		txtAd.setText("");
		
		
		
		txtCalismaSaatleri.setText("");
		txtGSM.setText("");
		
			
	}
}
