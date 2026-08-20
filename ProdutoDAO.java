

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {

    public void cadastrar(Produto produto) {

        String sql = """
                INSERT INTO produtos
                (nome, categoria, preco, estoque)
                VALUES (?, ?, ?, ?)
                """;

        try {

            Connection conexao = conexao.conectar();

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getCategoria());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getEstoque());

            stmt.executeUpdate();

            System.out.println("Produto cadastrado!");

        } catch (Exception e) {

            System.out.println("Erro:");
            System.out.println(e.getMessage());
        }
    }
}