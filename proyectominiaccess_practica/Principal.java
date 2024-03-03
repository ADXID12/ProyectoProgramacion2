package proyectominiaccess_practica;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    int xMouse;
    int yMouse;

    public Principal() {
        initComponents();
        
        pack();
        this.setExtendedState(MAXIMIZED_BOTH);
        //Separator Visible
        js_account.setVisible(false);
        js_feedback.setVisible(false);
        js_new.setVisible(false);
        js_open.setVisible(false);
        js_options.setVisible(false);
        js_pin.setVisible(false);
        js_SIuser.setVisible(false);
        js_createOne.setVisible(false);
        //Panels Visible
        p_menu.setVisible(true);
        panel_new.setVisible(false);
        panel_open.setVisible(false);
        p_account.setVisible(false);
        p_feedback.setVisible(false);
        p_Pagina.setVisible(false);
        
        //JTree
        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Test on LocalHost");
        DefaultMutableTreeNode table1 = new DefaultMutableTreeNode("Table 1");
        dmtn.add(table1);
        DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
        jtr_baseDatos.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_options = new javax.swing.JDialog();
        p_optiones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        l_trust = new javax.swing.JLabel();
        l_general = new javax.swing.JLabel();
        l_current = new javax.swing.JLabel();
        l_datasheet = new javax.swing.JLabel();
        l_object = new javax.swing.JLabel();
        l_proofing = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        l_language = new javax.swing.JLabel();
        l_client = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        l_customize = new javax.swing.JLabel();
        l_quick = new javax.swing.JLabel();
        l_addins = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        chbx_values = new javax.swing.JCheckBox();
        chbx_enableLive = new javax.swing.JCheckBox();
        cb_screentip = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cb_DffBD = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cb_DdatabaseF = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cb_NewDSO = new javax.swing.JComboBox<>();
        bt_browse = new javax.swing.JButton();
        cb_OfficeBackground = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cb_Officetheme = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cb_UserName = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cb_initials = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        chbx_shortcutKeys = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        l_exitO = new javax.swing.JLabel();
        l_ayudaO = new javax.swing.JLabel();
        jd_crearBlank = new javax.swing.JDialog();
        p_crearBlank = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        l_buttonCrearPagina = new javax.swing.JLabel();
        jd_Cuenta = new javax.swing.JDialog();
        p_SIUser = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        l_cerrarJDC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l_CreateOne = new javax.swing.JLabel();
        txtf_SIUser = new javax.swing.JTextField();
        js_createOne = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bt_SInext = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        js_SIuser = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        p_SIPassword = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        l_cerrarJDC1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        l_forgotP = new javax.swing.JLabel();
        txtf_SIPassword = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        l_nombreUsuarioP = new javax.swing.JLabel();
        bt_signin = new javax.swing.JButton();
        l_privacyStatement = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        l_SIregreso = new javax.swing.JLabel();
        p_CUUser = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        l_cerrarJDC2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtf_CUUser = new javax.swing.JTextField();
        l_CreateEspecial = new javax.swing.JLabel();
        js_SIuser1 = new javax.swing.JSeparator();
        bt_CUnext = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        p_CUPassword = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        l_CUregreso = new javax.swing.JLabel();
        l_nombreUsuarioPCU = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtf_CUPassword = new javax.swing.JTextField();
        l_forgotP1 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        bt_createAccount = new javax.swing.JButton();
        p_CUUserEspecial = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        l_cerrarJDC3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtf_CUUserEspecial = new javax.swing.JTextField();
        l_returnCU = new javax.swing.JLabel();
        js_SIuser2 = new javax.swing.JSeparator();
        bt_CUnextEspecial = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        p_CUPasswordEspecial = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        l_SIregresoE = new javax.swing.JLabel();
        l_nombreUsuarioPE = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtf_CUPasswordEspecial = new javax.swing.JTextField();
        l_forgotP2 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        bt_createAccountEspecial = new javax.swing.JButton();
        p_inicio = new javax.swing.JPanel();
        p_headerCierre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l_Cuenta = new javax.swing.JLabel();
        l_exit = new javax.swing.JLabel();
        l_improve = new javax.swing.JLabel();
        l_ayuda = new javax.swing.JLabel();
        l_ocultar = new javax.swing.JLabel();
        l_minimize = new javax.swing.JLabel();
        p_ladoIzq = new javax.swing.JPanel();
        l_home = new javax.swing.JLabel();
        l_new = new javax.swing.JLabel();
        l_open = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        l_options = new javax.swing.JLabel();
        l_account = new javax.swing.JLabel();
        l_feedback = new javax.swing.JLabel();
        js_account = new javax.swing.JSeparator();
        js_feedback = new javax.swing.JSeparator();
        js_options = new javax.swing.JSeparator();
        js_home = new javax.swing.JSeparator();
        js_new = new javax.swing.JSeparator();
        js_open = new javax.swing.JSeparator();
        p_menu = new javax.swing.JPanel();
        bt_new = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        p_new = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtf_search = new javax.swing.JTextField();
        p_searchIcon = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        p_search = new javax.swing.JPanel();
        l_recent = new javax.swing.JLabel();
        l_pin = new javax.swing.JLabel();
        js_pin = new javax.swing.JSeparator();
        js_recent = new javax.swing.JSeparator();
        panel_new = new javax.swing.JPanel();
        p_newN = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        panel_open = new javax.swing.JPanel();
        txtf_search1 = new javax.swing.JTextField();
        p_searchIcon1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        p_searchO = new javax.swing.JPanel();
        l_recent1 = new javax.swing.JLabel();
        l_pin1 = new javax.swing.JLabel();
        js_pin1 = new javax.swing.JSeparator();
        js_recent1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        p_account = new javax.swing.JPanel();
        p_feedback = new javax.swing.JPanel();
        p_Pagina = new javax.swing.JPanel();
        p_headerCierre1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        l_Cuenta2 = new javax.swing.JLabel();
        l_exit1 = new javax.swing.JLabel();
        l_improve1 = new javax.swing.JLabel();
        l_ayuda1 = new javax.swing.JLabel();
        l_ocultar1 = new javax.swing.JLabel();
        l_minimize1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtr_baseDatos = new javax.swing.JTree();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_table = new javax.swing.JTable();

        jd_options.setUndecorated(true);

        p_optiones.setBackground(new java.awt.Color(82, 82, 82));
        p_optiones.setMinimumSize(new java.awt.Dimension(800, 600));
        p_optiones.setPreferredSize(new java.awt.Dimension(800, 600));
        p_optiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(189, 189, 189));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_trust.setBackground(new java.awt.Color(189, 189, 189));
        l_trust.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_trust.setForeground(new java.awt.Color(0, 0, 0));
        l_trust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_trust.setText("Trust Center");
        l_trust.setOpaque(true);
        l_trust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_trustMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_trustMouseExited(evt);
            }
        });
        jPanel1.add(l_trust, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 420, 160, 30));

        l_general.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_general.setForeground(new java.awt.Color(0, 0, 0));
        l_general.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_general.setText("General");
        l_general.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_generalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_generalMouseExited(evt);
            }
        });
        jPanel1.add(l_general, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        l_current.setBackground(new java.awt.Color(189, 189, 189));
        l_current.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_current.setForeground(new java.awt.Color(0, 0, 0));
        l_current.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_current.setText("Current Database");
        l_current.setOpaque(true);
        l_current.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_currentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_currentMouseExited(evt);
            }
        });
        jPanel1.add(l_current, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 30));

        l_datasheet.setBackground(new java.awt.Color(189, 189, 189));
        l_datasheet.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_datasheet.setForeground(new java.awt.Color(0, 0, 0));
        l_datasheet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_datasheet.setText("Datasheet");
        l_datasheet.setOpaque(true);
        l_datasheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_datasheetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_datasheetMouseExited(evt);
            }
        });
        jPanel1.add(l_datasheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, 30));

        l_object.setBackground(new java.awt.Color(189, 189, 189));
        l_object.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_object.setForeground(new java.awt.Color(0, 0, 0));
        l_object.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_object.setText("Object Designers");
        l_object.setOpaque(true);
        l_object.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_objectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_objectMouseExited(evt);
            }
        });
        jPanel1.add(l_object, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 30));

        l_proofing.setBackground(new java.awt.Color(189, 189, 189));
        l_proofing.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_proofing.setForeground(new java.awt.Color(0, 0, 0));
        l_proofing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_proofing.setText("Proofing");
        l_proofing.setOpaque(true);
        l_proofing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_proofingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_proofingMouseExited(evt);
            }
        });
        jPanel1.add(l_proofing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 10));

        l_language.setBackground(new java.awt.Color(189, 189, 189));
        l_language.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_language.setForeground(new java.awt.Color(0, 0, 0));
        l_language.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_language.setText("Language");
        l_language.setOpaque(true);
        l_language.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_languageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_languageMouseExited(evt);
            }
        });
        jPanel1.add(l_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 30));

        l_client.setBackground(new java.awt.Color(189, 189, 189));
        l_client.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_client.setForeground(new java.awt.Color(0, 0, 0));
        l_client.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_client.setText("Client Settings");
        l_client.setOpaque(true);
        l_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_clientMouseExited(evt);
            }
        });
        jPanel1.add(l_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, 10));

        l_customize.setBackground(new java.awt.Color(189, 189, 189));
        l_customize.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_customize.setForeground(new java.awt.Color(0, 0, 0));
        l_customize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_customize.setText("Customize Ribbon");
        l_customize.setOpaque(true);
        l_customize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_customizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_customizeMouseExited(evt);
            }
        });
        jPanel1.add(l_customize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 30));

        l_quick.setBackground(new java.awt.Color(189, 189, 189));
        l_quick.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_quick.setForeground(new java.awt.Color(0, 0, 0));
        l_quick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_quick.setText("Quick Access Toolbar");
        l_quick.setOpaque(true);
        l_quick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_quickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_quickMouseExited(evt);
            }
        });
        jPanel1.add(l_quick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 330, 160, 30));

        l_addins.setBackground(new java.awt.Color(189, 189, 189));
        l_addins.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        l_addins.setForeground(new java.awt.Color(0, 0, 0));
        l_addins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_addins.setText("Add-ins");
        l_addins.setOpaque(true);
        l_addins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_addinsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_addinsMouseExited(evt);
            }
        });
        jPanel1.add(l_addins, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 380, 160, 30));

        p_optiones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, 540));

        jPanel2.setBackground(new java.awt.Color(82, 82, 82));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(82, 82, 82));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ScreenTip style:");
        jLabel3.setIconTextGap(21);
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 20));

        jLabel22.setBackground(new java.awt.Color(82, 82, 82));
        jLabel22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/general_options_access (2).png"))); // NOI18N
        jLabel22.setText("General Options for working with Access");
        jLabel22.setIconTextGap(21);
        jLabel22.setOpaque(true);
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 290, 50));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 550, 20));

        jLabel23.setBackground(new java.awt.Color(82, 82, 82));
        jLabel23.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Creating database");
        jLabel23.setIconTextGap(21);
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 550, 20));

        jLabel24.setBackground(new java.awt.Color(82, 82, 82));
        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Personalize your copy of Microsoft Office");
        jLabel24.setIconTextGap(21);
        jLabel24.setOpaque(true);
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 550, 20));

        jLabel25.setBackground(new java.awt.Color(82, 82, 82));
        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("User interface options");
        jLabel25.setIconTextGap(21);
        jLabel25.setOpaque(true);
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 50));

        chbx_values.setBackground(new java.awt.Color(82, 82, 82));
        chbx_values.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chbx_values.setForeground(new java.awt.Color(255, 255, 255));
        chbx_values.setText("Always use these values regardless of sign in to Office.");
        jPanel2.add(chbx_values, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        chbx_enableLive.setBackground(new java.awt.Color(82, 82, 82));
        chbx_enableLive.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chbx_enableLive.setForeground(new java.awt.Color(255, 255, 255));
        chbx_enableLive.setText("Enable Live Preview");
        jPanel2.add(chbx_enableLive, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        cb_screentip.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_screentip, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 20));

        jLabel26.setBackground(new java.awt.Color(82, 82, 82));
        jLabel26.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Default file format for Blank Database:");
        jLabel26.setIconTextGap(21);
        jLabel26.setOpaque(true);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 20));

        cb_DffBD.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_DffBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 210, 20));

        jLabel27.setBackground(new java.awt.Color(82, 82, 82));
        jLabel27.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Default Database folder:");
        jLabel27.setIconTextGap(21);
        jLabel27.setOpaque(true);
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 140, 20));

        cb_DdatabaseF.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_DdatabaseF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 280, 20));

        jLabel28.setBackground(new java.awt.Color(82, 82, 82));
        jLabel28.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("New Database sort order: ");
        jLabel28.setIconTextGap(21);
        jLabel28.setOpaque(true);
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 20));

        cb_NewDSO.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_NewDSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 20));

        bt_browse.setBackground(new java.awt.Color(189, 189, 189));
        bt_browse.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bt_browse.setForeground(new java.awt.Color(0, 0, 0));
        bt_browse.setText("Browse...");
        jPanel2.add(bt_browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 248, 90, -1));

        cb_OfficeBackground.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_OfficeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 210, 20));

        jLabel29.setBackground(new java.awt.Color(82, 82, 82));
        jLabel29.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Office Background:");
        jLabel29.setIconTextGap(21);
        jLabel29.setOpaque(true);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, 20));

        cb_Officetheme.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_Officetheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 210, 20));

        jLabel30.setBackground(new java.awt.Color(82, 82, 82));
        jLabel30.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Office Theme:");
        jLabel30.setIconTextGap(21);
        jLabel30.setOpaque(true);
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 140, 20));

        cb_UserName.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 210, 20));

        jLabel31.setBackground(new java.awt.Color(82, 82, 82));
        jLabel31.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("User Name:");
        jLabel31.setIconTextGap(21);
        jLabel31.setOpaque(true);
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 20));

        cb_initials.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.add(cb_initials, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 210, 20));

        jLabel32.setBackground(new java.awt.Color(82, 82, 82));
        jLabel32.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Initials: ");
        jLabel32.setIconTextGap(21);
        jLabel32.setOpaque(true);
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 140, 20));

        chbx_shortcutKeys.setBackground(new java.awt.Color(82, 82, 82));
        chbx_shortcutKeys.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chbx_shortcutKeys.setForeground(new java.awt.Color(255, 255, 255));
        chbx_shortcutKeys.setText("Show shortcut keys in ScreenTips");
        jPanel2.add(chbx_shortcutKeys, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        p_optiones.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 590, 550));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Access Option");
        jLabel21.setIconTextGap(21);
        p_optiones.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

        jPanel3.setBackground(new java.awt.Color(82, 82, 82));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_exitO.setBackground(new java.awt.Color(82, 82, 82));
        l_exitO.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        l_exitO.setForeground(new java.awt.Color(255, 255, 255));
        l_exitO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_exitO.setText("X");
        l_exitO.setOpaque(true);
        l_exitO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_exitOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_exitOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_exitOMouseExited(evt);
            }
        });
        jPanel3.add(l_exitO, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 0, 40, 40));

        l_ayudaO.setBackground(new java.awt.Color(82, 82, 82));
        l_ayudaO.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        l_ayudaO.setForeground(new java.awt.Color(255, 255, 255));
        l_ayudaO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_ayudaO.setText("?");
        l_ayudaO.setOpaque(true);
        l_ayudaO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l_ayudaOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l_ayudaOMouseExited(evt);
            }
        });
        jPanel3.add(l_ayudaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, 40, 40));

        p_optiones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -1, 810, 40));

        javax.swing.GroupLayout jd_optionsLayout = new javax.swing.GroupLayout(jd_options.getContentPane());
        jd_options.getContentPane().setLayout(jd_optionsLayout);
        jd_optionsLayout.setHorizontalGroup(
            jd_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jd_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_optionsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p_optiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jd_optionsLayout.setVerticalGroup(
            jd_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jd_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_optionsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p_optiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jd_crearBlank.setMinimumSize(new java.awt.Dimension(650, 400));
        jd_crearBlank.setPreferredSize(new java.awt.Dimension(650, 400));
        jd_crearBlank.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_crearBlank.setBackground(new java.awt.Color(85, 85, 85));
        p_crearBlank.setMinimumSize(new java.awt.Dimension(800, 600));
        p_crearBlank.setPreferredSize(new java.awt.Dimension(800, 600));
        p_crearBlank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blankdatabase (5).png"))); // NOI18N
        p_crearBlank.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("File Name");
        p_crearBlank.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 180, -1));

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Blank Database");
        p_crearBlank.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 180, -1));

        jTextField1.setBackground(new java.awt.Color(189, 189, 189));
        jTextField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Database ");
        p_crearBlank.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 170, -1));

        jButton1.setBackground(new java.awt.Color(189, 189, 189));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        p_crearBlank.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 40, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C:\\");
            p_crearBlank.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

            l_buttonCrearPagina.setBackground(new java.awt.Color(164, 55, 58));
            l_buttonCrearPagina.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
            l_buttonCrearPagina.setForeground(new java.awt.Color(255, 255, 255));
            l_buttonCrearPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_buttonCrearPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new paper (2).png"))); // NOI18N
            l_buttonCrearPagina.setText("Create");
            l_buttonCrearPagina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(164, 101, 96), 1, true));
            l_buttonCrearPagina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_buttonCrearPagina.setOpaque(true);
            l_buttonCrearPagina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            l_buttonCrearPagina.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_buttonCrearPaginaMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_buttonCrearPaginaMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_buttonCrearPaginaMouseExited(evt);
                }
            });
            p_crearBlank.add(l_buttonCrearPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 80, 80));

            jd_crearBlank.getContentPane().add(p_crearBlank, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            jd_Cuenta.setMinimumSize(new java.awt.Dimension(450, 600));
            jd_Cuenta.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            p_SIUser.setBackground(new java.awt.Color(255, 255, 255));
            p_SIUser.setPreferredSize(new java.awt.Dimension(450, 600));
            p_SIUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel7.setBackground(new java.awt.Color(225, 225, 225));
            jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_cerrarJDC.setBackground(new java.awt.Color(225, 225, 225));
            l_cerrarJDC.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
            l_cerrarJDC.setForeground(new java.awt.Color(0, 0, 0));
            l_cerrarJDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_cerrarJDC.setText("X");
            l_cerrarJDC.setOpaque(true);
            l_cerrarJDC.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_cerrarJDCMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_cerrarJDCMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_cerrarJDCMouseExited(evt);
                }
            });
            jPanel7.add(l_cerrarJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

            p_SIUser.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft-Logo-PNG(2).png"))); // NOI18N
            p_SIUser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 40));

            l_CreateOne.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_CreateOne.setForeground(new java.awt.Color(0, 51, 255));
            l_CreateOne.setText("Create One!");
            l_CreateOne.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_CreateOneMouseEntered(evt);
                }
            });
            p_SIUser.add(l_CreateOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 210, -1, -1));

            txtf_SIUser.setBackground(new java.awt.Color(255, 255, 255));
            txtf_SIUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtf_SIUser.setForeground(new java.awt.Color(0, 0, 0));
            txtf_SIUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            txtf_SIUser.setText("User Name");
            txtf_SIUser.setBorder(null);
            txtf_SIUser.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtf_SIUserMouseClicked(evt);
                }
            });
            p_SIUser.add(txtf_SIUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 30));
            p_SIUser.add(js_createOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 220, 67, 10));

            jLabel8.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 0, 0));
            jLabel8.setText("Sign in");
            p_SIUser.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

            jLabel17.setBackground(new java.awt.Color(255, 255, 255));
            jLabel17.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel17.setForeground(new java.awt.Color(102, 102, 102));
            jLabel17.setText("©2024 Microsoft");
            p_SIUser.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

            bt_SInext.setBackground(new java.awt.Color(51, 110, 200));
            bt_SInext.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
            bt_SInext.setForeground(new java.awt.Color(255, 255, 255));
            bt_SInext.setText("Next");
            bt_SInext.setBorder(null);
            bt_SInext.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    bt_SInextMouseClicked(evt);
                }
            });
            p_SIUser.add(bt_SInext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, 30));

            jLabel18.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel18.setForeground(new java.awt.Color(0, 0, 0));
            jLabel18.setText("No account?");
            p_SIUser.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

            jLabel19.setBackground(new java.awt.Color(255, 255, 255));
            jLabel19.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel19.setForeground(new java.awt.Color(102, 102, 102));
            jLabel19.setText("Privacy statement");
            jLabel19.setOpaque(true);
            p_SIUser.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));
            p_SIUser.add(js_SIuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 10));
            p_SIUser.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 67, 10));

            jd_Cuenta.getContentPane().add(p_SIUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

            p_SIPassword.setBackground(new java.awt.Color(255, 255, 255));
            p_SIPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel8.setBackground(new java.awt.Color(225, 225, 225));
            jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_cerrarJDC1.setBackground(new java.awt.Color(225, 225, 225));
            l_cerrarJDC1.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
            l_cerrarJDC1.setForeground(new java.awt.Color(0, 0, 0));
            l_cerrarJDC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_cerrarJDC1.setText("X");
            l_cerrarJDC1.setOpaque(true);
            l_cerrarJDC1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC1MouseExited(evt);
                }
            });
            jPanel8.add(l_cerrarJDC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

            p_SIPassword.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft-Logo-PNG(2).png"))); // NOI18N
            p_SIPassword.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

            l_forgotP.setBackground(new java.awt.Color(255, 255, 255));
            l_forgotP.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_forgotP.setForeground(new java.awt.Color(0, 51, 255));
            l_forgotP.setText("Forgot Password?");
            l_forgotP.setOpaque(true);
            p_SIPassword.add(l_forgotP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 189, -1, -1));

            txtf_SIPassword.setBackground(new java.awt.Color(255, 255, 255));
            txtf_SIPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtf_SIPassword.setForeground(new java.awt.Color(0, 0, 0));
            txtf_SIPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            txtf_SIPassword.setText("Password");
            txtf_SIPassword.setBorder(null);
            txtf_SIPassword.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtf_SIPasswordMouseClicked(evt);
                }
            });
            p_SIPassword.add(txtf_SIPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, 30));

            jLabel34.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
            jLabel34.setForeground(new java.awt.Color(0, 0, 0));
            jLabel34.setText("Enter password");
            p_SIPassword.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

            l_nombreUsuarioP.setBackground(new java.awt.Color(255, 255, 255));
            l_nombreUsuarioP.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_nombreUsuarioP.setForeground(new java.awt.Color(102, 102, 102));
            l_nombreUsuarioP.setText("Nombre Usuario");
            p_SIPassword.add(l_nombreUsuarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

            bt_signin.setBackground(new java.awt.Color(51, 110, 200));
            bt_signin.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
            bt_signin.setForeground(new java.awt.Color(255, 255, 255));
            bt_signin.setText("Sign in");
            bt_signin.setBorder(null);
            bt_signin.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    bt_signinMouseClicked(evt);
                }
            });
            p_SIPassword.add(bt_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 100, 30));

            l_privacyStatement.setBackground(new java.awt.Color(255, 255, 255));
            l_privacyStatement.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_privacyStatement.setForeground(new java.awt.Color(102, 102, 102));
            l_privacyStatement.setText("Privacy statement");
            l_privacyStatement.setOpaque(true);
            p_SIPassword.add(l_privacyStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));
            p_SIPassword.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 360, 10));
            p_SIPassword.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 67, 10));

            jLabel36.setBackground(new java.awt.Color(255, 255, 255));
            jLabel36.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel36.setForeground(new java.awt.Color(102, 102, 102));
            jLabel36.setText("©2024 Microsoft");
            p_SIPassword.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

            l_SIregreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            l_SIregreso.setForeground(new java.awt.Color(102, 102, 102));
            l_SIregreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_SIregreso.setText("<");
            l_SIregreso.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            l_SIregreso.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_SIregresoMouseClicked(evt);
                }
            });
            p_SIPassword.add(l_SIregreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, 20, -1));

            jd_Cuenta.getContentPane().add(p_SIPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

            p_CUUser.setBackground(new java.awt.Color(255, 255, 255));
            p_CUUser.setMinimumSize(new java.awt.Dimension(450, 600));
            p_CUUser.setPreferredSize(new java.awt.Dimension(450, 600));
            p_CUUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel9.setBackground(new java.awt.Color(225, 225, 225));
            jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_cerrarJDC2.setBackground(new java.awt.Color(225, 225, 225));
            l_cerrarJDC2.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
            l_cerrarJDC2.setForeground(new java.awt.Color(0, 0, 0));
            l_cerrarJDC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_cerrarJDC2.setText("X");
            l_cerrarJDC2.setOpaque(true);
            l_cerrarJDC2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC2MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC2MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC2MouseExited(evt);
                }
            });
            jPanel9.add(l_cerrarJDC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

            p_CUUser.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft-Logo-PNG(2).png"))); // NOI18N
            p_CUUser.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 40));

            jLabel33.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
            jLabel33.setForeground(new java.awt.Color(0, 0, 0));
            jLabel33.setText("Create Account");
            p_CUUser.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

            txtf_CUUser.setBackground(new java.awt.Color(255, 255, 255));
            txtf_CUUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtf_CUUser.setForeground(new java.awt.Color(0, 0, 0));
            txtf_CUUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            txtf_CUUser.setText("User Name");
            txtf_CUUser.setBorder(null);
            txtf_CUUser.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtf_CUUserMouseClicked(evt);
                }
            });
            p_CUUser.add(txtf_CUUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 30));

            l_CreateEspecial.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_CreateEspecial.setForeground(new java.awt.Color(0, 51, 255));
            l_CreateEspecial.setText("Create a especial account!");
            l_CreateEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_CreateEspecialMouseEntered(evt);
                }
            });
            p_CUUser.add(l_CreateEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
            p_CUUser.add(js_SIuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 10));

            bt_CUnext.setBackground(new java.awt.Color(51, 110, 200));
            bt_CUnext.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
            bt_CUnext.setForeground(new java.awt.Color(255, 255, 255));
            bt_CUnext.setText("Next");
            bt_CUnext.setBorder(null);
            bt_CUnext.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    bt_CUnextMouseClicked(evt);
                }
            });
            p_CUUser.add(bt_CUnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, 30));

            jLabel37.setBackground(new java.awt.Color(255, 255, 255));
            jLabel37.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel37.setForeground(new java.awt.Color(102, 102, 102));
            jLabel37.setText("©2024 Microsoft");
            p_CUUser.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

            jLabel38.setBackground(new java.awt.Color(255, 255, 255));
            jLabel38.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel38.setForeground(new java.awt.Color(102, 102, 102));
            jLabel38.setText("Privacy statement");
            jLabel38.setOpaque(true);
            p_CUUser.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

            jd_Cuenta.getContentPane().add(p_CUUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            p_CUPassword.setBackground(new java.awt.Color(255, 255, 255));
            p_CUPassword.setMinimumSize(new java.awt.Dimension(450, 600));
            p_CUPassword.setPreferredSize(new java.awt.Dimension(450, 600));
            p_CUPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft-Logo-PNG(2).png"))); // NOI18N
            p_CUPassword.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

            l_CUregreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            l_CUregreso.setForeground(new java.awt.Color(102, 102, 102));
            l_CUregreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_CUregreso.setText("<");
            l_CUregreso.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            l_CUregreso.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_CUregresoMouseClicked(evt);
                }
            });
            p_CUPassword.add(l_CUregreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, 20, -1));

            l_nombreUsuarioPCU.setBackground(new java.awt.Color(255, 255, 255));
            l_nombreUsuarioPCU.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_nombreUsuarioPCU.setForeground(new java.awt.Color(102, 102, 102));
            l_nombreUsuarioPCU.setText("Nombre Usuario");
            p_CUPassword.add(l_nombreUsuarioPCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

            jLabel39.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
            jLabel39.setForeground(new java.awt.Color(0, 0, 0));
            jLabel39.setText("Enter password");
            p_CUPassword.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

            txtf_CUPassword.setBackground(new java.awt.Color(255, 255, 255));
            txtf_CUPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtf_CUPassword.setForeground(new java.awt.Color(0, 0, 0));
            txtf_CUPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            txtf_CUPassword.setText("Password");
            txtf_CUPassword.setBorder(null);
            txtf_CUPassword.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtf_CUPasswordMouseClicked(evt);
                }
            });
            p_CUPassword.add(txtf_CUPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 360, 30));

            l_forgotP1.setBackground(new java.awt.Color(255, 255, 255));
            l_forgotP1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_forgotP1.setForeground(new java.awt.Color(102, 102, 102));
            l_forgotP1.setText("Enter the password you would like to use with your account.");
            l_forgotP1.setOpaque(true);
            p_CUPassword.add(l_forgotP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
            p_CUPassword.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, 10));

            bt_createAccount.setBackground(new java.awt.Color(51, 110, 200));
            bt_createAccount.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
            bt_createAccount.setForeground(new java.awt.Color(255, 255, 255));
            bt_createAccount.setText("Create Account");
            bt_createAccount.setBorder(null);
            bt_createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    bt_createAccountMouseClicked(evt);
                }
            });
            p_CUPassword.add(bt_createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 120, 30));

            jd_Cuenta.getContentPane().add(p_CUPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            p_CUUserEspecial.setBackground(new java.awt.Color(255, 255, 255));
            p_CUUserEspecial.setMinimumSize(new java.awt.Dimension(450, 600));
            p_CUUserEspecial.setPreferredSize(new java.awt.Dimension(450, 600));
            p_CUUserEspecial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel10.setBackground(new java.awt.Color(225, 225, 225));
            jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_cerrarJDC3.setBackground(new java.awt.Color(225, 225, 225));
            l_cerrarJDC3.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
            l_cerrarJDC3.setForeground(new java.awt.Color(0, 0, 0));
            l_cerrarJDC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_cerrarJDC3.setText("X");
            l_cerrarJDC3.setOpaque(true);
            l_cerrarJDC3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC3MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC3MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_cerrarJDC3MouseExited(evt);
                }
            });
            jPanel10.add(l_cerrarJDC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

            p_CUUserEspecial.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

            jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft-Logo-PNG(2).png"))); // NOI18N
            p_CUUserEspecial.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 40));

            jLabel41.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
            jLabel41.setForeground(new java.awt.Color(0, 0, 0));
            jLabel41.setText("Create Especial Account");
            p_CUUserEspecial.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

            txtf_CUUserEspecial.setBackground(new java.awt.Color(255, 255, 255));
            txtf_CUUserEspecial.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtf_CUUserEspecial.setForeground(new java.awt.Color(0, 0, 0));
            txtf_CUUserEspecial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            txtf_CUUserEspecial.setText("User Name");
            txtf_CUUserEspecial.setBorder(null);
            txtf_CUUserEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtf_CUUserEspecialMouseClicked(evt);
                }
            });
            p_CUUserEspecial.add(txtf_CUUserEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 30));

            l_returnCU.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_returnCU.setForeground(new java.awt.Color(0, 51, 255));
            l_returnCU.setText("Return!");
            l_returnCU.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_returnCUMouseEntered(evt);
                }
            });
            p_CUUserEspecial.add(l_returnCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
            p_CUUserEspecial.add(js_SIuser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 10));

            bt_CUnextEspecial.setBackground(new java.awt.Color(51, 110, 200));
            bt_CUnextEspecial.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
            bt_CUnextEspecial.setForeground(new java.awt.Color(255, 255, 255));
            bt_CUnextEspecial.setText("Next");
            bt_CUnextEspecial.setBorder(null);
            bt_CUnextEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    bt_CUnextEspecialMouseClicked(evt);
                }
            });
            p_CUUserEspecial.add(bt_CUnextEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, 30));

            jLabel42.setBackground(new java.awt.Color(255, 255, 255));
            jLabel42.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel42.setForeground(new java.awt.Color(102, 102, 102));
            jLabel42.setText("©2024 Microsoft");
            p_CUUserEspecial.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

            jLabel43.setBackground(new java.awt.Color(255, 255, 255));
            jLabel43.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            jLabel43.setForeground(new java.awt.Color(102, 102, 102));
            jLabel43.setText("Privacy statement");
            jLabel43.setOpaque(true);
            p_CUUserEspecial.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

            jd_Cuenta.getContentPane().add(p_CUUserEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            p_CUPasswordEspecial.setBackground(new java.awt.Color(255, 255, 255));
            p_CUPasswordEspecial.setMinimumSize(new java.awt.Dimension(450, 600));
            p_CUPasswordEspecial.setPreferredSize(new java.awt.Dimension(450, 600));
            p_CUPasswordEspecial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft-Logo-PNG(2).png"))); // NOI18N
            p_CUPasswordEspecial.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

            l_SIregresoE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            l_SIregresoE.setForeground(new java.awt.Color(102, 102, 102));
            l_SIregresoE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_SIregresoE.setText("<");
            l_SIregresoE.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            l_SIregresoE.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_SIregresoEMouseClicked(evt);
                }
            });
            p_CUPasswordEspecial.add(l_SIregresoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, 20, -1));

            l_nombreUsuarioPE.setBackground(new java.awt.Color(255, 255, 255));
            l_nombreUsuarioPE.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
            l_nombreUsuarioPE.setForeground(new java.awt.Color(102, 102, 102));
            l_nombreUsuarioPE.setText("Nombre Usuario");
            p_CUPasswordEspecial.add(l_nombreUsuarioPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

            jLabel45.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
            jLabel45.setForeground(new java.awt.Color(0, 0, 0));
            jLabel45.setText("Enter Especial Password");
            p_CUPasswordEspecial.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

            txtf_CUPasswordEspecial.setBackground(new java.awt.Color(255, 255, 255));
            txtf_CUPasswordEspecial.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtf_CUPasswordEspecial.setForeground(new java.awt.Color(0, 0, 0));
            txtf_CUPasswordEspecial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            txtf_CUPasswordEspecial.setText("Password");
            txtf_CUPasswordEspecial.setBorder(null);
            txtf_CUPasswordEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtf_CUPasswordEspecialMouseClicked(evt);
                }
            });
            p_CUPasswordEspecial.add(txtf_CUPasswordEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 360, 30));

            l_forgotP2.setBackground(new java.awt.Color(255, 255, 255));
            l_forgotP2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
            l_forgotP2.setForeground(new java.awt.Color(102, 102, 102));
            l_forgotP2.setText("Enter the password you would like to use with your Especial account.");
            l_forgotP2.setOpaque(true);
            p_CUPasswordEspecial.add(l_forgotP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
            p_CUPasswordEspecial.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, 10));

            bt_createAccountEspecial.setBackground(new java.awt.Color(51, 110, 200));
            bt_createAccountEspecial.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
            bt_createAccountEspecial.setForeground(new java.awt.Color(255, 255, 255));
            bt_createAccountEspecial.setText("Create Especial Account");
            bt_createAccountEspecial.setBorder(null);
            bt_createAccountEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    bt_createAccountEspecialMouseClicked(evt);
                }
            });
            p_CUPasswordEspecial.add(bt_createAccountEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, 30));

            jd_Cuenta.getContentPane().add(p_CUPasswordEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            p_inicio.setMinimumSize(new java.awt.Dimension(1280, 720));
            p_inicio.setPreferredSize(new java.awt.Dimension(1280, 720));
            p_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            p_headerCierre.setBackground(new java.awt.Color(61, 63, 65));
            p_headerCierre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    p_headerCierreMouseDragged(evt);
                }
            });
            p_headerCierre.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    p_headerCierreMousePressed(evt);
                }
            });
            p_headerCierre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft_Office_Access (2).png"))); // NOI18N
            jLabel1.setText("Access");
            jLabel1.setIconTextGap(21);
            p_headerCierre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

            l_Cuenta.setBackground(new java.awt.Color(61, 63, 65));
            l_Cuenta.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_Cuenta.setForeground(new java.awt.Color(255, 255, 255));
            l_Cuenta.setText("Cuenta");
            l_Cuenta.setOpaque(true);
            l_Cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_CuentaMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_CuentaMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_CuentaMouseExited(evt);
                }
            });
            p_headerCierre.add(l_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 130, 56));

            l_exit.setBackground(new java.awt.Color(61, 63, 65));
            l_exit.setFont(new java.awt.Font("Roboto Thin", 0, 30)); // NOI18N
            l_exit.setForeground(new java.awt.Color(255, 255, 255));
            l_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_exit.setText("X");
            l_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_exit.setOpaque(true);
            l_exit.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_exitMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_exitMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_exitMouseExited(evt);
                }
            });
            p_headerCierre.add(l_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, -4, 60, 60));

            l_improve.setBackground(new java.awt.Color(61, 63, 65));
            l_improve.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_improve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_improve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bubble speech (2).png"))); // NOI18N
            l_improve.setOpaque(true);
            l_improve.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_improveMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_improveMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_improveMouseExited(evt);
                }
            });
            p_headerCierre.add(l_improve, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, -4, 60, 60));

            l_ayuda.setBackground(new java.awt.Color(61, 63, 65));
            l_ayuda.setFont(new java.awt.Font("Roboto Thin", 0, 30)); // NOI18N
            l_ayuda.setForeground(new java.awt.Color(255, 255, 255));
            l_ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_ayuda.setText("?");
            l_ayuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_ayuda.setOpaque(true);
            l_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_ayudaMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_ayudaMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_ayudaMouseExited(evt);
                }
            });
            p_headerCierre.add(l_ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, -4, 60, 60));

            l_ocultar.setBackground(new java.awt.Color(61, 63, 65));
            l_ocultar.setFont(new java.awt.Font("Roboto Thin", 0, 30)); // NOI18N
            l_ocultar.setForeground(new java.awt.Color(255, 255, 255));
            l_ocultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_ocultar.setText("-");
            l_ocultar.setOpaque(true);
            l_ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_ocultarMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_ocultarMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_ocultarMouseExited(evt);
                }
            });
            p_headerCierre.add(l_ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, -4, 60, 60));

            l_minimize.setBackground(new java.awt.Color(61, 63, 65));
            l_minimize.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize-icon-25x25 white(3).png"))); // NOI18N
            l_minimize.setOpaque(true);
            l_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_minimizeMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_minimizeMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_minimizeMouseExited(evt);
                }
            });
            p_headerCierre.add(l_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1159, -4, 60, 60));

            p_inicio.add(p_headerCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 56));

            p_ladoIzq.setBackground(new java.awt.Color(61, 63, 65));
            p_ladoIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_home.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            l_home.setForeground(new java.awt.Color(255, 255, 255));
            l_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/house png (2).png"))); // NOI18N
            l_home.setText("Home");
            l_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_home.setInheritsPopupMenu(false);
            l_home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            l_home.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_homeMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_homeMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_homeMouseExited(evt);
                }
            });
            p_ladoIzq.add(l_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 180, 110));

            l_new.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            l_new.setForeground(new java.awt.Color(255, 255, 255));
            l_new.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new paper (2).png"))); // NOI18N
            l_new.setText("New");
            l_new.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_new.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            l_new.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_newMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_newMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_newMouseExited(evt);
                }
            });
            p_ladoIzq.add(l_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, 180, 110));

            l_open.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            l_open.setForeground(new java.awt.Color(255, 255, 255));
            l_open.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flat-folder-icon (2).png"))); // NOI18N
            l_open.setText("Open");
            l_open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            l_open.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_openMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_openMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_openMouseExited(evt);
                }
            });
            p_ladoIzq.add(l_open, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 180, 110));

            jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
            p_ladoIzq.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 513, 160, 20));

            l_options.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_options.setForeground(new java.awt.Color(255, 255, 255));
            l_options.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_options.setText("Options");
            l_options.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_optionsMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_optionsMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_optionsMouseExited(evt);
                }
            });
            p_ladoIzq.add(l_options, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 180, 40));

            l_account.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_account.setForeground(new java.awt.Color(255, 255, 255));
            l_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_account.setText("Account");
            l_account.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_accountMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_accountMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_accountMouseExited(evt);
                }
            });
            p_ladoIzq.add(l_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 536, 180, 40));

            l_feedback.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_feedback.setForeground(new java.awt.Color(255, 255, 255));
            l_feedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_feedback.setText("Feedback");
            l_feedback.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_feedbackMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_feedbackMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_feedbackMouseExited(evt);
                }
            });
            p_ladoIzq.add(l_feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 180, 40));

            js_account.setForeground(new java.awt.Color(204, 204, 204));
            js_account.setOrientation(javax.swing.SwingConstants.VERTICAL);
            p_ladoIzq.add(js_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 535, 20, 40));

            js_feedback.setForeground(new java.awt.Color(204, 204, 204));
            js_feedback.setOrientation(javax.swing.SwingConstants.VERTICAL);
            p_ladoIzq.add(js_feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 577, 20, 40));

            js_options.setForeground(new java.awt.Color(204, 204, 204));
            js_options.setOrientation(javax.swing.SwingConstants.VERTICAL);
            p_ladoIzq.add(js_options, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 620, 20, 40));

            js_home.setForeground(new java.awt.Color(204, 204, 204));
            js_home.setOrientation(javax.swing.SwingConstants.VERTICAL);
            p_ladoIzq.add(js_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 90, 100));

            js_new.setForeground(new java.awt.Color(204, 204, 204));
            js_new.setOrientation(javax.swing.SwingConstants.VERTICAL);
            p_ladoIzq.add(js_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 166, 90, 100));

            js_open.setForeground(new java.awt.Color(204, 204, 204));
            js_open.setOrientation(javax.swing.SwingConstants.VERTICAL);
            p_ladoIzq.add(js_open, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 277, 90, 100));

            p_inicio.add(p_ladoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 670));

            p_menu.setBackground(new java.awt.Color(82, 82, 82));
            p_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            bt_new.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            bt_new.setForeground(new java.awt.Color(255, 255, 255));
            bt_new.setText("V");
            bt_new.setBorder(null);
            bt_new.setBorderPainted(false);
            bt_new.setContentAreaFilled(false);
            bt_new.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            p_menu.add(bt_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

            jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(255, 255, 255));
            jLabel9.setText("New");
            p_menu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 101, -1, -1));

            p_new.setBackground(new java.awt.Color(82, 82, 82));

            jLabel10.setBackground(new java.awt.Color(82, 82, 82));
            jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 13)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(255, 255, 255));
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blankdatabase (2).png"))); // NOI18N
            jLabel10.setText("Blank Database");
            jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel10.setOpaque(true);
            jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel10MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel10MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel10MouseExited(evt);
                }
            });

            javax.swing.GroupLayout p_newLayout = new javax.swing.GroupLayout(p_new);
            p_new.setLayout(p_newLayout);
            p_newLayout.setHorizontalGroup(
                p_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_newLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(760, Short.MAX_VALUE))
            );
            p_newLayout.setVerticalGroup(
                p_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_newLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addContainerGap())
            );

            p_menu.add(p_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 990, 130));

            jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
            p_menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 253, 1010, 10));

            txtf_search.setBackground(new java.awt.Color(189, 189, 189));
            txtf_search.setFont(new java.awt.Font("Calibri Light", 1, 17)); // NOI18N
            txtf_search.setForeground(new java.awt.Color(66, 66, 66));
            txtf_search.setText("Search");
            txtf_search.setToolTipText("");
            txtf_search.setBorder(null);
            txtf_search.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    txtf_searchMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    txtf_searchMouseExited(evt);
                }
            });
            p_menu.add(txtf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 370, 30));

            p_searchIcon.setBackground(new java.awt.Color(188, 188, 188));
            p_searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    p_searchIconMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    p_searchIconMouseExited(evt);
                }
            });

            jLabel11.setBackground(new java.awt.Color(188, 188, 188));
            jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Magnifying_Glass (4).png"))); // NOI18N
            jLabel11.setOpaque(true);

            javax.swing.GroupLayout p_searchIconLayout = new javax.swing.GroupLayout(p_searchIcon);
            p_searchIcon.setLayout(p_searchIconLayout);
            p_searchIconLayout.setHorizontalGroup(
                p_searchIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_searchIconLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15))
            );
            p_searchIconLayout.setVerticalGroup(
                p_searchIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_searchIconLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            p_menu.add(p_searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 70, 30));

            p_search.setBackground(new java.awt.Color(82, 82, 82));
            p_search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_recent.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_recent.setForeground(new java.awt.Color(255, 255, 255));
            l_recent.setText("Recent");
            p_search.add(l_recent, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, 50, -1));

            l_pin.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_pin.setForeground(new java.awt.Color(255, 255, 255));
            l_pin.setText("Pin");
            p_search.add(l_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 19, 60, -1));

            js_pin.setForeground(new java.awt.Color(229, 139, 150));
            p_search.add(js_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 40, 50, 20));

            js_recent.setForeground(new java.awt.Color(229, 139, 150));
            p_search.add(js_recent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 20));

            p_menu.add(p_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 1010, 390));

            p_inicio.add(p_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

            panel_new.setBackground(new java.awt.Color(82, 82, 82));
            panel_new.setMinimumSize(new java.awt.Dimension(1280, 720));
            panel_new.setPreferredSize(new java.awt.Dimension(1280, 720));
            panel_new.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            p_newN.setBackground(new java.awt.Color(82, 82, 82));

            jLabel12.setBackground(new java.awt.Color(82, 82, 82));
            jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 13)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(255, 255, 255));
            jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blankdatabase (3).png"))); // NOI18N
            jLabel12.setText("Blank Database");
            jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel12.setOpaque(true);
            jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel12MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel12MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel12MouseExited(evt);
                }
            });

            javax.swing.GroupLayout p_newNLayout = new javax.swing.GroupLayout(p_newN);
            p_newN.setLayout(p_newNLayout);
            p_newNLayout.setHorizontalGroup(
                p_newNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_newNLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(760, Short.MAX_VALUE))
            );
            p_newNLayout.setVerticalGroup(
                p_newNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_newNLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addContainerGap())
            );

            panel_new.add(p_newN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 990, 250));

            jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
            panel_new.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 1010, 10));

            jLabel13.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(255, 255, 255));
            jLabel13.setText("New");
            panel_new.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

            p_inicio.add(panel_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

            panel_open.setBackground(new java.awt.Color(82, 82, 82));
            panel_open.setMinimumSize(new java.awt.Dimension(1280, 720));
            panel_open.setPreferredSize(new java.awt.Dimension(1280, 720));
            panel_open.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            txtf_search1.setBackground(new java.awt.Color(189, 189, 189));
            txtf_search1.setFont(new java.awt.Font("Calibri Light", 1, 17)); // NOI18N
            txtf_search1.setForeground(new java.awt.Color(66, 66, 66));
            txtf_search1.setText("Search");
            txtf_search1.setToolTipText("");
            txtf_search1.setBorder(null);
            txtf_search1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    txtf_search1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    txtf_search1MouseExited(evt);
                }
            });
            panel_open.add(txtf_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 370, 30));

            p_searchIcon1.setBackground(new java.awt.Color(188, 188, 188));
            p_searchIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    p_searchIcon1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    p_searchIcon1MouseExited(evt);
                }
            });

            jLabel16.setBackground(new java.awt.Color(188, 188, 188));
            jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Magnifying_Glass (4).png"))); // NOI18N
            jLabel16.setOpaque(true);

            javax.swing.GroupLayout p_searchIcon1Layout = new javax.swing.GroupLayout(p_searchIcon1);
            p_searchIcon1.setLayout(p_searchIcon1Layout);
            p_searchIcon1Layout.setHorizontalGroup(
                p_searchIcon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_searchIcon1Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15))
            );
            p_searchIcon1Layout.setVerticalGroup(
                p_searchIcon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_searchIcon1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel16)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            panel_open.add(p_searchIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 70, 30));

            p_searchO.setBackground(new java.awt.Color(82, 82, 82));
            p_searchO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            l_recent1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_recent1.setForeground(new java.awt.Color(255, 255, 255));
            l_recent1.setText("Recent");
            p_searchO.add(l_recent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, 50, -1));

            l_pin1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
            l_pin1.setForeground(new java.awt.Color(255, 255, 255));
            l_pin1.setText("Pin");
            p_searchO.add(l_pin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 19, 60, -1));

            js_pin1.setForeground(new java.awt.Color(229, 139, 150));
            p_searchO.add(js_pin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 40, 50, 20));

            js_recent1.setForeground(new java.awt.Color(229, 139, 150));
            p_searchO.add(js_recent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 20));

            panel_open.add(p_searchO, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 570, 510));

            jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
            panel_open.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 350, 10));

            jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
            jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
            panel_open.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 20, 550));

            p_inicio.add(panel_open, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

            p_account.setBackground(new java.awt.Color(82, 82, 82));
            p_account.setMinimumSize(new java.awt.Dimension(1280, 720));
            p_account.setPreferredSize(new java.awt.Dimension(1280, 720));
            p_account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            p_inicio.add(p_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

            p_feedback.setBackground(new java.awt.Color(82, 82, 82));
            p_feedback.setMinimumSize(new java.awt.Dimension(1280, 720));
            p_feedback.setPreferredSize(new java.awt.Dimension(1280, 720));
            p_feedback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            p_inicio.add(p_feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

            getContentPane().add(p_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            p_Pagina.setMinimumSize(new java.awt.Dimension(1280, 720));
            p_Pagina.setPreferredSize(new java.awt.Dimension(1280, 720));
            p_Pagina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            p_headerCierre1.setBackground(new java.awt.Color(61, 63, 65));
            p_headerCierre1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    p_headerCierre1MouseDragged(evt);
                }
            });
            p_headerCierre1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    p_headerCierre1MousePressed(evt);
                }
            });
            p_headerCierre1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Microsoft_Office_Access (2).png"))); // NOI18N
            jLabel5.setText("Access");
            jLabel5.setIconTextGap(21);
            p_headerCierre1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

            l_Cuenta2.setBackground(new java.awt.Color(61, 63, 65));
            l_Cuenta2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_Cuenta2.setForeground(new java.awt.Color(255, 255, 255));
            l_Cuenta2.setText("Cuenta");
            l_Cuenta2.setOpaque(true);
            l_Cuenta2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_Cuenta2MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_Cuenta2MouseExited(evt);
                }
            });
            p_headerCierre1.add(l_Cuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 130, 56));

            l_exit1.setBackground(new java.awt.Color(61, 63, 65));
            l_exit1.setFont(new java.awt.Font("Roboto Thin", 0, 30)); // NOI18N
            l_exit1.setForeground(new java.awt.Color(255, 255, 255));
            l_exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_exit1.setText("X");
            l_exit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_exit1.setOpaque(true);
            l_exit1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_exit1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_exit1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_exit1MouseExited(evt);
                }
            });
            p_headerCierre1.add(l_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, -4, 60, 60));

            l_improve1.setBackground(new java.awt.Color(61, 63, 65));
            l_improve1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_improve1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_improve1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bubble speech (2).png"))); // NOI18N
            l_improve1.setOpaque(true);
            l_improve1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_improve1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_improve1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_improve1MouseExited(evt);
                }
            });
            p_headerCierre1.add(l_improve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, -4, 60, 60));

            l_ayuda1.setBackground(new java.awt.Color(61, 63, 65));
            l_ayuda1.setFont(new java.awt.Font("Roboto Thin", 0, 30)); // NOI18N
            l_ayuda1.setForeground(new java.awt.Color(255, 255, 255));
            l_ayuda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_ayuda1.setText("?");
            l_ayuda1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            l_ayuda1.setOpaque(true);
            l_ayuda1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_ayuda1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_ayuda1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_ayuda1MouseExited(evt);
                }
            });
            p_headerCierre1.add(l_ayuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, -4, 60, 60));

            l_ocultar1.setBackground(new java.awt.Color(61, 63, 65));
            l_ocultar1.setFont(new java.awt.Font("Roboto Thin", 0, 30)); // NOI18N
            l_ocultar1.setForeground(new java.awt.Color(255, 255, 255));
            l_ocultar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_ocultar1.setText("-");
            l_ocultar1.setOpaque(true);
            l_ocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_ocultar1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_ocultar1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_ocultar1MouseExited(evt);
                }
            });
            p_headerCierre1.add(l_ocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, -4, 60, 60));

            l_minimize1.setBackground(new java.awt.Color(61, 63, 65));
            l_minimize1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
            l_minimize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l_minimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize-icon-25x25 white(3).png"))); // NOI18N
            l_minimize1.setOpaque(true);
            l_minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    l_minimize1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    l_minimize1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    l_minimize1MouseExited(evt);
                }
            });
            p_headerCierre1.add(l_minimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1159, -4, 60, 60));

            p_Pagina.add(p_headerCierre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 56));

            jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jtr_baseDatos.setBackground(new java.awt.Color(255, 255, 255));
            jtr_baseDatos.setForeground(new java.awt.Color(0, 0, 0));
            jtr_baseDatos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jtr_baseDatosMouseClicked(evt);
                }
            });
            jScrollPane2.setViewportView(jtr_baseDatos);

            jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 510));

            p_Pagina.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 540));

            jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            p_Pagina.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 120));

            jt_table.setBackground(new java.awt.Color(255, 255, 255));
            jt_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                    "ID", "", "", "", "", "", "", "", "", "", "", ""
                }
            ));
            jScrollPane1.setViewportView(jt_table);

            p_Pagina.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 1070, 540));

            getContentPane().add(p_Pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        Color rgb = new Color(82,90,90);
        jLabel10.setBackground(rgb);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        Color rgb = new Color(82,82,82);
        jLabel10.setBackground(rgb);
    }//GEN-LAST:event_jLabel10MouseExited

    private void p_headerCierreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_headerCierreMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_p_headerCierreMousePressed

    private void p_headerCierreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_headerCierreMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_p_headerCierreMouseDragged

    private void l_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseEntered
        l_exit.setBackground(Color.red);
    }//GEN-LAST:event_l_exitMouseEntered

    private void l_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseExited
        Color rgb = new Color(61,63,65);
        l_exit.setBackground(rgb);
    }//GEN-LAST:event_l_exitMouseExited

    private void l_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_l_exitMouseClicked

    private void l_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_homeMouseEntered
        if (p_menu.isVisible()) {
            js_home.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_home.setForeground(Color.white);
            js_home.setForeground(rgb);
        } else {
            js_home.setVisible(true);
            l_home.setForeground(Color.WHITE);
            js_home.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_l_homeMouseEntered

    private void l_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_homeMouseExited
        Color rgb = new Color(229, 139, 150);
        if (p_menu.isVisible()) {
            
            js_home.setVisible(true);
            js_home.setForeground(rgb);
            l_home.setForeground(rgb);
        } else {
            js_home.setVisible(false);
            js_home.setForeground(Color.white);
            l_home.setForeground(Color.white);
        }
    }//GEN-LAST:event_l_homeMouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        Color rgb = new Color(82,90,90);
        jLabel12.setBackground(rgb);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        Color rgb = new Color(82,82,82);
        jLabel12.setBackground(rgb);
    }//GEN-LAST:event_jLabel12MouseExited

    private void l_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_newMouseClicked
        panel_new.setVisible(true);
        p_menu.setVisible(false);
        panel_open.setVisible(false);
        Color rgb = new Color(229, 139, 150);
        l_new.setForeground(rgb);
        js_new.setVisible(true);
        js_home.setVisible(false);
        js_open.setVisible(false);
        js_new.setForeground(rgb);
        js_home.setForeground(Color.WHITE);
        js_open.setForeground(Color.WHITE);
        js_account.setVisible(false);
        js_feedback.setVisible(false);
        js_options.setVisible(false);
    }//GEN-LAST:event_l_newMouseClicked

    private void l_openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_openMouseClicked
        panel_open.setVisible(true);
        p_menu.setVisible(false);
        panel_new.setVisible(false);
        Color rgb = new Color(229, 139, 150);
        l_open.setForeground(rgb);
        js_open.setVisible(true);
        js_home.setVisible(false);
        js_new.setVisible(false);
        js_open.setForeground(rgb);
        js_home.setForeground(Color.WHITE);
        js_new.setForeground(Color.WHITE);
        js_account.setVisible(false);
        js_feedback.setVisible(false);
        js_options.setVisible(false);
    }//GEN-LAST:event_l_openMouseClicked

    private void l_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_homeMouseClicked
        p_menu.setVisible(true);
        panel_new.setVisible(false);
        panel_open.setVisible(false);
        Color rgb = new Color(229, 139, 150);
        l_home.setForeground(rgb);
        js_home.setVisible(true);
        js_new.setVisible(false);
        js_open.setVisible(false);
        js_home.setForeground(rgb);
        js_new.setForeground(Color.WHITE);
        js_open.setForeground(Color.WHITE);
        js_account.setVisible(false);
        js_feedback.setVisible(false);
        js_options.setVisible(false);
        
    }//GEN-LAST:event_l_homeMouseClicked

    private void l_newMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_newMouseEntered
        Color rgb = new Color(229, 139, 150);
        l_new.setForeground(Color.white);
        js_new.setVisible(true);
        js_new.setForeground(rgb);
    }//GEN-LAST:event_l_newMouseEntered

    private void l_newMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_newMouseExited
        if (panel_new.isVisible()) {
            js_new.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_new.setForeground(rgb);
            js_new.setForeground(rgb);
        } else {
            l_new.setForeground(Color.WHITE);
            js_new.setVisible(false);
            js_new.setForeground(Color.WHITE);

        }
    }//GEN-LAST:event_l_newMouseExited

    private void l_openMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_openMouseEntered
        Color rgb = new Color(229, 139, 150);
        l_open.setForeground(Color.white);
        js_open.setVisible(true);
        js_open.setForeground(rgb);
    }//GEN-LAST:event_l_openMouseEntered

    private void l_openMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_openMouseExited
        if (panel_open.isVisible()) {
            js_open.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_open.setForeground(rgb);
            js_open.setForeground(rgb);
        }else{
        l_open.setForeground(Color.white);
        js_open.setVisible(false);
        js_open.setForeground(Color.white);
            
        }    }//GEN-LAST:event_l_openMouseExited

    private void l_accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_accountMouseEntered
        if (p_account.isVisible()) {
            js_account.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_account.setForeground(Color.white);
            js_account.setForeground(rgb);
        } else {
            js_account.setVisible(true);
            l_account.setForeground(Color.WHITE);
            js_account.setForeground(Color.WHITE);
        }        
    }//GEN-LAST:event_l_accountMouseEntered

    private void l_accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_accountMouseExited
        if (p_account.isVisible()) {
            js_account.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_account.setForeground(rgb);
            js_account.setForeground(rgb);
        }else{
            l_account.setForeground(Color.white);
            js_account.setVisible(false);
            js_account.setForeground(Color.white);
        }
    }//GEN-LAST:event_l_accountMouseExited

    private void l_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_accountMouseClicked
        js_account.setVisible(true);
        Color rgb = new Color(229, 139, 150);
        js_account.setForeground(rgb);
        l_account.setForeground(rgb);
        js_home.setVisible(false);
        js_feedback.setVisible(false);
        js_new.setVisible(false);
        js_open.setVisible(false);
        js_options.setVisible(false);
        js_pin.setVisible(false);
        js_pin1.setVisible(false);
        js_recent.setVisible(false);
        js_recent1.setVisible(false);
        
        p_account.setVisible(true);
        p_menu.setVisible(false);
        panel_new.setVisible(false);
        panel_open.setVisible(false);
        p_feedback.setVisible(false);
        
    }//GEN-LAST:event_l_accountMouseClicked

    private void l_feedbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_feedbackMouseEntered
        if (p_feedback.isVisible()) {
            js_feedback.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_feedback.setForeground(Color.white);
            js_feedback.setForeground(rgb);
        } else {
            js_feedback.setVisible(true);
            l_feedback.setForeground(Color.WHITE);
            js_feedback.setForeground(Color.WHITE);
        }        
    }//GEN-LAST:event_l_feedbackMouseEntered

    private void l_feedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_feedbackMouseExited
        if (p_feedback.isVisible()) {
            js_feedback.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_feedback.setForeground(rgb);
            js_feedback.setForeground(rgb);
        }else{
            l_feedback.setForeground(Color.white);
            js_feedback.setVisible(false);
            js_feedback.setForeground(Color.white);
        }
    }//GEN-LAST:event_l_feedbackMouseExited

    private void l_feedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_feedbackMouseClicked
        js_feedback.setVisible(true);
        Color rgb = new Color(229, 139, 150);
        js_feedback.setForeground(rgb);
        l_feedback.setForeground(rgb);
        js_home.setVisible(false);
        js_account.setVisible(false);
        js_new.setVisible(false);
        js_open.setVisible(false);
        js_options.setVisible(false);
        js_pin.setVisible(false);
        js_pin1.setVisible(false);
        js_recent.setVisible(false);
        js_recent1.setVisible(false);
        
        p_feedback.setVisible(true);
        p_menu.setVisible(false);
        panel_new.setVisible(false);
        panel_open.setVisible(false);
        p_account.setVisible(false);
        
    }//GEN-LAST:event_l_feedbackMouseClicked

    private void l_optionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_optionsMouseEntered
        if (p_menu.isVisible()) {
            js_options.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_options.setForeground(Color.white);
            js_options.setForeground(rgb);
        } else {
            js_options.setVisible(true);
            l_options.setForeground(Color.WHITE);
            js_options.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_l_optionsMouseEntered

    private void l_optionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_optionsMouseExited
        if (p_feedback.isVisible()) {
            js_options.setVisible(true);
            Color rgb = new Color(229, 139, 150);
            l_options.setForeground(rgb);
            js_options.setForeground(rgb);
        }else{
            l_options.setForeground(Color.white);
            js_options.setVisible(false);
            js_options.setForeground(Color.white);
        }
    }//GEN-LAST:event_l_optionsMouseExited

    private void l_optionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_optionsMouseClicked
        jd_options.setVisible(true);
        jd_options.pack();
        js_options.setVisible(true);
        Color rgb = new Color(229, 139, 150);
        js_options.setForeground(rgb);        
    }//GEN-LAST:event_l_optionsMouseClicked

    private void l_generalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_generalMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_general.setBackground(rgb);
        Color bl = new Color(0,0,0);
        l_general.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_l_generalMouseEntered

    private void l_currentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_currentMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_current.setBackground(rgb);
        l_current.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                
    }//GEN-LAST:event_l_currentMouseEntered

    private void l_datasheetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_datasheetMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_datasheet.setBackground(rgb);
        l_datasheet.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_datasheetMouseEntered

    private void l_objectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_objectMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_object.setBackground(rgb);
        l_object.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_objectMouseEntered

    private void l_proofingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_proofingMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_proofing.setBackground(rgb);
        l_proofing.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_proofingMouseEntered

    private void l_languageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_languageMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_language.setBackground(rgb);
        l_language.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_languageMouseEntered

    private void l_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_clientMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_client.setBackground(rgb);
        l_client.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_clientMouseEntered

    private void l_customizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_customizeMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_customize.setBackground(rgb);
        l_customize.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_customizeMouseEntered

    private void l_quickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_quickMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_quick.setBackground(rgb);
        l_quick.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_quickMouseEntered

    private void l_addinsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_addinsMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_addins.setBackground(rgb);
        l_addins.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_addinsMouseEntered

    private void l_trustMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_trustMouseEntered
        Color rgb = new Color(190, 180, 170);
        l_trust.setBackground(rgb);
        l_trust.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
            }//GEN-LAST:event_l_trustMouseEntered

    private void l_generalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_generalMouseExited
        Color rgb = new Color(189, 189, 189);
        l_general.setBackground(rgb);
        l_general.setBorder(null);
            }//GEN-LAST:event_l_generalMouseExited

    private void l_currentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_currentMouseExited
        Color rgb = new Color(189, 189, 189);
        l_current.setBackground(rgb);
        l_current.setBorder(null);

    }//GEN-LAST:event_l_currentMouseExited

    private void l_datasheetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_datasheetMouseExited
        Color rgb = new Color(189, 189, 189);
        l_datasheet.setBackground(rgb);
        l_datasheet.setBorder(null);
    }//GEN-LAST:event_l_datasheetMouseExited

    private void l_objectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_objectMouseExited
        Color rgb = new Color(189, 189, 189);
        l_object.setBackground(rgb);
        l_object.setBorder(null);
    }//GEN-LAST:event_l_objectMouseExited

    private void l_proofingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_proofingMouseExited
        Color rgb = new Color(189, 189, 189);
        l_proofing.setBackground(rgb);
        l_proofing.setBorder(null);
    }//GEN-LAST:event_l_proofingMouseExited

    private void l_languageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_languageMouseExited
        Color rgb = new Color(189, 189, 189);
        l_language.setBackground(rgb);
        l_language.setBorder(null);
    }//GEN-LAST:event_l_languageMouseExited

    private void l_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_clientMouseExited
        Color rgb = new Color(189, 189, 189);
        l_client.setBackground(rgb);
        l_client.setBorder(null);
    }//GEN-LAST:event_l_clientMouseExited

    private void l_customizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_customizeMouseExited
        Color rgb = new Color(189, 189, 189);
        l_customize.setBackground(rgb);
        l_customize.setBorder(null);
    }//GEN-LAST:event_l_customizeMouseExited

    private void l_quickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_quickMouseExited
        Color rgb = new Color(189, 189, 189);
        l_quick.setBackground(rgb);
        l_quick.setBorder(null);
    }//GEN-LAST:event_l_quickMouseExited

    private void l_addinsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_addinsMouseExited
        Color rgb = new Color(189, 189, 189);
        l_addins.setBackground(rgb);
        l_addins.setBorder(null);
    }//GEN-LAST:event_l_addinsMouseExited

    private void l_trustMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_trustMouseExited
        Color rgb = new Color(189, 189, 189);
        l_trust.setBackground(rgb);
        l_trust.setBorder(null);
    }//GEN-LAST:event_l_trustMouseExited

    private void l_exitOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitOMouseEntered
        l_exitO.setBackground(Color.red);
    }//GEN-LAST:event_l_exitOMouseEntered

    private void l_exitOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitOMouseExited
        Color rgb = new Color(82,82,82);
        l_exitO.setBackground(rgb);
    }//GEN-LAST:event_l_exitOMouseExited

    private void l_exitOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exitOMouseClicked
        jd_options.setVisible(false);
    }//GEN-LAST:event_l_exitOMouseClicked

    private void l_ayudaOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayudaOMouseEntered
        Color rgb = new Color(82, 90, 90);
        l_ayudaO.setBackground(rgb);
    }//GEN-LAST:event_l_ayudaOMouseEntered

    private void l_ayudaOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayudaOMouseExited
        Color rgb = new Color(82, 82, 82);
        l_ayudaO.setBackground(rgb);
    }//GEN-LAST:event_l_ayudaOMouseExited

    private void l_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_minimizeMouseEntered
        Color rgb = new Color(82, 90, 90);
        l_minimize.setBackground(rgb);
    }//GEN-LAST:event_l_minimizeMouseEntered

    private void l_ocultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ocultarMouseEntered
        Color rgb = new Color(82, 90, 90);
        l_ocultar.setBackground(rgb);
    }//GEN-LAST:event_l_ocultarMouseEntered

    private void l_ayudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayudaMouseEntered
        Color rgb = new Color(82, 90, 90);
        l_ayuda.setBackground(rgb);
    }//GEN-LAST:event_l_ayudaMouseEntered

    private void l_improveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_improveMouseEntered
        Color rgb = new Color(82, 90, 90);
        l_improve.setBackground(rgb);
    }//GEN-LAST:event_l_improveMouseEntered

    private void l_CuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_CuentaMouseEntered
        Color rgb = new Color(82, 90, 90);
        l_Cuenta.setBackground(rgb);
    }//GEN-LAST:event_l_CuentaMouseEntered

    private void l_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_minimizeMouseExited
        Color rgb = new Color(61, 63, 65);
        l_minimize.setBackground(rgb);
    }//GEN-LAST:event_l_minimizeMouseExited

    private void l_ocultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ocultarMouseExited
        Color rgb = new Color(61, 63, 65);
        l_ocultar.setBackground(rgb);
    }//GEN-LAST:event_l_ocultarMouseExited

    private void l_ayudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayudaMouseExited
        Color rgb = new Color(61, 63, 65);
        l_ayuda.setBackground(rgb);
    }//GEN-LAST:event_l_ayudaMouseExited

    private void l_improveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_improveMouseExited
        Color rgb = new Color(61, 63, 65);
        l_improve.setBackground(rgb);
    }//GEN-LAST:event_l_improveMouseExited

    private void l_CuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_CuentaMouseExited
        Color rgb = new Color(61, 63, 65);
        l_Cuenta.setBackground(rgb);
    }//GEN-LAST:event_l_CuentaMouseExited

    private void txtf_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_searchMouseEntered
        Color rgb = new Color(189,189,189);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_txtf_searchMouseEntered

    private void txtf_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_searchMouseExited
        Color rgb = new Color(188,188,188);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_txtf_searchMouseExited

    private void p_searchIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_searchIconMouseEntered
        Color rgb = new Color(189,189,189);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_p_searchIconMouseEntered

    private void p_searchIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_searchIconMouseExited
        Color rgb = new Color(188,188,188);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_p_searchIconMouseExited

    private void txtf_search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_search1MouseEntered
        Color rgb = new Color(189,189,189);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_txtf_search1MouseEntered

    private void txtf_search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_search1MouseExited
        Color rgb = new Color(188,188,188);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_txtf_search1MouseExited

    private void p_searchIcon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_searchIcon1MouseEntered
        Color rgb = new Color(189,189,189);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_p_searchIcon1MouseEntered

    private void p_searchIcon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_searchIcon1MouseExited
        Color rgb = new Color(188,188,188);
        txtf_search.setBackground(rgb);
        p_searchIcon.setBackground(rgb);
    }//GEN-LAST:event_p_searchIcon1MouseExited

    private void l_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayudaMouseClicked
        JOptionPane.showMessageDialog(this, "Ya te he ayudado hermano \n\n"
                                                        + "te he salvado de sufrir en el sufrimiento enterno\n"
                                                        + "de las llamas del mal :0 ");
    }//GEN-LAST:event_l_ayudaMouseClicked

    private void l_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_minimizeMouseClicked
        if (evt.getButton() == 1) {
            int maxMin = getExtendedState();
            if ((maxMin & JFrame.MAXIMIZED_BOTH) == 0) {
                setExtendedState(maxMin | JFrame.MAXIMIZED_BOTH);
            }else{
                setExtendedState(maxMin & ~JFrame.MAXIMIZED_BOTH);
            }
        }
    }//GEN-LAST:event_l_minimizeMouseClicked

    private void l_ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ocultarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_l_ocultarMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jd_crearBlank.setVisible(true);
        jd_crearBlank.pack();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void l_buttonCrearPaginaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_buttonCrearPaginaMouseEntered
        Color rgb = new Color(164,6,24);
        l_buttonCrearPagina.setBackground(rgb);
        l_buttonCrearPagina.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
    }//GEN-LAST:event_l_buttonCrearPaginaMouseEntered

    private void l_buttonCrearPaginaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_buttonCrearPaginaMouseExited
        Color rgb = new Color(164,55,58);
        Color rgbB = new Color(164,101,96);
        l_buttonCrearPagina.setBackground(rgb);
        l_buttonCrearPagina.setBorder(BorderFactory.createLineBorder(rgbB, 1));
    }//GEN-LAST:event_l_buttonCrearPaginaMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jd_crearBlank.setVisible(true);
        jd_crearBlank.pack();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void l_buttonCrearPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_buttonCrearPaginaMouseClicked
        p_Pagina.setVisible(true);
        jd_crearBlank.setVisible(false);
        p_inicio.setVisible(false);
    }//GEN-LAST:event_l_buttonCrearPaginaMouseClicked

    private void l_Cuenta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_Cuenta2MouseEntered
        Color rgb = new Color(82, 90, 90);
        l_Cuenta.setBackground(rgb);
    }//GEN-LAST:event_l_Cuenta2MouseEntered

    private void l_Cuenta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_Cuenta2MouseExited
        Color rgb = new Color(61, 63, 65);
        l_Cuenta.setBackground(rgb);
    }//GEN-LAST:event_l_Cuenta2MouseExited

    private void l_exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_l_exit1MouseClicked

    private void l_exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exit1MouseEntered
        l_exit.setBackground(Color.red);
    }//GEN-LAST:event_l_exit1MouseEntered

    private void l_exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_exit1MouseExited
        Color rgb = new Color(61,63,65);
        l_exit.setBackground(rgb);
    }//GEN-LAST:event_l_exit1MouseExited

    private void l_improve1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_improve1MouseEntered
        Color rgb = new Color(82, 90, 90);
        l_improve.setBackground(rgb);
    }//GEN-LAST:event_l_improve1MouseEntered

    private void l_improve1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_improve1MouseExited
        Color rgb = new Color(61, 63, 65);
        l_improve.setBackground(rgb);
    }//GEN-LAST:event_l_improve1MouseExited

    private void l_ayuda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayuda1MouseClicked
        JOptionPane.showMessageDialog(this, "Ya te he ayudado hermano \n\n"
                                                        + "te he salvado de sufrir en el sufrimiento enterno\n"
                                                        + "de las llamas del mal :0 ");
    }//GEN-LAST:event_l_ayuda1MouseClicked

    private void l_ayuda1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayuda1MouseEntered
        Color rgb = new Color(82, 90, 90);
        l_ayuda.setBackground(rgb);
    }//GEN-LAST:event_l_ayuda1MouseEntered

    private void l_ayuda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ayuda1MouseExited
        Color rgb = new Color(61, 63, 65);
        l_ayuda.setBackground(rgb);
    }//GEN-LAST:event_l_ayuda1MouseExited

    private void l_ocultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ocultar1MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_l_ocultar1MouseClicked

    private void l_ocultar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ocultar1MouseEntered
        Color rgb = new Color(82, 90, 90);
        l_ocultar.setBackground(rgb);
    }//GEN-LAST:event_l_ocultar1MouseEntered

    private void l_ocultar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_ocultar1MouseExited
        Color rgb = new Color(61, 63, 65);
        l_ocultar.setBackground(rgb);
    }//GEN-LAST:event_l_ocultar1MouseExited

    private void l_minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_minimize1MouseClicked
        if (evt.getButton() == 1) {
            int maxMin = getExtendedState();
            if ((maxMin & JFrame.MAXIMIZED_BOTH) == 0) {
                setExtendedState(maxMin | JFrame.MAXIMIZED_BOTH);
            }else{
                setExtendedState(maxMin & ~JFrame.MAXIMIZED_BOTH);
            }
        }
    }//GEN-LAST:event_l_minimize1MouseClicked

    private void l_minimize1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_minimize1MouseEntered
        Color rgb = new Color(82, 90, 90);
        l_minimize.setBackground(rgb);
    }//GEN-LAST:event_l_minimize1MouseEntered

    private void l_minimize1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_minimize1MouseExited
        Color rgb = new Color(61, 63, 65);
        l_minimize.setBackground(rgb);
    }//GEN-LAST:event_l_minimize1MouseExited

    private void p_headerCierre1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_headerCierre1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_p_headerCierre1MouseDragged

    private void p_headerCierre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_headerCierre1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_headerCierre1MousePressed

    private void l_improveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_improveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_improveMouseClicked

    private void l_improve1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_improve1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_improve1MouseClicked

    private void jtr_baseDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtr_baseDatosMouseClicked
        
    }//GEN-LAST:event_jtr_baseDatosMouseClicked

    private void l_CuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_CuentaMouseClicked
        
    }//GEN-LAST:event_l_CuentaMouseClicked

    private void l_cerrarJDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDCMouseEntered
        l_cerrarJDC.setBackground(Color.red);
        l_cerrarJDC.setForeground(Color.white);
    }//GEN-LAST:event_l_cerrarJDCMouseEntered

    private void l_cerrarJDCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDCMouseExited
        Color rgb = new Color(225,225,225);
        l_cerrarJDC.setBackground(rgb);
        l_cerrarJDC.setForeground(Color.black);
    }//GEN-LAST:event_l_cerrarJDCMouseExited

    private void l_cerrarJDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDCMouseClicked
        jd_Cuenta.setVisible(false);
    }//GEN-LAST:event_l_cerrarJDCMouseClicked

    private void txtf_SIUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_SIUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_SIUserMouseClicked

    private void l_cerrarJDC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC1MouseClicked
        jd_Cuenta.setVisible(false);
    }//GEN-LAST:event_l_cerrarJDC1MouseClicked

    private void l_cerrarJDC1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC1MouseEntered
        l_cerrarJDC.setBackground(Color.red);
        l_cerrarJDC.setForeground(Color.white);
    }//GEN-LAST:event_l_cerrarJDC1MouseEntered

    private void l_cerrarJDC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC1MouseExited
        Color rgb = new Color(225,225,225);
        l_cerrarJDC.setBackground(rgb);
        l_cerrarJDC.setForeground(Color.black);
    }//GEN-LAST:event_l_cerrarJDC1MouseExited

    private void txtf_SIPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_SIPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_SIPasswordMouseClicked

    private void bt_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signinMouseClicked
        jd_Cuenta.setVisible(false);
        l_Cuenta.setText(txtf_SIUser.getText());
        l_nombreUsuarioP.setText(txtf_SIUser.getText());
    }//GEN-LAST:event_bt_signinMouseClicked

    private void l_CreateOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_CreateOneMouseEntered
        
    }//GEN-LAST:event_l_CreateOneMouseEntered

    private void l_SIregresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_SIregresoMouseClicked
        p_SIUser.setVisible(true);
        p_SIPassword.setVisible(false);
    }//GEN-LAST:event_l_SIregresoMouseClicked

    private void bt_SInextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SInextMouseClicked
        String usuario = txtf_SIUser.getText();
        if (listaUsuario.contains(usuario)) {
            p_SIUser.setVisible(false);
            p_SIPassword.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(jd_Cuenta, "No se encontro usuario. Crea uno si no tiene");
        }
        
    }//GEN-LAST:event_bt_SInextMouseClicked

    private void l_cerrarJDC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC2MouseClicked
        jd_Cuenta.setVisible(false);
    }//GEN-LAST:event_l_cerrarJDC2MouseClicked

    private void l_cerrarJDC2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC2MouseEntered
        l_cerrarJDC.setBackground(Color.red);
        l_cerrarJDC.setForeground(Color.white);
    }//GEN-LAST:event_l_cerrarJDC2MouseEntered

    private void l_cerrarJDC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC2MouseExited
        Color rgb = new Color(225,225,225);
        l_cerrarJDC.setBackground(rgb);
        l_cerrarJDC.setForeground(Color.black);
    }//GEN-LAST:event_l_cerrarJDC2MouseExited

    private void txtf_CUUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_CUUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_CUUserMouseClicked

    private void l_CreateEspecialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_CreateEspecialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l_CreateEspecialMouseEntered

    private void bt_CUnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CUnextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CUnextMouseClicked

    private void l_CUregresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_CUregresoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_CUregresoMouseClicked

    private void txtf_CUPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_CUPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_CUPasswordMouseClicked

    private void bt_createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_createAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_createAccountMouseClicked

    private void l_cerrarJDC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_cerrarJDC3MouseClicked

    private void l_cerrarJDC3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l_cerrarJDC3MouseEntered

    private void l_cerrarJDC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cerrarJDC3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_l_cerrarJDC3MouseExited

    private void txtf_CUUserEspecialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_CUUserEspecialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_CUUserEspecialMouseClicked

    private void l_returnCUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_returnCUMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l_returnCUMouseEntered

    private void bt_CUnextEspecialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CUnextEspecialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CUnextEspecialMouseClicked

    private void l_SIregresoEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_SIregresoEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_SIregresoEMouseClicked

    private void txtf_CUPasswordEspecialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_CUPasswordEspecialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_CUPasswordEspecialMouseClicked

    private void bt_createAccountEspecialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_createAccountEspecialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_createAccountEspecialMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    ArrayList<Usuarios> listaUsuario = new ArrayList();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CUnext;
    private javax.swing.JButton bt_CUnextEspecial;
    private javax.swing.JButton bt_SInext;
    private javax.swing.JButton bt_browse;
    private javax.swing.JButton bt_createAccount;
    private javax.swing.JButton bt_createAccountEspecial;
    private javax.swing.JButton bt_new;
    private javax.swing.JButton bt_signin;
    private javax.swing.JComboBox<String> cb_DdatabaseF;
    private javax.swing.JComboBox<String> cb_DffBD;
    private javax.swing.JComboBox<String> cb_NewDSO;
    private javax.swing.JComboBox<String> cb_OfficeBackground;
    private javax.swing.JComboBox<String> cb_Officetheme;
    private javax.swing.JComboBox<String> cb_UserName;
    private javax.swing.JComboBox<String> cb_initials;
    private javax.swing.JComboBox<String> cb_screentip;
    private javax.swing.JCheckBox chbx_enableLive;
    private javax.swing.JCheckBox chbx_shortcutKeys;
    private javax.swing.JCheckBox chbx_values;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_Cuenta;
    private javax.swing.JDialog jd_crearBlank;
    private javax.swing.JDialog jd_options;
    private javax.swing.JSeparator js_SIuser;
    private javax.swing.JSeparator js_SIuser1;
    private javax.swing.JSeparator js_SIuser2;
    private javax.swing.JSeparator js_account;
    private javax.swing.JSeparator js_createOne;
    private javax.swing.JSeparator js_feedback;
    private javax.swing.JSeparator js_home;
    private javax.swing.JSeparator js_new;
    private javax.swing.JSeparator js_open;
    private javax.swing.JSeparator js_options;
    private javax.swing.JSeparator js_pin;
    private javax.swing.JSeparator js_pin1;
    private javax.swing.JSeparator js_recent;
    private javax.swing.JSeparator js_recent1;
    private javax.swing.JTable jt_table;
    private javax.swing.JTree jtr_baseDatos;
    private javax.swing.JLabel l_CUregreso;
    private javax.swing.JLabel l_CreateEspecial;
    private javax.swing.JLabel l_CreateOne;
    private javax.swing.JLabel l_Cuenta;
    private javax.swing.JLabel l_Cuenta2;
    private javax.swing.JLabel l_SIregreso;
    private javax.swing.JLabel l_SIregresoE;
    private javax.swing.JLabel l_account;
    private javax.swing.JLabel l_addins;
    private javax.swing.JLabel l_ayuda;
    private javax.swing.JLabel l_ayuda1;
    private javax.swing.JLabel l_ayudaO;
    private javax.swing.JLabel l_buttonCrearPagina;
    private javax.swing.JLabel l_cerrarJDC;
    private javax.swing.JLabel l_cerrarJDC1;
    private javax.swing.JLabel l_cerrarJDC2;
    private javax.swing.JLabel l_cerrarJDC3;
    private javax.swing.JLabel l_client;
    private javax.swing.JLabel l_current;
    private javax.swing.JLabel l_customize;
    private javax.swing.JLabel l_datasheet;
    private javax.swing.JLabel l_exit;
    private javax.swing.JLabel l_exit1;
    private javax.swing.JLabel l_exitO;
    private javax.swing.JLabel l_feedback;
    private javax.swing.JLabel l_forgotP;
    private javax.swing.JLabel l_forgotP1;
    private javax.swing.JLabel l_forgotP2;
    private javax.swing.JLabel l_general;
    private javax.swing.JLabel l_home;
    private javax.swing.JLabel l_improve;
    private javax.swing.JLabel l_improve1;
    private javax.swing.JLabel l_language;
    private javax.swing.JLabel l_minimize;
    private javax.swing.JLabel l_minimize1;
    private javax.swing.JLabel l_new;
    private javax.swing.JLabel l_nombreUsuarioP;
    private javax.swing.JLabel l_nombreUsuarioPCU;
    private javax.swing.JLabel l_nombreUsuarioPE;
    private javax.swing.JLabel l_object;
    private javax.swing.JLabel l_ocultar;
    private javax.swing.JLabel l_ocultar1;
    private javax.swing.JLabel l_open;
    private javax.swing.JLabel l_options;
    private javax.swing.JLabel l_pin;
    private javax.swing.JLabel l_pin1;
    private javax.swing.JLabel l_privacyStatement;
    private javax.swing.JLabel l_proofing;
    private javax.swing.JLabel l_quick;
    private javax.swing.JLabel l_recent;
    private javax.swing.JLabel l_recent1;
    private javax.swing.JLabel l_returnCU;
    private javax.swing.JLabel l_trust;
    private javax.swing.JPanel p_CUPassword;
    private javax.swing.JPanel p_CUPasswordEspecial;
    private javax.swing.JPanel p_CUUser;
    private javax.swing.JPanel p_CUUserEspecial;
    private javax.swing.JPanel p_Pagina;
    private javax.swing.JPanel p_SIPassword;
    private javax.swing.JPanel p_SIUser;
    private javax.swing.JPanel p_account;
    private javax.swing.JPanel p_crearBlank;
    private javax.swing.JPanel p_feedback;
    private javax.swing.JPanel p_headerCierre;
    private javax.swing.JPanel p_headerCierre1;
    private javax.swing.JPanel p_inicio;
    private javax.swing.JPanel p_ladoIzq;
    private javax.swing.JPanel p_menu;
    private javax.swing.JPanel p_new;
    private javax.swing.JPanel p_newN;
    private javax.swing.JPanel p_optiones;
    private javax.swing.JPanel p_search;
    private javax.swing.JPanel p_searchIcon;
    private javax.swing.JPanel p_searchIcon1;
    private javax.swing.JPanel p_searchO;
    private javax.swing.JPanel panel_new;
    private javax.swing.JPanel panel_open;
    private javax.swing.JTextField txtf_CUPassword;
    private javax.swing.JTextField txtf_CUPasswordEspecial;
    private javax.swing.JTextField txtf_CUUser;
    private javax.swing.JTextField txtf_CUUserEspecial;
    private javax.swing.JTextField txtf_SIPassword;
    private javax.swing.JTextField txtf_SIUser;
    private javax.swing.JTextField txtf_search;
    private javax.swing.JTextField txtf_search1;
    // End of variables declaration//GEN-END:variables
}
