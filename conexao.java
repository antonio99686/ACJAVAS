

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

    private static final String URL =
            "jdbc:mysql://localhost:/minimercado";

    private static final String USUARIO = "root";

    private static final String SENHA = "";

    public static Connection conectar() {

        try {

            Connection conexao = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    SENHA
            );

            System.out.println("Banco conectado!");

            return conexao;

        } catch (Exception e) {

            System.out.println("Erro ao conectar:");
            System.out.println(e.getMessage());

            return null;
        }
    }
}