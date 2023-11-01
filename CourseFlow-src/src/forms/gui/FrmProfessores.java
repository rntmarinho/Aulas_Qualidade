package forms.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import entidades.Professor;

public class FrmProfessores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpProfessores;
	private JTextField textField;
	private JTextField txtNome;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProfessores frame = new FrmProfessores();
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
	public FrmProfessores() {
		Professor prof = new Professor();
				
		setTitle("Professores");
		setBounds(100, 100, 659, 300);
		ctpProfessores = new JPanel();
		ctpProfessores.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpProfessores);
		ctpProfessores.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CÓDIGO:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		ctpProfessores.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(83, 8, 109, 20);
		ctpProfessores.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setBounds(202, 11, 46, 14);
		ctpProfessores.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(248, 8, 357, 20);
		ctpProfessores.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("E-MAIL:");
		lblNewLabel_2.setBounds(10, 48, 46, 14);
		ctpProfessores.add(lblNewLabel_2);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(83, 45, 522, 20);
		ctpProfessores.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TELEFONE:");
		lblNewLabel_3.setBounds(10, 85, 71, 14);
		ctpProfessores.add(lblNewLabel_3);
		
		JFormattedTextField ftxtTelefone = new JFormattedTextField();
		ftxtTelefone.setBounds(83, 82, 109, 20);
		ctpProfessores.add(ftxtTelefone);
		
		JLabel lblNewLabel_4 = new JLabel("SALÁRIO:");
		lblNewLabel_4.setBounds(202, 85, 56, 14);
		ctpProfessores.add(lblNewLabel_4);
		
		JFormattedTextField ftxtSalario = new JFormattedTextField();
		ftxtSalario.setBounds(260, 82, 109, 20);
		ctpProfessores.add(ftxtSalario);
		
		JCheckBox ckbStatus = new JCheckBox("PROFESSOR INATIVO");
		ckbStatus.setForeground(Color.RED);
		ckbStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckbStatus.setBounds(448, 81, 156, 23);
		ctpProfessores.add(ckbStatus);
		
		JLabel lblNewLabel_5 = new JLabel("DATA DE NASCIMENTO:");
		lblNewLabel_5.setBounds(10, 131, 131, 14);
		ctpProfessores.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CEP:");
		lblNewLabel_6.setBounds(277, 131, 46, 14);
		ctpProfessores.add(lblNewLabel_6);
		
		JFormattedTextField ftxtNascimento = new JFormattedTextField();
		ftxtNascimento.setBounds(135, 128, 123, 20);
		ctpProfessores.add(ftxtNascimento);
		
		JFormattedTextField ftxtCep = new JFormattedTextField();
		ftxtCep.setBounds(316, 128, 137, 20);
		ctpProfessores.add(ftxtCep);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setBounds(76, 183, 499, 49);
		ctpProfessores.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.setBounds(55, 11, 89, 23);
		panel.add(btnNewButton);
	    
		
		JButton btnNewButton_1 = new JButton("CADASTRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				

				new Professor("Renata", "10747513619","fem", "renata@renata.com.br", "995212116", "31030490", "A");
		        
		        
		        if(prof.profCadastrar()) {
		        	JOptionPane.showMessageDialog(null,"Cadastro bem-sucedido!");
		        }else {
		        	JOptionPane.showMessageDialog(null, "Falha no cadastro.");
		        }
		        
			}
		});
		
		btnNewButton_1.setBounds(199, 11, 101, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ALTERAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(355, 11, 89, 23);
		panel.add(btnNewButton_2);
	}
}
