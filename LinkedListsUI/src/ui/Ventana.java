package ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import exceptions.ListaVaciaException;
import models.ListaLigada;

public class Ventana extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nombreTextField;
	private JLabel nombreLabel,listLabel,errorLabel;
	private JPanel formPanel,listPanel,actionsPanel,errorPanel;
	private JButton addFirst,addLast,removeFirst,removeLast;
	private ListaLigada<String> list;
	
	
	public Ventana(){
		setTitle("Linked List");
		setLayout(new GridLayout(2,2));
		setSize(400,400);
		initComponents();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void initComponents(){
		formPanel= new JPanel();
		formPanel.setLayout(new FlowLayout());
		nombreLabel= new JLabel("Nombre:");
		formPanel.add(nombreLabel);
		nombreTextField= new JTextField();
		nombreTextField.setPreferredSize( new Dimension( 100, 24 ) );
		formPanel.add(nombreTextField);
		listPanel= new JPanel();
		listLabel=new JLabel();
		listPanel.add(listLabel);
		actionsPanel= new JPanel();
		actionsPanel.setLayout(new GridLayout(4, 1));
		addFirst= new JButton("Agregar al inico");
		addLast= new JButton("Agregar al final");
		removeFirst= new JButton("Borrar al inico");
		removeFirst.addActionListener(new RemoveFirstActionListener());
		removeLast= new JButton("Borrar al final");
		removeLast.addActionListener(new RemoveLastActionListener());
		addFirst.addActionListener(new AddFirstListener());
		addLast.addActionListener(new AddLastListener());
		actionsPanel.add(addFirst);
		actionsPanel.add(addLast);
		actionsPanel.add(removeFirst);
		actionsPanel.add(removeLast);
		errorPanel= new JPanel();
		errorLabel= new JLabel();
		errorPanel.add(errorLabel);
		formPanel.setBorder(BorderFactory.createTitledBorder("Agrega un nombre"));
		listPanel.setBorder(BorderFactory.createTitledBorder("Lista resultado"));
		actionsPanel.setBorder(BorderFactory.createTitledBorder("Acciones"));
		errorPanel.setBorder(BorderFactory.createTitledBorder("Errores"));
		add(formPanel);
		add(listPanel);
		add(actionsPanel);
		add(errorPanel);
		list= new ListaLigada<>();
		
	}
	
	private class AddFirstListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			list.agregarAlInicio(nombreTextField.getText());
			nombreTextField.setText("");
			imprimeLista();
			errorLabel.setText("");
		}
		
	}
	private class AddLastListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			list.agregarAlFinal(nombreTextField.getText());
			nombreTextField.setText("");
			imprimeLista();
			errorLabel.setText("");
		}
		
	}	
	private class RemoveFirstActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			try {
				list.eliminarAlInicio();
			} catch (ListaVaciaException e1) {
				// TODO Auto-generated catch block
				errorLabel.setText(e1.getMessage());
			}
			nombreTextField.setText("");
			imprimeLista();
		}
		
	}	
	private class RemoveLastActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			try {
				list.eliminarAlFinal();
			} catch (ListaVaciaException e1) {
				// TODO Auto-generated catch block
				errorLabel.setText(e1.getMessage());
			}
			nombreTextField.setText("");
			imprimeLista();
		}
		
	}		
	private void imprimeLista(){
		listLabel.setText(list.imprimeLista());
	}

}
