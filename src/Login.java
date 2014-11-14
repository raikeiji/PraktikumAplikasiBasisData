///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author admin
// */
//import java.util.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
//
//import com.novell.beans.NWIDirQuery.*;
//import com.novell.beans.nwidirauthentication.*;
//import com.novell.beans.idirutil.*;
//
//
//// The class "ImagePanel" is used to dislay the Novell Icon.
//public class Login extends JFrame implements ActionListener, KeyListener{
//       
//       // Member variables ('m' -> member)
//       private String m_fullName = null;
//       private String m_serverName = null;
//       private String m_context = null;
//       private String m_email = null;
//       private String m_password = null;
//       private String m_entryFullName = null;
//
//       // Gui Components ('g' -> GUI component)
//       private JPanel           g_root = null;
//       private JLabel           g_emailLabel = null;
//       private JTextField       g_emailText = null;
//       private JLabel           g_passwordLabel = null;
//       private JPasswordField   g_passwordText = null;
//       private JTabbedPane      g_tabbedPane = null;
//       private JLabel           g_serverNameLabel = null;
//       private JTextField       g_serverNameText = null;
//       private JLabel           g_contextLabel = null;
//       private JTextField       g_contextText = null;
//       private JButton          g_login = null;
//       private JButton          g_cancel = null;
//       
//       Login(String title)
//       {
//            super(title);
//
//            Image novell = Toolkit.getDefaultToolkit().getImage("Novell.gif");
//
//            g_root = new JPanel();
//            g_root.setLayout( new BoxLayout(g_root, BoxLayout.Y_AXIS) );
//            g_root.setBorder( new javax.swing.border.LineBorder( 
//                                  (new Color(150,150,150)), 2 ) );
//     
//            ImagePanel pan1 = new ImagePanel(novell);
//            g_root.add(pan1);
//          
//            JPanel pan4 = new JPanel();
//            JPanel pan2 = new JPanel();
//            g_emailLabel = new JLabel("E-mail ID:  ");
//            g_emailLabel.setFont( new Font("Monospaced", Font.PLAIN, 12) );
//            g_emailText = new JTextField(40);
//            g_emailText.setFont( new Font("Monospaced", Font.BOLD, 12) );
//            pan2.add( g_emailLabel );
//            pan2.add( g_emailText );
//            g_emailText.addKeyListener( this );
//            pan4.add(pan2);
//            
//            JPanel pan3 = new JPanel();
//            g_passwordLabel = new JLabel(" Password:  ");
//            g_passwordLabel.setFont( new Font("Monospaced", Font.PLAIN, 12) );
//            g_passwordText = new JPasswordField(40);
//            g_passwordText.setFont( new Font("Monospaced", Font.BOLD, 12) );
//            pan3.add( g_passwordLabel );
//            pan3.add( g_passwordText );
//            g_passwordText.addKeyListener( this );
//            pan4.add(pan3);
//            g_root.add(pan4);
//   
//            g_tabbedPane = new JTabbedPane();
//            JPanel root_panel_inside_tabbedPane = new JPanel();
//            root_panel_inside_tabbedPane.setLayout(new BoxLayout(root_panel_inside_tabbedPane, 
//                                                   BoxLayout.Y_AXIS) );
//            root_panel_inside_tabbedPane.setBorder( new javax.swing.border.LineBorder( 
//                                  (new Color(150,150,150)), 3 ) );
//                   
//            JPanel pan11 = new JPanel();
//            g_serverNameLabel = new JLabel(" Server:  ");
//            g_serverNameLabel.setFont( new Font("Monospaced", Font.PLAIN, 12) );
//            g_serverNameText = new JTextField(45);
//            g_serverNameText.setFont( new Font("Monospaced", Font.BOLD, 12) );
//            pan11.add( g_serverNameLabel );
//            pan11.add( g_serverNameText );
//            g_serverNameText.addKeyListener( this );
//            root_panel_inside_tabbedPane.add(new JPanel());
//            root_panel_inside_tabbedPane.add(pan11);
//            
//            JPanel pan12 = new JPanel();
//            g_contextLabel = new JLabel("Context:  ");
//            g_contextLabel.setFont( new Font("Monospaced", Font.PLAIN, 12) );
//            g_contextText = new JTextField(45);
//            g_contextText.setFont( new Font("Monospaced", Font.BOLD, 12) );
//            pan12.add( g_contextLabel );
//            pan12.add( g_contextText );
//            g_contextText.addKeyListener( this );
//            root_panel_inside_tabbedPane.add(pan12);
//            
//            g_tabbedPane.addTab("Server and Context", null, root_panel_inside_tabbedPane, "");
//            g_root.add( g_tabbedPane );
//  
//
//            JSeparator sep1 = new JSeparator();
//            g_root.add(sep1);
//
//            JPanel pan5 = new JPanel();
//            pan5.setLayout(null);
//            g_login = new JButton("  Login  ");
//            g_cancel = new JButton("  Cancel  ");
//            pan5.add(g_login);
//            pan5.add(g_cancel);
//            Insets insets = pan5.getInsets();
//            g_login.setBounds(330 + insets.left, insets.top, 90, 30);
//            g_cancel.setBounds(430 + insets.left, insets.top, 90, 30);
//            g_root.add(pan5);
//            
//            g_login.addActionListener(this);
//            g_cancel.addActionListener(this);
//
//            this.getContentPane().add( g_root );
//            this.setBounds(100,100,530,325);
//            this.setVisible(true);
//       }
//       
//       public void actionPerformed(ActionEvent evt)
//       {
//           if(evt.getSource() == g_login) 
//             this.checkFields();
//           if(evt.getSource() == g_cancel)
//             System.exit(0);
//       }
//
//       public void keyTyped(KeyEvent e) {}
//       public void keyReleased(KeyEvent e) {}
//       public void keyPressed(KeyEvent evt)
//       {
//            if(evt.getKeyCode() == KeyEvent.VK_ENTER)
//              checkFields();
//       }
//
//       private void checkFields()
//       {
//             m_email = g_emailText.getText();
//             m_password = new String(g_passwordText.getPassword());
//             m_serverName = g_serverNameText.getText();
//             m_context = g_contextText.getText();
//
//             if((m_email == null) || (m_email.equals(""))) {
//               JOptionPane.showMessageDialog(this, "Enter the E-mail ID", "Error", 
//                                             JOptionPane.ERROR_MESSAGE);
//               return;
//             }
//             else if(m_password == null) {
//                    JOptionPane.showMessageDialog(this, "Enter the Password", "Error", 
//                                                  JOptionPane.ERROR_MESSAGE);
//                   return;
//             }
//             else if((m_serverName == null) || (m_serverName.equals(""))) {
//                    JOptionPane.showMessageDialog(this, "Enter the ServerName", "Error", 
//                                                  JOptionPane.ERROR_MESSAGE);
//                    return;
//             }
//             
//             this.doSearch();
//      }
//
//
//       // It will search NDS using anonymous authentication.
//       // Gets the "userName" whose "e-mail ID" is set.
//       private void doSearch() 
//       {
//             NWQueryResult[] result = null;
//             try {
//                // Instantiate NWIDirQuery bean object
//                NWIDirQuery query = new NWIDirQuery();
//                // set your filter "mail=your_email_address"
//                String filter = "mail=" + m_email ;
//                query.setFilter(filter);
//
//                // Create the fullName using LDAP server and search context
//                String fullName = "";
//                if(m_serverName.toUpperCase().startsWith("LDAP:")) 
//                  fullName = m_serverName + "/" + m_context;
//                else
//                  fullName = "LDAP://" + m_serverName + "/" + m_context; 
//
//                // set the fullName in the bean
//                query.setFullName(fullName);
//                // set the searchScope to the subtree level
//                query.setSearchScope(NWSearchScope.qrySearchSubtree);
//
//                // do anonymous authentication 
//                query.authenticate();
//                // search the NDS
//                result = query.Search(); 
//                // undo anonymous authentication
//                query.unauthenticate();
//             }catch(Exception e) {
//               System.out.println(e.toString());
//               JOptionPane.showMessageDialog(this, "Unable to establish connection", 
//                                        "Error", JOptionPane.ERROR_MESSAGE);
//             }
//
//             // get the userName from the search results. 
//             // If more than one userName found then chose the userName, using
//             // which you want to authenticate.
//             if(result.length == 0) // If no entry found
//               JOptionPane.showMessageDialog(this, "User not Found", "Error", 
//                                            JOptionPane.ERROR_MESSAGE);
//             else  if(result.length == 1) 
//                     // if only one entry found, use that userName and doLogin
//                     doLogin( result[0].getFullName() );
//                   else {  // If more than one entry found with the same e-mail
//                           // choose one of then to login.
//                     String[] fullNames = new String[result.length];
//                     for(int n=0; n<result.length; n++)
//                        fullNames[n] = result[n].getFullName();
//                     new ChoiceDialog(fullNames, this);
//                   }
//      
//       }
//
//       void doLogin(String fullName)
//       {
//          m_fullName = fullName; // set the fullName of the user 
//          boolean authSuccessful = false;
//          
//         try {
//            // connect to the server using LDAPConnection and authenticate.
//            NWIDirAuthentication connection = new NWIDirAuthentication();
//            // set the fullName of the user
//            connection.setUserName(m_fullName);
//            // set the password of the user
//            connection.setPassword(m_password);
//            // set LDAPv3
//            connection.setVersion(3);
//            // authenticate
//            connection.authenticate();
//            authSuccessful = true;
//            this.setVisible(false);
//            if(m_password.equals(""))
//              JOptionPane.showMessageDialog(this, "Authenticated Anonymously...", 
//                                       "Success", JOptionPane.INFORMATION_MESSAGE);
//            else
//              JOptionPane.showMessageDialog(this, "Authentication Successful...", 
//                                       "Success", JOptionPane.INFORMATION_MESSAGE);
//              
//         }catch(Exception e) {
//               System.out.println(e.toString());
//               this.setVisible(true);
//               JOptionPane.showMessageDialog(this, "Invalid Credentials", 
//                                            "Error", JOptionPane.ERROR_MESSAGE);
//         }
//         
//         if(authSuccessful) {
//           // Now you are authenticated, and do further operations.......
//         
//           // In this sample program exiting...
//           System.exit(0);
//         }
//       }
//  
//  
//       public static void main(String[] args) 
//       {
//            try {
//              UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//            }catch(Exception e) {
//                  e.printStackTrace();
//            }
//            Login l = new Login("NDS Login Using Query Bean");
//            l.addWindowListener( new WindowAdapter() {
//                                       public void windowClosing(WindowEvent e) {
//                                          System.exit(0);
//                                       }
//                                     }
//                                );
//      
//       }
//}
//class ImagePanel extends JPanel {
//  Image image;
//              
//  public ImagePanel(Image image) 
//  {
//      this.image = image;
//  }
//              
//  public void paintComponent(Graphics g) 
//  {
//      super.paintComponent(g); //paint background
//      g.drawImage(image, 0, 0, this); 
//  }
//} 
//
//         
//class ChoiceDialog extends JDialog implements ActionListener{
//    
//      private Login owner = null;
//      private JComboBox g_combo = null;
//      private JButton g_ok = null;
//
//      ChoiceDialog(String[] users, Frame owner)
//      {
//         super(owner, "Choose UserName", true);
//         this.owner = (Login) owner;
//
//         JPanel pan = new JPanel();
//         pan.setLayout( new BoxLayout(pan,BoxLayout.Y_AXIS) ); 
//         
//         JLabel lab = new JLabel("Multiple Entries Found : Choose UserName");
//         lab.setFont( new Font("Halvetica", Font.BOLD, 16) );
//         lab.setForeground( new Color(250, 100, 100) );
//         lab.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//         g_combo = new JComboBox( users );
//         g_combo.setFont( new Font("Monospaced", Font.BOLD, 12) );
//         g_combo.setEnabled( true );
//         g_combo.setAlignmentX(Component.CENTER_ALIGNMENT);
//         g_combo.setBorder( new javax.swing.border.LineBorder( 
//                                  (new Color(120,120,120)), 3 ) );
//
//         JSeparator sep = new JSeparator();
//
//         pan.add( lab );
//         pan.add( g_combo );
//         pan.add( sep );
//
//         g_ok = new JButton("     Login     ");
//         g_ok.setAlignmentX(Component.CENTER_ALIGNMENT);
//         g_ok.setFont( new Font("Halvetica", Font.BOLD, 16) );
//         pan.add( g_ok );
//         g_ok.addActionListener(this);
//   
//         this.getContentPane().add(pan);
//         this.setBounds(150,150,450,150);
//         this.setVisible(true);
//      }
//      
//      public void actionPerformed(ActionEvent evt)
//      {
//          String fullName = null;
//          fullName = (String) g_combo.getSelectedItem();
//          this.hide();
//          this.owner.doLogin( fullName );
//          return;
//      }
//}