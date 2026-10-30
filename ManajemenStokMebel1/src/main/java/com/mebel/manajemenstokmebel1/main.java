package manajemenstokmebel.main;

import com.mebel.manajemenstokmebel1.Login;
import javax.swing.SwingUtilities;

public class  main{

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Login login = new Login();

            login.setTitle("OrderFlowAPP - Login");
            login.setLocationRelativeTo(null);
            login.setVisible(true);

        });

    }
}