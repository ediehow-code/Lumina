package core;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Bắt lỗi toàn cục ngăn game crash ngầm không rõ lý do
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            throwable.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                "Lỗi nghiêm trọng: " + throwable.getMessage(), 
                "Lumina Crash", 
                JOptionPane.ERROR_MESSAGE);
        });

        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Lumina");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setResizable(false);

            // Thêm icon cho cửa sổ game (đặt file icon.png trong thư mục res)
            // window.setIconImage(new ImageIcon(Main.class.getResource("/res/general/icon.png")).getImage());

            GamePanel gamePanel = new GamePanel();
            window.add(gamePanel);
            window.pack();

            window.setLocationRelativeTo(null);
            window.setVisible(true);

            gamePanel.startGameThread();
        });
    }
}