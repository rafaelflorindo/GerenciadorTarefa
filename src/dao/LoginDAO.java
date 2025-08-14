package dao;

import model.Login;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    private List<Login> usuarios;

    public LoginDAO() {
        this.usuarios = new ArrayList<>();
        //carga de dados no sistema
        usuarios.add(new Login("teste@teste.com","123"));
        usuarios.add(new Login("teste1@teste.com","123"));
        usuarios.add(new Login("teste2@teste.com","123"));
    }

    public void adicionarUsuario(Login login){
        usuarios.add(login);
    }

    public List<Login> listarUsuarios() {
        return usuarios;
    }

    public void buscarPorId(int id){

    }

    public void atualizar(Login login){

    }

    public void atualizarStatus(Login login, Boolean ativo){

    }
    public boolean verificarLogin(String email, String senha) {
        for (Login login : usuarios) {
            if (login.getEmail().equals(email) && login.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
