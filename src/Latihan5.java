/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Latihan5 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan5
     */
    public Latihan5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nilai = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        Mapel = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Hasil = new javax.swing.JScrollPane();
        Hasil2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(Nilai);
        Nilai.setBounds(180, 200, 150, 30);
        getContentPane().add(Nama);
        Nama.setBounds(180, 80, 150, 30);
        getContentPane().add(Kelas);
        Kelas.setBounds(180, 120, 150, 30);
        getContentPane().add(Mapel);
        Mapel.setBounds(180, 160, 150, 30);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(220, 250, 73, 23);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penilaian Siswa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 40, 90, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nilai");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 210, 50, 18);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 80, 50, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kelas");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 130, 50, 15);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mapel");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 170, 50, 18);

        Hasil2.setColumns(20);
        Hasil2.setRows(5);
        Hasil.setViewportView(Hasil2);

        jPanel1.add(Hasil);
        Hasil.setBounds(110, 280, 330, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 420);

        setBounds(0, 0, 541, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
       String nama = Nama.getText();
       String kelas = Kelas.getText();
       String mapel = Mapel.getText();
       int nilai = Integer.parseInt(String.valueOf(Nilai.getText()));
       String predikat ="";
        
       if(86<=nilai && nilai<=100){
           predikat = "Sempurna";
       }
       else if(nilai >75 && nilai<=85){
           predikat = "Predikat : Lulus";
       }
       else if (nilai>100){
           predikat = "Nilai melebihi batas";
       }
       else{
           predikat= "Predikat : Tidak Lulus";
       }
       Hasil2.setText("Nama :"+nama+"\n"+"Absen :"+kelas+"\n"+"Matpel :"+mapel+"\n"+"Nilai :"+nilai+"\n"+"Predicat :"+predikat+"\n");
        // TODO add your handling code here:
    }//GEN-LAST:event_ProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Hasil;
    private javax.swing.JTextArea Hasil2;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JButton Proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
