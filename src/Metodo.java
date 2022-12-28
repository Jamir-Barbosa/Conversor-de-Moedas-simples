import javax.swing.JOptionPane;

public class Metodo {

    double input;
    protected double conta;
    double realDolar = 5.24, realEuro = 5.64, realLibra = 6.56, realPesoArg = 0.031, realPesoChi = 0.0062;

    String dolar = "US$ ", reais = "R$ ", pesoArg = "AR$ ", pesoChi = "CLP$ ", euro = "€ ", libra = "£ ";

    String texto;

    public static double conversorReal(double input, double conversor) {
        return input * conversor;
    }

    public static double conversorEstr(double input, double conversor) {
        return input / conversor;
    }

    protected double valor() {

        while (true)
            try {
                String captura = JOptionPane.showInputDialog(null, "Qual o valor a ser convertido ?");
                input = Double.parseDouble(captura);

                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Utilize numeros validos");
            }
        return input;
    }

    protected double perguntas(double input) {
        String[] opcoes = { "Converter de Reais a Dólar", "Converter de Reais a Euro",
                "Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso Argentino",
                "Converter de Reais a Peso Chileno", "Converter de Dólar a Reais", "Converter de Euro a Reais",
                "Converter de Libras Esterlinas a Reais", "Converter de Peso Argentino a Reais",
                "Converter de Peso Chileno a Reais" };
        String resposta = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de converção", "Selecione",
                JOptionPane.PLAIN_MESSAGE, null, opcoes, "");

        if (resposta.equals("Converter de Reais a Dólar")) {
            conta = conversorEstr(input, realDolar);
            texto = dolar;
            return conta;
        }
        if (resposta.equals("Converter de Reais a Euro")) {
            conta = conversorEstr(input, realEuro);
            texto = euro;
            return conta;
        }
        if (resposta.equals("Converter de Reais a Libra Esterlinas")) {
            conta = conversorEstr(input, realLibra);
            texto = libra;
            return conta;
        }
        if (resposta.equals("Converter de Reais a Peso Argentino")) {
            conta = conversorEstr(input, realPesoArg);
            texto = pesoArg;
            return conta;
        }
        if (resposta.equals("Converter de Reais a Peso Chileno")) {
            conta = conversorEstr(input, realPesoChi);
            texto = pesoChi;
            return conta;
        }
        if (resposta.equals("Converter de Dólar a Reais")) {
            conta = conversorReal(input, realDolar);
            texto = reais;
            return conta;
        }
        if (resposta.equals("Converter de Euro a Reais")) {
            conta = conversorReal(input, realEuro);
            texto = reais;
            return conta;
        }
        if (resposta.equals("Converter de Libras Esterlinas a Reais")) {
            conta = conversorReal(input, realLibra);
            texto = reais;
            return conta;
        }
        if (resposta.equals("Converter de Peso Argentino a Reais")) {
            conta = conversorReal(input, realPesoArg);
            texto = reais;
            return conta;
        }
        if (resposta.equals("Converter de Peso Chileno a Reais")) {
            conta = conversorReal(input, realPesoChi);
            texto = reais;
            return conta;
        } else
            return 0;

    }

}
