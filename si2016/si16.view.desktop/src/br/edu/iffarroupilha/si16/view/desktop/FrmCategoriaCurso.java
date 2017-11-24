package br.edu.iffarroupilha.si16.view.desktop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.iffarroupilha.dao.relacional.FabricaHibernateDAO;
import br.edu.iffarroupilha.si16.controle.CategoriaCursoLogic;
import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;
import br.edu.iffarroupilha.si16.modelo.IEntidade;
import br.edu.iffarroupilha.si16.modelo.dao.FabricaDAO;
import br.edu.iffarroupilha.si16.modelo.dao.IDAO;
import br.edu.iffarroupilha.si16.modelo.dao.IFabricaDAO;

/**
 * <p>
 * Interface para cadastro de categoria de curso
 * </p>
 * 
 * @author Gabriel Hahn
 * @since 18 de out de 2017 22:06:16
 */
public class FrmCategoriaCurso extends JFrame {

	public FrmCategoriaCurso() {
		setTitle("Cadastro de categoria");
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		JLabel jlDescricao = new JLabel("Descrição: ");
		JTextField jtfDescricao = new JTextField(10);
		JButton btnGravar = new JButton("Gravar");

		setLayout(new FlowLayout());

		// associar um evento ao botão
		btnGravar.addActionListener(evento -> {

			CategoriaCursoLogic logica = new CategoriaCursoLogic();
			CategoriaCurso cc = new CategoriaCurso();
			cc.setDescricao(jtfDescricao.getText());
			logica.gravar(cc);
			JOptionPane.showMessageDialog(null, "Gravado!");

		});

		add(jlDescricao);
		add(jtfDescricao);
		add(btnGravar);

	}

	public static void main(String[] args) {
		FabricaDAO.defineFabrica(new FabricaHibernateDAO());
		
		new FrmCategoriaCurso();
	}

}
