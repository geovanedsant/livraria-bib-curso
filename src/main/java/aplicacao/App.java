/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

//import modelo.Livro;
import controle.ControlePessoa;
import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author gdsant
 */
public class App {

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Modulo Pessoa"
                    + "\n2 - Modulo Livro"
                    + "\n0 - Sair"
            ));

            if (opcao == 1) {
                moduloPessoa();
            } else {
                moduloLivro();
            }

        } while (opcao != 0); // enquanto o usuário não 'sair'

        JOptionPane.showMessageDialog(null, "Programa encerrado.");

    }

    public static void moduloPessoa() {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastrar Pessoa"
                    + "\n2 - Buscar Pessoa"
                    + "\n3 - Alterar Pessoa"
                    + "\n4 - Excluir Registro de Pessoa"
                    + "\n0 - Voltar"
            ));

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog(
                            "Informe o nome da pessoa"
                            + " a ser cadastrada:"
                    );
                    
                    Pessoa p = new Pessoa(nome);
                    
                    boolean cadastrou = 
                            ControlePessoa.cadastrarPessoa(p);
                    
                    if(cadastrou){
                        JOptionPane.showMessageDialog(null, 
                                "Cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Não foi possível cadastrar.");
                    }
                    
                    break;
                case 2:
                    // buscar Pessoa 
                    break;
                case 3:
                    // alterar Pessoa
                    break;
                case 4:
                    // Excluir Reg. de Pessoa
                    break;
                case 0:
                    break;
                default:
                // Digite número válido
            }
        } while (opcao != 0);
    }

    public static void moduloLivro() {

    }

}
