import javax.swing.*;

public class CadastroProduto {

    public static void main(String[] args) {

        //Configurações da Janela
        JFrame janela = new JFrame("Cadastro de Produto");
        janela.setSize(800, 600);
        janela.setLayout(null);

        //Nome
        JLabel labelNome = new JLabel("Nome do Produto");
        labelNome.setBounds(200, 50, 200, 40);
        JTextField inputNome = new JTextField();
        inputNome.setBounds(200, 90, 400, 40);

        //Preço
        JLabel labelPreco = new JLabel("Preço");
        labelPreco.setBounds(200, 140, 200, 40);
        JTextField inputPreco = new JTextField();
        inputPreco.setBounds(200, 180, 400, 40);

        //Quantidade
        JLabel labelQuantidade = new JLabel("Quantidade");
        labelQuantidade.setBounds(200, 230, 200, 40);
        JTextField inputQuantidade = new JTextField();
        inputQuantidade.setBounds(200, 270, 400, 40);

        //Botão Cadastrar
        JButton buttonCadastrar = new JButton("Cadastrar");
        buttonCadastrar.setBounds(200, 340, 150, 40);
        JButton buttonLimpar = new JButton("Limpar");
        buttonLimpar.setBounds(450, 340, 150, 40);


        JTextArea areaResultado = new JTextArea();
        areaResultado.setBounds(200, 410, 400, 100);

        areaResultado.setEditable(false);

        buttonCadastrar.addActionListener(e -> {

            String nome = inputNome.getText();

            double preco = Double.valueOf(inputPreco.getText());

            int quantidade = Integer.valueOf(inputQuantidade.getText());
            double total = preco * quantidade;

            if (nome.equals(inputNome.getText()) && preco <= 0 && quantidade <= 0) {

                areaResultado.setText(
                        "Preencha todos os campos corretamente."
                );

            } else {

                //Mostrar o Resultado
                areaResultado.setText(
                        "Produto cadastrado com sucesso!\n\n" +
                                "Nome: " + nome + "\n" +
                                "Preço: R$ " + preco + "\n" +
                                "Quantidade: " + quantidade + "\n" +
                                "Valor total em estoque: R$ " + total
                );
            }
        });

        //Limpando os Campos
        buttonLimpar.addActionListener(e -> {

            inputNome.setText("");
            inputPreco.setText("");
            inputQuantidade.setText("");
            areaResultado.setText("");

        });


        janela.add(labelNome);
        janela.add(inputNome);

        janela.add(labelPreco);
        janela.add(inputPreco);

        janela.add(labelQuantidade);
        janela.add(inputQuantidade);

        janela.add(buttonCadastrar);
        janela.add(buttonLimpar);

        janela.add(areaResultado);

        janela.setVisible(true);
    }
}