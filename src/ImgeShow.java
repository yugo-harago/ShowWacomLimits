import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class ImgeShow extends JFrame {

    public static void main(String[] a) {
        String dir = "C:\\Users\\yugoh\\Main\\Programming\\MyPrograms\\ShowWacomLimits\\src\\";
        JFrame frame = new JFrame();
        int offset = 25;
        int top = 184 - offset;
        int left = 122 - offset;
        int bottom = 909 + offset;
        int right = 1323 + offset;
        int width = right - left;
        int height = bottom - top + 30;// + 149;
        frame.setLocation(left, top);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setAlwaysOnTop(true);
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
        var ltImage = new JLabel(new ImageIcon(dir + "Limit_lt.png"));
        var lbImage = new JLabel(new ImageIcon(dir + "Limit_lb.png"));
        var rtImage = new JLabel(new ImageIcon(dir + "Limit_rt.png"));
        var rbImage = new JLabel(new ImageIcon(dir + "Limit_rb.png"));
        ltImage.setBounds(new Rectangle(new Point(0, 0), ltImage.getPreferredSize()));
        lbImage.setBounds(
                new Rectangle(new Point(0, height - lbImage.getPreferredSize().height), lbImage.getPreferredSize()));
        rtImage.setBounds(
                new Rectangle(new Point(width - rtImage.getPreferredSize().width, 0), rtImage.getPreferredSize()));
        rbImage.setBounds(new Rectangle(
                new Point(width - rtImage.getPreferredSize().width, height - lbImage.getPreferredSize().height),
                rbImage.getPreferredSize()));
        frame.add(ltImage);
        frame.add(lbImage);
        frame.add(rtImage);
        frame.add(rbImage);
        frame.pack();
        frame.setVisible(true);
    }
}
