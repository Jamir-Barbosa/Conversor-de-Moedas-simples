import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Object[] repeat = { "Sim", "Não" };
        int retry = 0;
        while (retry == 0) {
            Metodo metodo = new Metodo();
            double valor = metodo.valor();

            while (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Utilize numeros maiores que 0");
                valor = metodo.valor();
            }

            metodo.perguntas(valor);

            DecimalFormat df = new DecimalFormat("0.00");

            JOptionPane.showMessageDialog(null,
                    "O valor da conversão é de " + metodo.texto + df.format(metodo.conta) + ".");

            retry = JOptionPane.showOptionDialog(null, "Deseja tentar novamente ?", null, JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, repeat, repeat[0]);

        }
        if (retry == 1)
            System.exit(0);

    }
}
