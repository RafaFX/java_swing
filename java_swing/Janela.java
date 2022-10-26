import javax.swing.*;
import java.awt.*;


public class Janela extends JFrame {

    private JTextField campoTextField;
    private JTextField resultadoTextField;
    private JComboBox<String> opcoesComboBox;
    private String[] opcoes = {"Alta","Média","Baixa"};

    public Janela(){
        setTitle("Cadastro de Tarefas");
        setSize(800,550);
        setVisible(true);
        configurarJanela();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void configurarJanela() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        

        JLabel label = new JLabel("Tarefa");
        label.setBounds(50,10,100,60);
        label.setOpaque(true);

        JLabel label2 = new JLabel("Prioridade");
        label2.setBounds(50,200,100,60);
        label2.setOpaque(true);

        opcoesComboBox = new JComboBox<>(opcoes);
        opcoesComboBox.setBounds(50,260,700,30);

        JButton salvarBotao = new JButton("Salvar");
        salvarBotao.setBounds(650, 380, 100, 25);

        JButton cancelarBotao = new JButton("Cancelar");
        cancelarBotao.setBounds(530, 380, 100, 25);

        panel.add(label);
        panel.add(label2);
        panel.add(salvarBotao);
        panel.add(cancelarBotao);
        panel.add(opcoesComboBox);
        
        add(panel);
    }

}

