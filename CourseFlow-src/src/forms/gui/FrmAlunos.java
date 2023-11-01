package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Label;
//import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FrmAlunos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpAlunos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAlunos frame = new FrmAlunos();
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
	public FrmAlunos() {
		setTitle("Alunos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 388);
		ctpAlunos = new JPanel();
		ctpAlunos.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpAlunos);
		ctpAlunos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE ALUNOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(214, 11, 160, 16);
		ctpAlunos.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(69, 64, 137, 20);
		ctpAlunos.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CÓDIGO:");
		lblNewLabel_1.setBounds(10, 67, 59, 14);
		ctpAlunos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setBounds(235, 67, 46, 14);
		ctpAlunos.add(lblNewLabel_2);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("000.000.000-00");
		formattedTextField.setBounds(266, 64, 160, 20);
		ctpAlunos.add(formattedTextField);
		
		JLabel lblNewLabel_3 = new JLabel("NOME:");
		lblNewLabel_3.setBounds(10, 121, 46, 14);
		ctpAlunos.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(69, 118, 357, 20);
		ctpAlunos.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ALUNO INATIVO");
		chckbxNewCheckBox.setForeground(Color.RED);
		chckbxNewCheckBox.setBounds(455, 63, 117, 23);
		ctpAlunos.add(chckbxNewCheckBox);
		
		Button button = new Button("IMAGEM");
		button.setFont(null);
		button.setBackground(SystemColor.activeCaptionBorder);
		button.setForeground(SystemColor.infoText);
		button.setBounds(455, 113, 105, 22);
		ctpAlunos.add(button);
		
		Label label = new Label("DATA DE NASCIMENTO:");
		label.setBounds(10, 158, 128, 22);
		ctpAlunos.add(label);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(417, 158, 143, 20);
		ctpAlunos.add(formattedTextField_1);
		
		Label label_1 = new Label("TELEFONE:");
		label_1.setBounds(337, 158, 74, 22);
		ctpAlunos.add(label_1);
		
		JFormattedTextField formattedTextField_1_1 = new JFormattedTextField();
		formattedTextField_1_1.setBounds(144, 160, 160, 20);
		ctpAlunos.add(formattedTextField_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("E-MAIL:");
		lblNewLabel_3_1.setBounds(10, 208, 46, 14);
		ctpAlunos.add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 205, 357, 20);
		ctpAlunos.add(textField_2);
		
		Label label_2 = new Label("CEP:");
		label_2.setBounds(10, 249, 36, 22);
		ctpAlunos.add(label_2);
		
		JFormattedTextField formattedTextField_1_1_1 = new JFormattedTextField();
		formattedTextField_1_1_1.setBounds(69, 251, 160, 20);
		ctpAlunos.add(formattedTextField_1_1_1);
		
		Label label_2_1 = new Label("TURMA:");
		label_2_1.setBounds(266, 249, 53, 22);
		ctpAlunos.add(label_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(337, 249, 223, 22);
		ctpAlunos.add(comboBox);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.setBounds(69, 296, 89, 23);
		ctpAlunos.add(btnNewButton);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBounds(227, 296, 105, 23);
		ctpAlunos.add(btnCadastrar);
		
		JButton btnNewButton_1_1 = new JButton("ALTERAR");
		btnNewButton_1_1.setBounds(389, 296, 89, 23);
		ctpAlunos.add(btnNewButton_1_1);
	}
}
