// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextArea;

// public class Practise {
//     public static void main(String[] args){
//         JFrame f = new JFrame("Null Layout Example");
//         f.setLayout(null);
//         f.setSize(400,400);

//         JLabel name = new JLabel();
//         JTextArea writeName = new JTextArea();
//         JLabel password  = new JLabel();
//         JTextArea writePassword = new JTextArea();
//         JButton submit = new JButton("Submit");

//         name.setBounds(50,50,80,30);
//         writeName.setBounds(150,50,150,30);

//         password.setBounds(50,100,80,30);
//         writePassword.setBounds(150,100,150,30);

//         submit.setBounds(150,160,100,40);

//         f.add(name);
//         f.add(submit);
//         f.add(writeName);
//         f.add(writePassword);
//         f.add(password);

//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

// ..........................................................................................................

// import javax.swing.*;
// import java.awt.*;

// public class Practise {

//     public static void main(String[] args) {

//         JFrame frame = new JFrame("GUI Controls using GridLayout");

//         frame.setLayout(new GridLayout(10,2,5,5));

//         // Name
//         frame.add(new JLabel("Name:"));
//         frame.add(new JTextField());

//         // Password
//         frame.add(new JLabel("Password:"));
//         frame.add(new JPasswordField());

//         // Address (TextArea with Scroll)
//         frame.add(new JLabel("Address:"));
//         JTextArea area = new JTextArea();
//         JScrollPane scroll = new JScrollPane(area);
//         frame.add(scroll);

//         // Checkboxes
//         frame.add(new JLabel("Skills:"));
//         JPanel skillPanel = new JPanel();
//         skillPanel.add(new JCheckBox("Java"));
//         skillPanel.add(new JCheckBox("Python"));
//         skillPanel.add(new JCheckBox("C++"));
//         frame.add(skillPanel);

//         // Radio Buttons
//         frame.add(new JLabel("Gender:"));
//         JRadioButton male = new JRadioButton("Male");
//         JRadioButton female = new JRadioButton("Female");

//         ButtonGroup group = new ButtonGroup();
//         group.add(male);
//         group.add(female);

//         JPanel genderPanel = new JPanel();
//         genderPanel.add(male);
//         genderPanel.add(female);

//         frame.add(genderPanel);

//         // Combo Box
//         frame.add(new JLabel("Country:"));
//         String countries[] = {"Nepal","India","USA","Japan"};
//         JComboBox<String> combo = new JComboBox<>(countries);
//         frame.add(combo);

//         // Slider
//         frame.add(new JLabel("Experience:"));
//         JSlider slider = new JSlider(0,10);
//         frame.add(slider);

//         // Buttons
//         frame.add(new JButton("Submit"));
//         frame.add(new JButton("Reset"));

//         frame.setSize(500,400);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 

// import javax.swing.*;
// import java.awt.*;

// public class Practise {

//     public static void main(String[] args) {

//         JFrame frame = new JFrame("Menu and Toolbar Demo");
//         frame.setSize(500,400);
//         frame.setLayout(new BorderLayout());

//         // ---- Menu Bar ----
//         JMenuBar menuBar = new JMenuBar();

//         JMenu fileMenu = new JMenu("File");
//         fileMenu.setMnemonic('F');  // Alt+F

//         JMenuItem newItem = new JMenuItem("New");
//         newItem.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
//         newItem.setToolTipText("Create a new file");

//         JMenuItem openItem = new JMenuItem("Open");
//         openItem.setEnabled(false); // Disabled menu item

//         JCheckBoxMenuItem autoSave = new JCheckBoxMenuItem("Auto Save");

//         JRadioButtonMenuItem option1 = new JRadioButtonMenuItem("Option 1");
//         JRadioButtonMenuItem option2 = new JRadioButtonMenuItem("Option 2");
//         ButtonGroup group = new ButtonGroup();
//         group.add(option1);
//         group.add(option2);

//         fileMenu.add(newItem);
//         fileMenu.add(openItem);
//         fileMenu.add(autoSave);
//         fileMenu.add(option1);
//         fileMenu.add(option2);

//         menuBar.add(fileMenu);
//         frame.setJMenuBar(menuBar);

