
import com.ozten.font.JFontChooser;
import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.*;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.undo.UndoManager;

public class Notepad extends javax.swing.JFrame {
    public Notepad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newitem = new javax.swing.JMenuItem();
        openitem = new javax.swing.JMenuItem();
        saveitem = new javax.swing.JMenuItem();
        saveasitem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cutitem = new javax.swing.JMenuItem();
        copyitem = new javax.swing.JMenuItem();
        pasteitem = new javax.swing.JMenuItem();
        deleteitem = new javax.swing.JMenuItem();
        undoitem = new javax.swing.JMenuItem();
        formatitem = new javax.swing.JMenu();
        fontitem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        helpitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jMenu1.setText("File");

        newitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newitem.setText("New");
        newitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newitemActionPerformed(evt);
            }
        });
        jMenu1.add(newitem);

        openitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openitem.setText("Open");
        openitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openitemActionPerformed(evt);
            }
        });
        jMenu1.add(openitem);

        saveitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveitem.setText("Save");
        saveitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveitemActionPerformed(evt);
            }
        });
        jMenu1.add(saveitem);

        saveasitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveasitem.setText("Save As");
        saveasitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasitemActionPerformed(evt);
            }
        });
        jMenu1.add(saveasitem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Print");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        cutitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutitem.setText("Cut");
        cutitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutitemActionPerformed(evt);
            }
        });
        jMenu2.add(cutitem);

        copyitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyitem.setText("Copy");
        copyitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyitemActionPerformed(evt);
            }
        });
        jMenu2.add(copyitem);

        pasteitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteitem.setText("Paste");
        pasteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteitemActionPerformed(evt);
            }
        });
        jMenu2.add(pasteitem);

        deleteitem.setText("Delete");
        deleteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitemActionPerformed(evt);
            }
        });
        jMenu2.add(deleteitem);

        undoitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoitem.setText("Undo");
        undoitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoitemActionPerformed(evt);
            }
        });
        jMenu2.add(undoitem);

        jMenuBar1.add(jMenu2);

        formatitem.setText("Format");

        fontitem.setText("Font");
        fontitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontitemActionPerformed(evt);
            }
        });
        formatitem.add(fontitem);

        jMenuBar1.add(formatitem);

        jMenu3.setText("Help");

        helpitem.setText("View");
        helpitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpitemActionPerformed(evt);
            }
        });
        jMenu3.add(helpitem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newitemActionPerformed

       if(ta.getText().length()>1 || ta.getText().length()<1)
       {
           setTitle("Untitled");
           ta.setText("");
       }

       
    }//GEN-LAST:event_newitemActionPerformed

    private void openitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openitemActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f=chooser.getSelectedFile();
    String filename=f.getAbsolutePath();
    
        
        try {
            FileReader reader= new FileReader(filename);
            BufferedReader br= new BufferedReader(reader);
            ta.read(br,null);
            br.close();
            ta.requestFocus();
          
          
            
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error"+ex);
                  }
    }//GEN-LAST:event_openitemActionPerformed

    private void saveitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveitemActionPerformed
     
    JFileChooser chooser = new JFileChooser();
    chooser.showSaveDialog(this);
    File filename=chooser.getSelectedFile();
   
    
        
        try {
            FileWriter writer = new FileWriter(filename);
            String text = ta.getText();
            writer.write(text);
            writer.close();
    
        } catch (IOException e) {
           JOptionPane.showMessageDialog(null,"Error"+e);
        }

    }//GEN-LAST:event_saveitemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void deleteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitemActionPerformed

        ta.setText(ta.getText().replace(ta.getSelectedText(),""));
        
    }//GEN-LAST:event_deleteitemActionPerformed

    private void saveasitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasitemActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showSaveDialog(this);
    File filename=chooser.getSelectedFile();        
        try {
            FileWriter writer = new FileWriter(filename);
            String text = ta.getText();
            writer.write(text);
            writer.close();
    
        } catch (IOException e) {
           JOptionPane.showMessageDialog(null,"Error"+e);
        }
    }//GEN-LAST:event_saveasitemActionPerformed

    private void fontitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontitemActionPerformed
        JFontChooser fc=new JFontChooser();
        JOptionPane.showMessageDialog(null, fc, "Please choose font", JOptionPane.PLAIN_MESSAGE);
        ta.setFont(fc.getPreviewFont());
    }//GEN-LAST:event_fontitemActionPerformed

    private void helpitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpitemActionPerformed
       try {
         Desktop desktop = java.awt.Desktop.getDesktop();
         URI oURL = new URI("https://www.bing.com/search?q=get+help+with+notepad+in+windows+10&filters=guid:%224466414-en-dia%22%20lang:%22en%22&form=T00032&ocid=HelpPane-BingIA");
         desktop.browse(oURL);
            }
       catch (Exception e) {
        e.printStackTrace();
}
        
    }//GEN-LAST:event_helpitemActionPerformed

    private void cutitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutitemActionPerformed
   
        ta.cut();
    }//GEN-LAST:event_cutitemActionPerformed

    private void copyitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyitemActionPerformed
       ta.copy();
    }//GEN-LAST:event_copyitemActionPerformed

    private void pasteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteitemActionPerformed
        ta.paste();
    }//GEN-LAST:event_pasteitemActionPerformed

    private void undoitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoitemActionPerformed
       UndoManager u = new UndoManager();
       ta.getDocument().addUndoableEditListener(u);

    }//GEN-LAST:event_undoitemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            ta.print();
        } catch (PrinterException ex) {
           JOptionPane.showMessageDialog(null, "Error.."+ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyitem;
    private javax.swing.JMenuItem cutitem;
    private javax.swing.JMenuItem deleteitem;
    private javax.swing.JMenuItem fontitem;
    private javax.swing.JMenu formatitem;
    private javax.swing.JMenuItem helpitem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newitem;
    private javax.swing.JMenuItem openitem;
    private javax.swing.JMenuItem pasteitem;
    private javax.swing.JMenuItem saveasitem;
    private javax.swing.JMenuItem saveitem;
    private javax.swing.JTextArea ta;
    private javax.swing.JMenuItem undoitem;
    // End of variables declaration//GEN-END:variables
}
