package freehand;

import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author perpustakaan
 */
public class DlgMarkingImageOdontogram extends javax.swing.JDialog {
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private String username="",urlImage="",idOdon="";
    private validasi Valid=new validasi();
    private PreparedStatement ps;
    private ResultSet rs;
    private int index = 0;
    private Point[] arr = new Point[100000];
    private BufferedImage img;
    private SimpleDateFormat tanggalNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private SimpleDateFormat jamNow = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat randomId = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    /** Creates new form DlgPemberianObat
     * @param parent
     * @param modal */
    public DlgMarkingImageOdontogram(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(0,0);
        setSize(885,686); 
        imageAssesment("http://"+koneksiDB.HOSTHYBRIDWEB()+":"+koneksiDB.PORTWEB()+"/"+koneksiDB.HYBRIDWEB()+"/imagefreehand/masterimage/odontogram.png");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrame1 = new widget.InternalFrame();
        FormInput = new widget.PanelBiasa();
        jLabel3 = new widget.Label();
        TNoRawat = new widget.TextBox();
        idOrderGigi = new widget.TextBox();
        panelGlass9 = new widget.panelisi();
        PanelWall = new usu.widget.glass.PanelGlass();
        panelGlass8 = new widget.panelisi();
        BtnSimpan = new widget.Button();
        BtnHapus = new widget.Button();
        BtnHapus1 = new widget.Button();
        BtnKeluar = new widget.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Marking Odontogram  Pasien ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(70, 70, 70))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        FormInput.setName("FormInput"); // NOI18N
        FormInput.setPreferredSize(new java.awt.Dimension(865, 60));
        FormInput.setLayout(null);

        jLabel3.setText("No. Rawat");
        jLabel3.setName("jLabel3"); // NOI18N
        FormInput.add(jLabel3);
        jLabel3.setBounds(0, 10, 65, 23);

        TNoRawat.setEditable(false);
        TNoRawat.setHighlighter(null);
        TNoRawat.setName("TNoRawat"); // NOI18N
        FormInput.add(TNoRawat);
        TNoRawat.setBounds(70, 10, 270, 23);

        idOrderGigi.setEditable(false);
        idOrderGigi.setHighlighter(null);
        idOrderGigi.setName("idOrderGigi"); // NOI18N
        FormInput.add(idOrderGigi);
        idOrderGigi.setBounds(650, 10, 160, 23);

        internalFrame1.add(FormInput, java.awt.BorderLayout.PAGE_START);
        FormInput.getAccessibleContext().setAccessibleName("");
        FormInput.getAccessibleContext().setAccessibleDescription("");

        panelGlass9.setBorder(null);
        panelGlass9.setAlignmentX(0.0F);
        panelGlass9.setAlignmentY(0.0F);
        panelGlass9.setMinimumSize(new java.awt.Dimension(0, 0));
        panelGlass9.setName("panelGlass9"); // NOI18N
        panelGlass9.setPreferredSize(new java.awt.Dimension(800, 500));
        panelGlass9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        PanelWall.setBackground(new java.awt.Color(29, 29, 29));
        PanelWall.setBackgroundImageType(usu.widget.constan.BackgroundConstan.BACKGROUND_IMAGE_STRECT);
        PanelWall.setPreferredSize(new java.awt.Dimension(878, 556));
        PanelWall.setRound(false);
        PanelWall.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelWallMouseDragged(evt);
            }
        });
        PanelWall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PanelWallMouseReleased(evt);
            }
        });
        PanelWall.setLayout(null);
        panelGlass9.add(PanelWall);

        internalFrame1.add(panelGlass9, java.awt.BorderLayout.CENTER);

        panelGlass8.setName("panelGlass8"); // NOI18N
        panelGlass8.setPreferredSize(new java.awt.Dimension(100, 56));
        panelGlass8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setText("Simpan");
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        BtnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnSimpan);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setText("Hapus Marking");
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(150, 30));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        BtnHapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnHapusKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnHapus);

        BtnHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/42a.png"))); // NOI18N
        BtnHapus1.setMnemonic('H');
        BtnHapus1.setText("Gambar Baru");
        BtnHapus1.setToolTipText("Alt+H");
        BtnHapus1.setName("BtnHapus1"); // NOI18N
        BtnHapus1.setPreferredSize(new java.awt.Dimension(150, 30));
        BtnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapus1ActionPerformed(evt);
            }
        });
        BtnHapus1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnHapus1KeyPressed(evt);
            }
        });
        panelGlass8.add(BtnHapus1);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnKeluar.setMnemonic('T');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+T");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnKeluar);

        internalFrame1.add(panelGlass8, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        Robot r = null;
        if(idOdon.equals(null)||idOdon.equals("")){
           idOdon=randomId.format(new Date()); 
        }else{
          idOdon=idOdon; 
        }
        
        try {
            r = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(DlgMarkingImageOdontogram.class.getName()).log(Level.SEVERE, null, ex);
        }
        Rectangle capture = 
            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(panelGlass9.bounds());
        try {
            ImageIO.write(Image, "png", new File("tmpImageFreehand/odontogram"+TNoRawat.getText().replaceAll("/", "")+""+idOdon+".png"));
        } catch (IOException ex) {
            Logger.getLogger(DlgMarkingImageOdontogram.class.getName()).log(Level.SEVERE, null, ex);
        }
        uploadImage("odontogram"+TNoRawat.getText().replaceAll("/", "")+""+idOdon+".png","odontogram");
        if(Sequel.cariInteger("select count(noorder) as jumlah from pemeriksaan_gigi where noorder='"+idOdon+"'")>0){
            if(Sequel.mengedittf("pemeriksaan_gigi","noorder=?","tanggal=?,url_image=?",3,new String[]{
                   tanggalNow.format(new Date()),"odontogram/odontogram"+TNoRawat.getText().replaceAll("/", "")+""+idOdon+".png",idOdon
                     })==true){
                idOrderGigi.setText(idOdon);
            }
        }else{
         if(Sequel.menyimpantf("pemeriksaan_gigi","?,?,?,?,?,?,?,?,?,?,?","No.Rawat",11,new String[]{
                    TNoRawat.getText(),"","","","","","",tanggalNow.format(new Date()),idOdon,"","odontogram/odontogram"+TNoRawat.getText().replaceAll("/", "")+""+idOdon+".png"
                })==true){
             idOrderGigi.setText(idOdon);
//                    JOptionPane.showMessageDialog(null,"Data berhasil disimpan.");
//                    emptTeks();
            }
        }
        dispose();
}//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
       
}//GEN-LAST:event_BtnSimpanKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        dispose();
}//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }
}//GEN-LAST:event_BtnKeluarKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void PanelWallMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelWallMouseDragged
        arr[index] = new Point(evt.getXOnScreen(), evt.getYOnScreen());
        index++;
        Graphics g = getGraphics() ;
        g.setColor(Color.red);
        for (int i = 0; i < index - 1; i++)
        g.drawLine(arr[i].x, arr[i].y, arr[i + 1].x, arr[i + 1].y);
