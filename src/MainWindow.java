import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class MainWindow {

        public static void main(String[] args) {

            // Гарантирует корректную работу GUI
            SwingUtilities.invokeLater(() -> {

                // === ОКНО ===
                JFrame frame = new JFrame("Главное окно");
                frame.setSize(400, 300);                  // размер окна
                frame.setLocationRelativeTo(null);        // по центру экрана
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);                // запрет изменения размера

                // === КОНТЕЙНЕР ===
                JPanel panel = new JPanel();
                panel.setLayout(null); // ручное позиционирование (контроль > автоматика)

                // === КНОПКА 1 ===
                JButton buttonStart = new JButton("Запуск");
                buttonStart.setBounds(120, 50, 160, 40);  // x, y, width, height
                buttonStart.setEnabled(true);             // активна
                buttonStart.setFocusPainted(false);       // убирает рамку фокуса
                buttonStart.setToolTipText("Начать выполнение");

                buttonStart.addActionListener(e ->
                        JOptionPane.showMessageDialog(frame, "Запуск выполнен")
                );

                // === КНОПКА 2 ===
                JButton buttonSettings = new JButton("Настройки");
                buttonSettings.setBounds(120, 110, 160, 40);

                buttonSettings.addActionListener(e ->
                        JOptionPane.showMessageDialog(frame, "Окно настроек")
                );

                // === КНОПКА 3 (выход) ===
                JButton buttonExit = new JButton("Выход");
                buttonExit.setBounds(120, 170, 160, 40);

                buttonExit.addActionListener(e -> System.exit(0));

                // === ДОБАВЛЕНИЕ ===
                panel.add(buttonStart);
                panel.add(buttonSettings);
                panel.add(buttonExit);

                frame.add(panel);
                frame.setVisible(true); // ПОКАЗ ОКНА
            });
        }
    }

