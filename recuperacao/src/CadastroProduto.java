import javax.swing.*;

public class CadastroProduto {

    public static void main(String[] args) {

        // Bloco de Criação da Janela
        JFrame janela = new JFrame("Cadastro de Produto");
        janela.setSize(800, 600);
        janela.setLayout(null);

        //Componentes Nome do Produto
        JLabel labelNome = new JLabel("Nome do Produto");
        labelNome.setBounds(200, 50, 200, 40);
        JTextField inputNome = new JTextField();
        inputNome.setBounds(200, 90, 400, 40);

        //Componentes Preço
        JLabel labelPreco = new JLabel("Preço");
        labelPreco.setBounds(200, 140, 200, 40);
        JTextField inputPreco = new JTextField();
        inputPreco.setBounds(200, 180, 400, 40);

        //Componentes Quantidade
        JLabel labelQuantidade = new JLabel("Quantidade");
        labelQuantidade.setBounds(200, 230, 200, 40);
        JTextField inputQuantidade = new JTextField();
        inputQuantidade.setBounds(200, 270, 400, 40);

        //Botão Cadastrar
        JButton buttonCadastrar = new JButton("Cadastrar");
        buttonCadastrar.setBounds(200, 340, 150, 40);

        //Botão Limpar
        JButton buttonLimpar = new JButton("Limpar");
        buttonLimpar.setBounds(450, 340, 150, 40);

        // Bloco da Área de Resultado
        JTextArea areaResultado = new JTextArea();
        areaResultado.setBounds(200, 410, 400, 100);

        areaResultado.setEditable(false);

        // Bloco de Ação do Botão Cadastrar
        buttonCadastrar.addActionListener(e -> {

            // Captura dos Dados
            String nome = inputNome.getText();

            String preco = inputPreco.getText();

            String quantidade = inputQuantidade.getText();

            // Verificação dos campos vazios
            if (nome.equals("") && preco.equals("") && quantidade.equals("")) {

            // Bloco da Mensagem de Erro
                areaResultado.setText(
                        "Preencha todos os campos."
                );

            } else {

            // Bloco do Cálculo
                int total = 100;

                // Mostrando o Resultado
                areaResultado.setText(
                        "Produto cadastrado com sucesso!\n\n" +
                                "Nome: " + nome + "\n" +
                                "Preço: R$ " + preco + "\n" +
                                "Quantidade: " + quantidade + "\n" +
                                "Valor total em estoque: R$ " + total + ",00"
                );
            }
        });


        // Bloco de Ação do Botão Limpar
        buttonLimpar.addActionListener(e -> {

            // Bloco de Limpeza dos Campos
            inputNome.setText("");
            inputPreco.setText("");
            inputQuantidade.setText("");
            areaResultado.setText("");

        });

        // Bloco de Adição dos Itens na Janela
        janela.add(labelNome);
        janela.add(inputNome);
        janela.add(labelPreco);
        janela.add(inputPreco);
        janela.add(labelQuantidade);
        janela.add(inputQuantidade);
        janela.add(buttonCadastrar);
        janela.add(buttonLimpar);
        janela.add(areaResultado);

        // Bloco de Exibição da Janela
        janela.setVisible(true);
    }
}