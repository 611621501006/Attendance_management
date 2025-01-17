/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import dao.connectionprovider;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import utility.BD_Utility;
import java.sql.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author aravi
 */
public class Mark_Attendance extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;

    private ExecutorService executor = Executors.newSingleThreadExecutor(this);
    private volatile boolean running = true;

    public Mark_Attendance() {
        initComponents();
        BD_Utility.setImage(this, "images/abc1_1.jpg", 1366, 768);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.black));
        initWebcam();

        Timer timer = new Timer(1, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat simpleDateTime = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss.SSS");
        lbTime.setText(simpleDateTime.format(new Date()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        webcampanel = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbchekIncheckOut = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mark Attendence");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        webcampanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Time");

        lbTime.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTime.setText("Time");

        lbchekIncheckOut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(553, 553, 553)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(webcampanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 914, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbchekIncheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(997, Short.MAX_VALUE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(135, 135, 135)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webcampanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(663, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(lbchekIncheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(541, Short.MAX_VALUE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(191, 191, 191)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        running=false;
        stopwebcam();
        if(executor!=null && !executor.isShutdown())
        {
            executor.shutdown();
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mark_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mark_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mark_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mark_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mark_Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbchekIncheckOut;
    private javax.swing.JPanel webcampanel;
    // End of variables declaration//GEN-END:variables

    Map<String, String> resultmap = new HashMap<String, String>();

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            try {
                Result result = null;
                BufferedImage image = null;
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

                try {
                    result = new MultiFormatReader().decode(bitmap);
                } catch (NotFoundException ex) {

                }
                if (result != null) {
                    String jsonString = result.getText();
                    Gson gson = new Gson();
                    java.lang.reflect.Type type = new TypeToken<Map<String, String>>() {

                    }.getType();
                    resultmap = gson.fromJson(jsonString, type);
                    String finalpath = BD_Utility.getPath("images\\" + resultmap.get("email") + ".jpg");
                    circularImageFrame(finalpath);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } while (running);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }

    private void stopwebcam() {
        if (webcam != null && webcam.isOpen()) {
            webcam.close();
        }
    }

    private void initWebcam() {
        webcam = webcam.getDefault();
        if (webcam != null) {
            Dimension[] resolution = webcam.getViewSizes();
            Dimension maxresolution = resolution[resolution.length - 1];

            if (webcam.isOpen()) {
                webcam.close();
            }
            webcam.setViewSize(maxresolution);
            webcam.open();

            panel = new WebcamPanel(webcam);
            panel.setPreferredSize(maxresolution);
            panel.setFPSDisplayed(true);

            webcampanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 689, 518));
            executor.execute(this);
            executor.shutdown();

        } else {
            System.out.println("Issue with Webcam.");
        }
    }
    private BufferedImage imagee = null;

    private void circularImageFrame(String finalpath) {
        try {
            Connection con = connectionprovider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from userdetails where email='" + resultmap.get("email") + "';");

            if (!rs.next()) {
                showPopupForCertainDuration("user is not Registered or Deleted", "Invalid OR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            imagee = null;
            File imageFile = new File(finalpath);
            if (imageFile.exists()) {
                try {
                    imagee = ImageIO.read(new File(finalpath));
                    imagee = createCircularImage(imagee);
                    ImageIcon icon = new ImageIcon(imagee);
                    lbImage.setIcon(icon);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                BufferedImage imageee = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = imageee.createGraphics();
                g2d.setColor(Color.BLACK);
                g2d.fillOval(25, 25, 250, 250);
                g2d.setFont(new Font("Serif", Font.BOLD, 250));
                g2d.setColor(Color.WHITE);
                g2d.drawString(String.valueOf(resultmap.get("name").charAt(0)).toUpperCase(), 75, 225);
                g2d.dispose();

                ImageIcon imageicon = new ImageIcon(imageee);
                lbImage.setIcon(imageicon);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.pack();
                this.setLocationRelativeTo(null);
                this.setVisible(true);
            }
            lbName.setHorizontalAlignment(JLabel.CENTER);
            lbName.setText(resultmap.get("name"));
            if (!checkIncheckOut()) {
                return;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showPopupForCertainDuration(String popUpMessage, String popUoHeader, Integer iconId) throws HeadlessException {
        final JOptionPane optionpane = new JOptionPane(popUpMessage, iconId);
        final JDialog dialog = optionpane.createDialog(popUoHeader);
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dialog.dispose();
                clearUserDetails();
            }
        });
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true);
    }

    private void clearUserDetails() {
       lbchekIncheckOut.setText("");
       lbchekIncheckOut.setBackground(null);
       lbchekIncheckOut.setForeground(null);
       lbchekIncheckOut.setOpaque(false);
       lbName.setText("");
       lbImage.setIcon(null);
            
               
    }

    private BufferedImage createCircularImage(BufferedImage image) {
        int dimeter =285;
        BufferedImage resizedImage=new BufferedImage(dimeter,dimeter,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2=resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0,0,dimeter,dimeter, null);
        g2.dispose();
        BufferedImage circularImage=new BufferedImage(dimeter,dimeter,BufferedImage.TYPE_INT_ARGB);
        g2=circularImage.createGraphics();
        Ellipse2D.Double circle=new Ellipse2D.Double(0,0,dimeter,dimeter);
        g2.setClip(circle);
        g2.drawImage(resizedImage, 0,0, null);
        return circularImage;
    }

    private boolean checkIncheckOut() throws HeadlessException, SQLException {
        String popUpHeader = null;
        String popUpMessage = null;
        Color color = null;

        Connection con = connectionprovider.getcon();
        Statement st = con.createStatement();

        LocalDate currentdate = LocalDate.now();
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

        ResultSet rs = st.executeQuery("select * from userattendance where dates= '" + currentdate.format(dateformatter) + "' and userid= " + Integer.valueOf(resultmap.get("id"))+";");
        Connection connection = connectionprovider.getcon();

        if (rs.next()) {
            String CheckOutDateTime = rs.getString(4);
            if (CheckOutDateTime != null) {
                popUpMessage = "Already CheckOut For the Day";
                   popUpHeader = "Invalid CheckOut";
                showPopupForCertainDuration(popUpMessage, popUpHeader, JOptionPane.ERROR_MESSAGE);
                return false;
            }
            String CheckInDateTime = rs.getString(3);
            Duration duration=null;
            try{
            LocalDateTime checkInLocalDateTime = LocalDateTime.parse((CharSequence)CheckInDateTime, dateTimeformatter);
              duration = Duration.between(checkInLocalDateTime, currentDateTime);
            }
            catch(DateTimeParseException ex)
            {
                ex.printStackTrace();
            }
           

            long hours = duration.toHours();
            long minutes = duration.minusHours(hours).toMinutes();
            long seconds = duration.minusHours(hours).minusMinutes(minutes).getSeconds();

            if ((hours >= 0) || (hours == 0 && minutes >= 5)) {
                long remainingMinutes = 4 - minutes;
                long remainingseconds = 60 - seconds;
                popUpMessage = String.format("you work Duration is less than 5 minutes \n you can check out after: %d minutes and %d seconds", remainingMinutes, remainingseconds);
                popUpHeader = "Duration Warning";

                showPopupForCertainDuration(popUpMessage, popUpHeader, JOptionPane.WARNING_MESSAGE);
                return false;

            }
            String updateQuery = "update userattendance set checkout=?,worduration=? where dates=? and userid=?";
            PreparedStatement ps = connection.prepareCall(updateQuery);
            ps.setString(1, currentDateTime.format(dateTimeformatter));
            ps.setString(2, "" + hours + " Hours and " + minutes + " Minutes");
            ps.setString(3, currentdate.format(dateformatter));
            ps.setString(4, resultmap.get("id"));

            ps.executeUpdate();
            popUpHeader = "checkOut";
            popUpMessage = "Checked Out at " + currentDateTime.format(dateTimeformatter) + "\n Work Duration" + hours + "Hours and " + minutes + "Minutes";
            color = Color.RED;

        } else {
            String insertQuey = "Insert into userattendance (userid,dates,checkin) values (?,?,?);";
            PreparedStatement ps = connection.prepareStatement(insertQuey);
            ps.setString(1, resultmap.get("id"));
            ps.setString(2, currentdate.format(dateformatter));
            ps.setString(3, currentDateTime.format(dateTimeformatter));
            ps.executeUpdate();
            popUpHeader = "CheckIn";
            popUpMessage = "Check In at " + currentDateTime.format(dateTimeformatter);
            color = Color.GREEN;
        }
        lbchekIncheckOut.setHorizontalAlignment(JLabel.CENTER);
        lbchekIncheckOut.setText(popUpHeader);
        lbchekIncheckOut.setForeground(Color.DARK_GRAY);
        lbchekIncheckOut.setOpaque(true);
        showPopupForCertainDuration(popUpMessage, popUpHeader, JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        if(imagee !=null)
        {
            g.drawImage(imagee, 0,0, null);
        }
    }
}
