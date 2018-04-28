package com.voidswrath.modinstaller;

import com.voidswrath.util.OSInfo;
import com.voidswrath.util.Utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JOptionPane;

public class InstallerListener implements ActionListener, WindowListener, KeyListener {
   public void actionPerformed(ActionEvent e) {
      Main installer = Main.instance;
      if (installer != null) {
         if (e.getSource() == installer.btnInstall) {
            Installer.install(new File(installer.txtInstanceDir.getText()));
         } else if (e.getSource() == installer.comboBox) {
            installer.txtInstanceDir.setText(Utilities.getLocationForProfile(installer.comboBox.getSelectedItem().toString()));
         } else if (e.getSource() == installer.rdbtnChooseLocation) {
            installer.comboBox.setEnabled(true);
            if (installer.comboBox.getItemCount() == 0) {
               JOptionPane.showMessageDialog(Main.instance, "You must start minecraft with the vanilla launcher atleast once to install to a profile.");
               installer.rdbtnChooseLocation.setEnabled(false);
               installer.rdbtnDefLocation.setSelected(true);
            } else {
               installer.txtInstanceDir.setText(Utilities.getLocationForProfile(installer.comboBox.getSelectedItem().toString()));
            }
         } else if (e.getSource() == installer.rdbtnDefLocation) {
            installer.comboBox.setEnabled(false);
            installer.txtInstanceDir.setText(OSInfo.getWorkingDirectory("minecraft").getAbsolutePath());
         }
      }

   }

   public void windowOpened(WindowEvent e) {
   }

   public void windowClosing(WindowEvent e) {
      System.exit(0);
   }

   public void windowClosed(WindowEvent e) {
   }

   public void windowIconified(WindowEvent e) {
   }

   public void windowDeiconified(WindowEvent e) {
   }

   public void windowActivated(WindowEvent e) {
   }

   public void windowDeactivated(WindowEvent e) {
   }

   public void keyTyped(KeyEvent e) {
      e.consume();
   }

   public void keyPressed(KeyEvent e) {
      e.consume();
   }

   public void keyReleased(KeyEvent e) {
      e.consume();
   }
}
