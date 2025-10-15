/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco_dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Aluno
 */
public class Banco_dados {
        public static void main(String[] args) {
   String url = "bancodedados:mysql//localhost:3306/exemplo";
            String usuario = "root";
            String senha = "root";
            Connection conexao = null;
            try {
                conexao = DriverManager.getConnection(url,usuario,senha);
                System.out.print("Conexão com banco de dados estabelecida com sucesso!");
                Statement stmt = conexao.createStatement();
                stmt.execute("Create data base if not exists alunos (id INT");
                System.out.println("Tabela 'alunos' criada ou já existe!");
            }
            catch (SQLException e){
                System.out.println("Erro ao conectar ao banco de dados!"+ e);
            }
            finally{
            try{
            }
            }
    }
    
}
