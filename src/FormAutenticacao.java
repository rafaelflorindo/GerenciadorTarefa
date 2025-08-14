import dao.LoginDAO;
import model.Login;

import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormAutenticacao extends JFrame {
    private JPanel Principal;
    private JTextField TF_email;
    private JPasswordField TF_senha;
    private JButton logarButton;
    private LoginDAO loginDAO;

    public FormAutenticacao() {
        setContentPane(Principal);
        setSize(800, 300);
        setLocationRelativeTo(this);
        setVisible(true);
        setResizable(false);
        setTitle("Autenticação");

        loginDAO = new LoginDAO();

        logarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = TF_email.getText();
                String senha = new String(TF_senha.getPassword());

                boolean login = loginDAO.verificarLogin(email, senha);
                if (login) {
                    JOptionPane.showMessageDialog(
                            FormAutenticacao.this, // "this" se refere à instância da classe FormCadastroLogin
                            "Usuário Autenticado com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    FormCadastroLogin formCadastroLogin = new FormCadastroLogin();
                    formCadastroLogin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(
                            FormAutenticacao.this, // "this" se refere à instância da classe FormCadastroLogin
                            "Falha no login para 'teste@email.com",
                            "Erro",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }
}
