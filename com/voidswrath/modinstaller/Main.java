package com.voidswrath.modinstaller;

import com.voidswrath.util.OSInfo;
import com.voidswrath.util.Utilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
   public static final String VLPACKNAME = "pokepack";
   public JPanel contentPane;
   public final ButtonGroup buttonGroup = new ButtonGroup();
   public JTextField txtInstanceDir;
   public JComboBox comboBox;
   public JRadioButton rdbtnChooseLocation;
   public JRadioButton rdbtnDefLocation;
   public JButton btnInstall;
   public JProgressBar progressBar;
   public static Main instance;

   public static void main(String[] args) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var2) {
         ;
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main.instance = new Main();
               Main.instance.setVisible(true);
            } catch (Exception var2) {
               var2.printStackTrace();
            }

         }
      });
   }

   public void populateProfiles() {
      this.comboBox.removeAllItems();
      List profiles = Utilities.getProfiles();
      if (!profiles.isEmpty()) {
         Iterator var3 = profiles.iterator();

         while(var3.hasNext()) {
            String profile = (String)var3.next();
            this.comboBox.addItem(profile);
         }

         this.comboBox.setSelectedItem(Utilities.getSelectedProfile());
      }

   }

   public Main() {
      this.setTitle("RichDigits Mod Installer");
      this.setBounds(100, 100, 512, 400);

      try {
         this.setIconImage(ImageIO.read(Main.class.getResource("/resources/icon.png")));
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      this.setDefaultCloseOperation(0);
      this.addWindowListener(new InstallerListener());
      this.initComponents();
      this.populateProfiles();
   }

   public void initComponents() {
      this.contentPane = new JPanel();
      this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      this.setContentPane(this.contentPane);
      this.contentPane.setLayout(new BorderLayout(0, 0));
      JLayeredPane layeredPane = new JLayeredPane();
      this.contentPane.add(layeredPane, "Center");
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setHorizontalTextPosition(0);
      lblNewLabel.setHorizontalAlignment(0);
      lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/resources/modimage.png")));
      lblNewLabel.setBounds(0, 0, 489, 106);
      layeredPane.add(lblNewLabel);
      this.rdbtnDefLocation = new JRadioButton("Install in default location.");
      this.rdbtnDefLocation.setSelected(true);
      this.rdbtnDefLocation.addActionListener(new InstallerListener());
      this.buttonGroup.add(this.rdbtnDefLocation);
      this.rdbtnDefLocation.setBounds(32, 128, 215, 25);
      layeredPane.add(this.rdbtnDefLocation);
      this.rdbtnChooseLocation = new JRadioButton("Choose profile to install to:");
      this.rdbtnChooseLocation.addActionListener(new InstallerListener());
      this.buttonGroup.add(this.rdbtnChooseLocation);
      this.rdbtnChooseLocation.setBounds(32, 175, 189, 25);
      layeredPane.add(this.rdbtnChooseLocation);
      this.comboBox = new JComboBox();
      this.comboBox.addActionListener(new InstallerListener());
      this.comboBox.setBounds(229, 175, 215, 22);
      this.comboBox.setEnabled(false);
      layeredPane.add(this.comboBox);
      this.txtInstanceDir = new JTextField();
      this.txtInstanceDir.addKeyListener(new InstallerListener());
      this.txtInstanceDir.setBounds(32, 235, 412, 22);
      this.txtInstanceDir.setColumns(10);
      this.txtInstanceDir.setText(OSInfo.getWorkingDirectory("minecraft").getAbsolutePath());
      float[] colors = this.txtInstanceDir.getBackground().getColorComponents(new float[3]);
      this.txtInstanceDir.setCaretColor(new Color(colors[0], colors[1], colors[2], 0.0F));
      layeredPane.add(this.txtInstanceDir);
      this.btnInstall = new JButton("Install");
      this.btnInstall.addActionListener(new InstallerListener());
      this.btnInstall.setBounds(206 - this.btnInstall.getBorder().getBorderInsets(this.btnInstall).left, 278, 100, 25);
      layeredPane.add(this.btnInstall);
      this.progressBar = new JProgressBar();
      this.progressBar.setBounds(0, 316, 484, 27);
      layeredPane.add(this.progressBar);
      JLabel lblInstallationDirectory = new JLabel("Installation Directory:");
      lblInstallationDirectory.setBounds(32, 216, 412, 16);
      layeredPane.add(lblInstallationDirectory);
   }
}
