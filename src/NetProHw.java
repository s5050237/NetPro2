
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author comsci
 */
public class NetProHw extends javax.swing.JFrame {

    /**
     * Creates new form NetProAss2
     */
    public NetProHw() {
        
		initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUrl1 = new javax.swing.JLabel();
        jLabelUrl2 = new javax.swing.JLabel();
        Url1 = new javax.swing.JTextField();
        Url2 = new javax.swing.JTextField();
        getlink = new javax.swing.JButton();
        jScrollBox2 = new javax.swing.JScrollPane();
        box2 = new javax.swing.JEditorPane();
        jLabelHeader = new javax.swing.JLabel();
        jLabelThread = new javax.swing.JLabel();
        jScrollPaneHeader3 = new javax.swing.JScrollPane();
        Header = new javax.swing.JEditorPane();
        jScrollPaneThread4 = new javax.swing.JScrollPane();
        Thread = new javax.swing.JEditorPane();
        jScrollBox1 = new javax.swing.JScrollPane();
        box1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jidapa Nunkeaw s5050237@kmitl.ac.th - Java Web Browser (Network Programming Class Assignment)");

        jLabelUrl1.setText("URL1 :");

        jLabelUrl2.setText("URL2 :");

        Url1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Url1ActionPerformed(evt);
            }
        });

        Url2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Url2ActionPerformed(evt);
            }
        });

        getlink.setText("GO");
        getlink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getlinkActionPerformed(evt);
            }
        });

        jScrollBox2.setViewportView(box2);

        jLabelHeader.setText("Header");

        jLabelThread.setText("Thread");

        jScrollPaneHeader3.setViewportView(Header);

        jScrollPaneThread4.setViewportView(Thread);

        box1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                box1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollBox1.setViewportView(box1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUrl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Url1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(getlink)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUrl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Url2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                    .addComponent(jScrollPaneThread4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabelThread)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPaneHeader3)
                                    .addComponent(jScrollBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelHeader)
                                .addGap(236, 236, 236))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUrl1)
                    .addComponent(Url1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Url2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getlink)
                    .addComponent(jLabelUrl2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBox1)
                    .addComponent(jScrollBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelThread)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneThread4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHeader)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPaneHeader3)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getlinkActionPerformed
        // TODO add your handling code here:
        try{
            box1.setPage(Url1.getText());
            Thread.setText("Thread1 --> Get Link \n");
            box2.setPage(Url2.getText());
            Thread.setText(Thread.getText()+"Thread2 --> Get Link\n");
            Thread.setText(Thread.getText()+"Thread1 --> : Show HTTP Header\n");
            Thread.setText(Thread.getText()+"Thread2 --> Show HTTP Header\n");
            PrintHeader(Url1.getText(), "Thread1 : ");
            PrintHeader(Url2.getText(), "Thread2: ");
            Thread.setText(Thread.getText()+"Thread1 --> Get Complete\n");
            Thread.setText(Thread.getText()+"Thread-2 --> Get Complete\n");
        }
        catch(IOException e){
            System.out.println("GetPage Error");
        }
    }//GEN-LAST:event_getlinkActionPerformed

    private void Url2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Url2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Url2ActionPerformed

    private void Url1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Url1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Url1ActionPerformed

    private void box1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_box1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_box1AncestorAdded

    private void PrintHeader(String Url, String thread) {
		
        try {
			 
            URL obj = new URL(Url);
            URLConnection conn = obj.openConnection();
            Map <String, List<String>> map = conn.getHeaderFields();
            Header.setText(Header.getText()+"Printing Response Header "+ thread +"\n\n"); 
            
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                Header.setText(Header.getText()+"Key : "+entry.getKey()+" ,Value : "+entry.getValue()+"\n");
            }
            System.out.println("\nGet Response Header By Key ...\n");
            String server = conn.getHeaderField("Server");
		 
            if (server == null) {
		Header.setText(Header.getText()+"'Server' is not found!\n");
            } 
            else {
                Header.setText(Header.getText()+"Server : " + server+"\n");
            }
            Header.setText(Header.getText()+ "\n\n******************DONE*******************\n\n");
      
        } catch (IOException e) {
        }
    }
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
            java.util.logging.Logger.getLogger(NetProHw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NetProHw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NetProHw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NetProHw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NetProHw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Header;
    private javax.swing.JEditorPane Thread;
    private javax.swing.JTextField Url1;
    private javax.swing.JTextField Url2;
    private javax.swing.JEditorPane box1;
    private javax.swing.JEditorPane box2;
    private javax.swing.JButton getlink;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelThread;
    private javax.swing.JLabel jLabelUrl1;
    private javax.swing.JLabel jLabelUrl2;
    private javax.swing.JScrollPane jScrollBox1;
    private javax.swing.JScrollPane jScrollBox2;
    private javax.swing.JScrollPane jScrollPaneHeader3;
    private javax.swing.JScrollPane jScrollPaneThread4;
    // End of variables declaration//GEN-END:variables
}
