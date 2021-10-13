/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author gdsant
 */
public class TesteBanco {

    public static void main(String[] args) {
        // Criar uma conexão
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/pessoasXLivros",
                    "root",
                    "1234");

            String codigo = "INSERT INTO livro "
                    + "(titulo_livro, cod_pessoa) VALUES "
                    + "('O Senhor dos Anéis', 2)";

            conexao.prepareStatement(codigo);

            PreparedStatement codigoPreparado
                    = conexao.prepareStatement(codigo);

            codigoPreparado.execute();

            codigoPreparado.close();
            conexao.close();

            // CASO 2: EXCLUIR LIVRO
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
