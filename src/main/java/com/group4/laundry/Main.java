package com.group4.laundry;

import com.group4.laundry.ui.MainDashboard;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public final class Main {
    private Main() { }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
                // Swing's default look and feel is also supported.
            }
            new MainDashboard().setVisible(true);
        });
    }
}
