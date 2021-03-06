/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.utils;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Guinness
 */
public class ImageRenderer2 extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();

        label.setOpaque(true);
        label.setBackground(new java.awt.Color(255, 255, 255));
        if (value != null) {
            label.setHorizontalAlignment(JLabel.CENTER);
            //value is parameter which filled by byteOfImage
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(value.toString()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(25, 25,
                    Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(dimg);
            label.setIcon(imageIcon);
        }
        if (isSelected) {
            label.setBackground(new java.awt.Color(4, 176, 217));
        }
        return label;
    }
}
