import view.VistaRequerimientosReto4;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton boton, boton1,boton2,boton3;
    private JLabel label1, label2, label3;
    private JTextArea texto1, texto2, texto3;
    private JLabel datosp, vinculo;

    public App() {
        
        this.setTitle("Reto 5 basado en Reto 4 y Consultas - Reto 3");
        this.setBounds(0, 0, 720, 630);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        boton = new JButton();
        boton.setText("Resultado Proyecto ciudad");
        boton.setBounds(10, 10, 250, 30);
        boton.setBackground(Color.CYAN);
        this.add(boton);
        
        label1 = new JLabel();
        label1.setText("Consulta N.1 Proyecto Ciudad");
        label1.setForeground(Color.red);
        label1.setBounds(10, 40, 250, 30);
        this.add(label1);
        
        texto1 = new JTextArea();
        texto1.setBounds(10, 70, 250, 460);
        texto1.setFont(texto1.getFont().deriveFont(10f));
        texto1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.add(texto1);
        
        boton1 = new JButton();
        boton1.setText("Resultado Suma Cantidades");
        boton1.setBounds(270, 10, 200, 30);
        boton1.setBackground(Color.CYAN);
        this.add(boton1);

        label2 = new JLabel();
        label2.setText("Consulta N.2 - Suma Cantidades");
        label2.setBounds(270, 40, 200, 30);
        label2.setForeground(Color.red);
        this.add(label2);
        
        texto2 = new JTextArea();
        texto2.setBounds(270, 70, 200, 50);
        texto2.setFont(texto2.getFont().deriveFont(10f));
        texto2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.add(texto2);
        
        boton2 = new JButton();
        boton2.setText("Resultado Líder Ciudad");
        boton2.setBounds(480, 10, 200, 30);
        boton2.setBackground(Color.CYAN);
        this.add(boton2);
        
        label3 = new JLabel();
        label3.setText("Consulta N.3 - Líder Ciudad");
        label3.setBounds(480, 40, 200, 30);
        label3.setForeground(Color.red);
        this.add(label3);
        
        texto3 = new JTextArea();
        texto3.setBounds(480, 70, 200, 70);
        texto3.setFont(texto3.getFont().deriveFont(10f));
        texto3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.add(texto3);

        boton3 = new JButton();
        boton3.setText("Limpiar Pantalla");
        boton3.setBounds(10, 540, 250, 30);
        boton3.setBackground(Color.CYAN);
        this.add(boton3);
        
        datosp = new JLabel();
        datosp.setText("");
        datosp.setBounds(400, 500, 280, 30);
        datosp.setForeground(Color.blue);
        this.add(datosp);
        
        vinculo = new JLabel();
        vinculo.setText("");
        vinculo.setBounds(400, 520, 280, 30);
        vinculo.setForeground(Color.blue);
        this.add(vinculo);
        
        datosp.setText("Realizado por: Alexander Latorre Grupo: 62"); 
        vinculo.setText("Enlace: https://github.com/ALITOS2021/DS_JAVA/tree/main/RETO5/Reto4_P62");        
       
        boton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                texto1.setText("" + VistaRequerimientosReto4.requerimiento1());
            }
        });
        
        boton1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                texto2.setText("" + VistaRequerimientosReto4.requerimiento3());
            }
        });

        boton2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                texto3.setText("" + VistaRequerimientosReto4.requerimiento4());
            }
        });     

        boton3.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                texto1.setText("");
                texto2.setText("");
                texto3.setText("");
            }
        });   
        

    }
    
    public static void main(String[] args) {
    	App ejemplo = new App();
        ejemplo.setVisible(true);       
    }
}


