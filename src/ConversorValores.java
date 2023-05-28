import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorValores extends JFrame{

    private static final Double DOLAR = 5.04;
    private static final Double EURO = 5.40;
    private static final Double LIBRA = 5.20;

    public JPanel panelMain;
    private JTextField textValor;
    private JComboBox comboBox1;
    private JTextField textResultado;
    private JButton limparButton;
    private JButton respostaButton;

    public ConversorValores() {
        respostaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedIndex() == 0){
                    Double valor = Double.valueOf(textValor.getText()) * DOLAR;
                    textResultado.setText(valor.toString());

                } else if (comboBox1.getSelectedIndex() == 1) {
                    Double valor = Double.valueOf(textValor.getText()) * EURO;
                    textResultado.setText(valor.toString());

                }else if (comboBox1.getSelectedIndex() == 2){
                    Double valor = Double.valueOf(textValor.getText()) * LIBRA;
                    textResultado.setText(valor.toString());
                }


            }
        });
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textValor.setText("");
                textResultado.setText("");
            }
        });
    }



}