//        System.out.println(index);
    }//GEN-LAST:event_PanelWallMouseDragged

    private void PanelWallMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelWallMouseReleased
        arr = new Point[100000];
        index = 0;
    }//GEN-LAST:event_PanelWallMouseReleased

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed

//        System.out.println(index);
        repaint();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapusKeyPressed

    }//GEN-LAST:event_BtnHapusKeyPressed

    private void BtnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapus1ActionPerformed
        imageAssesment("http://"+koneksiDB.HOSTHYBRIDWEB()+":"+koneksiDB.PORTWEB()+"/"+koneksiDB.HYBRIDWEB()+"/imagefreehand/masterimage/odontogram.png");
    }//GEN-LAST:event_BtnHapus1ActionPerformed

    private void BtnHapus1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapus1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHapus1KeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgMarkingImageOdontogram dialog = new DlgMarkingImageOdontogram(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnHapus;
    private widget.Button BtnHapus1;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.PanelBiasa FormInput;
    private usu.widget.glass.PanelGlass PanelWall;
    private widget.TextBox TNoRawat;
    public widget.TextBox idOrderGigi;
    private widget.InternalFrame internalFrame1;
    private widget.Label jLabel3;
    private widget.panelisi panelGlass8;
    private widget.panelisi panelGlass9;
    // End of variables declaration//GEN-END:variables
    

    private void isPsien() {
//        Sequel.cariIsi("select nm_pasien from pasien where no_rkm_medis=? ",TPasien,TNoRM.getText());
    }

    public void setNoRw(String norw,String id) {
        this.idOdon=id;
        idOrderGigi.setText("");
        TNoRawat.setText("");
        TNoRawat.setText(norw);
        idOrderGigi.setText(id);
       
        if(idOdon.equals(null)||idOdon.equals("")){
            
           imageAssesment("http://"+koneksiDB.HOSTHYBRIDWEB()+":"+koneksiDB.PORTWEB()+"/"+koneksiDB.HYBRIDWEB()+"/imagefreehand/masterimage/odontogram.png");
       }else{
             urlImage=Sequel.cariIsi("select url_image from pemeriksaan_gigi where noorder='"+id+"' ");
             imageAssesment("http://"+koneksiDB.HOSTHYBRIDWEB()+":"+koneksiDB.PORTWEB()+"/"+koneksiDB.HYBRIDWEB()+"/imagefreehand/"+urlImage.trim()+"");
       }    
    }
    
    
    public void isCek(){
        BtnSimpan.setEnabled(true);

       
        
    }
void uploadImage(String FileName,String docpath){
    try{
        File file =new File("tmpImageFreehand/"+FileName);
        byte[] data = new byte[(int) file.length()];
        data = FileUtils.readFileToByteArray(file);
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost("http://"+koneksiDB.HOSTHYBRIDWEB()+":"+koneksiDB.PORTWEB()+"/"+koneksiDB.HYBRIDWEB()+"/imagefreehand/upload.php?doc="+docpath);
        ByteArrayBody fileData = new ByteArrayBody(data, FileName);
        MultipartEntity reqEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        reqEntity.addPart("file", fileData); 
        postRequest.setEntity(reqEntity);
        httpClient.execute(postRequest); 
//        HttpResponse response = (HttpResponse) httpClient.execute(postRequest); 
        deleteFile();
        
        }catch (Exception e){
            System.out.println("Upload error"+e);
        }
    }
void deleteFile(){
       File file = new File("tmpImageFreehand");      
        String[] myFiles;    
        if (file.isDirectory()) {
            myFiles = file.list();
            for (int i = 0; i < myFiles.length; i++) {
                File myFile = new File(file, myFiles[i]); 
                myFile.delete();
            }
        }
   }
void imageAssesment(String url){  
    try {
            BufferedImage img = ImageIO.read(new URL(url.trim()));
            PanelWall.setBackgroundImage(new javax.swing.ImageIcon(img));
        }
        catch(IOException ex) {

        }
    }
public void idOrder(){
    
}

}
