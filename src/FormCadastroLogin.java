import dao.LoginDAO;
import model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCadastroLogin extends JFrame {
    private JTextField TXTEmail;
    private JPasswordField TXTSenha;
    private JButton btnGravar;
    private JButton LISTARButton;
    private JPanel Principal;
    private JTextArea TXT_login;

    private LoginDAO loginDAO;

    public FormCadastroLogin() {
        setContentPane(Principal);
        setSize(800, 300);
        setLocationRelativeTo(this);
        setVisible(true);
        setResizable(false);
        setTitle("Gerenciador de Login");

        loginDAO = new LoginDAO();

        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = TXTEmail.getText();
                String senha = new String(TXTSenha.getPassword());

                loginDAO.adicionarUsuario(new Login(email, senha));
            }
        });
        LISTARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TXT_login.setText(loginDAO.listarUsuarios().toString());
            }
        });
    }
}
