import dao.LoginDAO;
import model.Login;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*FormCadastroLogin formCadastroLogin = new FormCadastroLogin();
        formCadastroLogin.setVisible(true);*/

        FormAutenticacao formAutenticacao = new FormAutenticacao();
        formAutenticacao.setVisible(true);

        /*LoginDAO loginDAO = new LoginDAO();

        // Criando alguns objetos de Login
        Login usuario1 = new Login("teste@email.com", "senha123");
        Login usuario2 = new Login("admin@email.com", "admin123");

        // Adicionando os usuários ao nosso "banco de dados" simulado
        loginDAO.adicionarUsuario(usuario1);
        loginDAO.adicionarUsuario(usuario2);

        System.out.println("Usuários cadastrados:");
        for (Login usuario : loginDAO.listarUsuarios()) {
            System.out.println(usuario);
        }
*/
    }
}