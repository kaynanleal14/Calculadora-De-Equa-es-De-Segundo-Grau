import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaGrafica extends JFrame
{
    JLabel textoAx, textoBx, textoCx, textoResultado;
    JTextField Ax, Bx, Cx, Resultado;
    JButton botaoCalcular;
   
    JanelaGrafica(String titulo)
    {
        this.setSize(800, 600);
        this.setTitle("Calculadora de Equação de 2º Grau");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        this.getContentPane().setLayout(null);
       
        botaoCalcular = new JButton("Calcular ");
        botaoCalcular.setSize(100,40);
        botaoCalcular.setLocation(600, 300);
        this.add(botaoCalcular);
       
        Ax = new JTextField();
        Ax.setSize(100,40);
        Ax.setLocation(150,100);
        Ax.setEditable(false);
        this.add(Ax);
       
        textoAx = new JLabel("Valor de A");
        textoAx.setSize(100,40);
        textoAx.setLocation(50,100);
        this.add(textoAx);

        Bx = new JTextField();
        Bx.setSize(100,40);
        Bx.setLocation(150,150);
        Bx.setEditable(false);
        this.add(Bx);

        textoBx = new JLabel("Valor de B");
        textoBx.setSize(100,40);
        textoBx.setLocation(50,150);
        this.add(textoBx);

        Cx = new JTextField();
        Cx.setSize(100,40);
        Cx.setLocation(150,200);
        Cx.setEditable(false);
        this.add(Cx);

        textoCx = new JLabel("Valor de C");
        textoCx.setSize(100,40);    
        textoCx.setLocation(50,200);
        this.add(textoCx);

        Resultado = new JTextField();
        Resultado.setSize(100,40);
        Resultado.setLocation(150,250);
        Resultado.setEditable(false);
        this.add(Resultado);


        textoResultado = new JLabel("Resultado");
        textoResultado.setSize(100,40);
        textoResultado.setLocation(50,250);
        this.add(textoResultado);

       
       
       
        this.setVisible(true);
    }
}