package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame4 extends JFrame {
    public JFrame4(){
        initJFrame();
        this.setVisible(true);
    }

    private void initJFrame() {
        this.setSize(1000, 1000);
        this.setTitle("管道-过滤");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        // 创建一个容器，并设置布局为 BoxLayout，并设置方向为垂直方向
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        ImageIcon image = new ImageIcon("D:\\Desktop\\SoftwareTask\\4.png");
        JLabel imageLabel = new JLabel(image);
        JLabel textLabel = new JLabel("管道-过滤器体系结构类图");
        JLabel contentLabel = new JLabel("Pipes and Filters是面向数据流的软件体系结构，它为处理数据流的系统提供了一种结构。单步数据处理封装在一个过滤器中，数据在过滤器之间的管道传输。");

        //调节字体大小
        Font textFont = textLabel.getFont();
        textFont = textFont.deriveFont(Font.BOLD, 24);  // 设置为粗体，字号为 24
        textLabel.setFont(textFont);
        Font contentFont = contentLabel.getFont();
        contentFont = contentFont.deriveFont(Font.BOLD, 18);  // 设置为粗体，字号为 24
        contentLabel.setFont(contentFont);
        //添加contentLabel到容器中
        contentLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(contentLabel);
        // 添加imageLabel到容器中
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(imageLabel);
        // 添加label到容器中，并设置组件的对齐方式为居中对齐
        textLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(textLabel);

        this.add(container, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