//         // ---- Toolbar ----
//         JToolBar toolbar = new JToolBar();
//         JButton btnNew = new JButton("New");
//         btnNew.setToolTipText("Create a new file");
//         JButton btnOpen = new JButton("Open");
//         toolbar.add(btnNew);
//         toolbar.add(btnOpen);
//         frame.add(toolbar, BorderLayout.NORTH);

//         // ---- Pop-up Menu ----
//         JPopupMenu popup = new JPopupMenu();
//         JMenuItem cut = new JMenuItem("Cut");
//         JMenuItem copy = new JMenuItem("Copy");
//         popup.add(cut);
//         popup.add(copy);

//         JPanel panel = new JPanel();
//         panel.setComponentPopupMenu(popup); // Right-click menu
//         frame.add(panel, BorderLayout.CENTER);

//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 

// import javax.swing.*;

// import java.awt.FlowLayout;
// import java.awt.event.*;
// public class Practise {
// Practise()
// {
// JFrame frame = new JFrame("Menu Example");
// JMenuBar menuBar = new JMenuBar(); // Create Menu Bar
// //Create Menus
// JMenu fileMenu = new JMenu("File");
// JMenu editMenu = new JMenu("Edit");
// JMenu helpMenu = new JMenu("Help");
// //Create Menu Items
// JMenuItem newItem = new JMenuItem("New");
// JMenuItem openItem = new JMenuItem("Open");
// JMenuItem saveItem = new JMenuItem("Save");
// JMenuItem exitItem = new JMenuItem("Exit");
// JMenuItem cutItem = new JMenuItem("Cut");
// JMenuItem copyItem = new JMenuItem("Copy");
// JMenuItem pasteItem = new JMenuItem("Paste");
// JMenuItem aboutItem = new JMenuItem("About");
// //Add menu items to menus
// fileMenu.add(newItem);
// fileMenu.add(openItem);
// fileMenu.add(saveItem);
// fileMenu.addSeparator(); // adds a line separator
// fileMenu.add(exitItem);
// editMenu.add(cutItem);

// editMenu.add(copyItem);
// editMenu.add(pasteItem);
// helpMenu.add(aboutItem);
// //Add menus to menu bar
// menuBar.add(fileMenu);
// menuBar.add(editMenu);
// menuBar.add(helpMenu);
// // Add menu bar to frame
// // frame.setJMenuBar(menuBar);
// frame.add(menuBar);

// //Add Action Listeners
// exitItem.addActionListener(e -> System.exit(0));
// aboutItem.addActionListener(e ->
// JOptionPane.showMessageDialog(frame, "This is a simple menu example.")
// );
// frame.setSize(400, 300);
// frame.setLayout(new FlowLayout());
// frame.setVisible(true);
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// }
// public static void main(String[] args) {
// new Practise();
// }
// }

// import javax.swing.*;

// public class Practise {
//     Practise() {
//         int result = JOptionPane.showConfirmDialog(
//             null,
//             "Do you want to exit?",
//             "Exit Confirmation",
//             JOptionPane.YES_NO_OPTION
//         );

//         if (result == JOptionPane.YES_OPTION) {
//             System.out.println("User clicked YES");
//             System.exit(0);
//         } else {
//             System.out.println("User clicked NO");
//         }
//     }

//     public static void main(String[] args) {
//         new Practise();
//     }
// }

// import javax.swing.*;
// import java.awt.event.*;
// import java.io.File;

// public class Practise {
//     Practise() {
//         JFrame frame = new JFrame("File Chooser Example");
//         frame.setSize(400, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         JButton openButton = new JButton("Open File");
//         openButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 JFileChooser fileChooser = new JFileChooser();
//                 int result = fileChooser.showOpenDialog(frame);
//                 if (result == JFileChooser.APPROVE_OPTION) {
//                     File selectedFile = fileChooser.getSelectedFile();
//                     JOptionPane.showMessageDialog(frame,

//                             "You selected: " + selectedFile.getAbsolutePath());
//                 } else {
//                     JOptionPane.showMessageDialog(frame, "No file selected!");
//                 }
//             }
//         });
//         frame.add(openButton);
//         frame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Practise();
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practise {
    Practise() {
        JFrame frame = new JFrame("Color Chooser Example");
        frame.setSize(400, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("Choose Color");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.WHITE);
        button.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(frame, "Pick a Color", panel.getBackground());
            if (selectedColor != null) {
                panel.setBackground(selectedColor);
            }
        });
        frame.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Practise();
    }
}