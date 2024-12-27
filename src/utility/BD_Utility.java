/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author aravi
 */
public class BD_Utility {
    
    public static void setImage(JFrame jframe, String imagepath, int newwidth, int newheight) {
		try {
			BufferedImage originalImage = ImageIO.read(BD_Utility.class.getResourceAsStream(imagepath));
			BufferedImage resizedImage = new BufferedImage(newwidth, newheight, BufferedImage.TYPE_INT_RGB);
			resizedImage.createGraphics()
					.drawImage(originalImage.getScaledInstance(newwidth, newheight, Image.SCALE_SMOOTH), 0, 0, null);
			ImageIcon backgroundimage = new ImageIcon(resizedImage);
			JLabel backgroundLabel = new JLabel(backgroundimage);
			backgroundLabel.setBounds(0, 0, newwidth, newheight);
			jframe.getContentPane().add(backgroundLabel, BorderLayout.CENTER);
			jframe.validate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
    
    private static HashMap<String, JFrame> formsMap = new HashMap<>();

	public static void openform(String formName, JFrame formInstance) {
		JFrame existingform = formsMap.get(formName);
		if (existingform == null || !existingform.isVisible()) {
			formsMap.put(formName, formInstance);
			formInstance.setVisible(true);
		} else {
			existingform.toFront();
		}
	}
        
        
    public static String getPath(String finalpath) {
		String projectPath = System.getProperty("user.dir");
		return projectPath + "\\src\\" + finalpath;
	}

	public static String getFileExtension(String FileName) {
		int lastDotIndex = FileName.lastIndexOf(".");
		if (lastDotIndex != -1) {
			return FileName.substring(lastDotIndex + 1);
		}
		return "";
	}

	public static BufferedImage scaleImage(BufferedImage oringinalImage, BufferedImage selectedImage) {
		int width = selectedImage.getWidth();
		int height = selectedImage.getHeight();
		BufferedImage scaledImage = new BufferedImage(width, height, oringinalImage.getType());
		scaledImage.createGraphics().drawImage(oringinalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0,
				0, null);
		return scaledImage;
	}
}
