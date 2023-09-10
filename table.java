import javax.swing.JOptionPane;

public class table{
    public static void main(String[] args) {
        Float valor, cod;
        double valor_final;
        valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto: "));
        cod = Float.parseFloat(JOptionPane.showInputDialog("Insira um código de aumento: 1 / 3 / 4 / 8 "));
        
        if(cod == 1){

            valor_final=valor+(valor*0.15);

            JOptionPane.showMessageDialog(null, "Acréscimo de 15%. Valor final: R$ " +valor_final);
        }
        else if(cod == 3){

            valor_final=valor+(valor*0.20);

            JOptionPane.showMessageDialog(null, "Acréscimo de 20%. Valor final: R$ " +valor_final);
        }
        else if(cod == 4){

            valor_final=valor+(valor*0.35);

            JOptionPane.showMessageDialog(null, "Acréscimo de 35%. Valor final: R$ " +valor_final);
        }
        else if(cod == 8){

            valor_final=valor+(valor*0.40);

            JOptionPane.showMessageDialog(null, "Acréscimo de 40%. Valor final: R$ " +valor_final);
        }
    }
}