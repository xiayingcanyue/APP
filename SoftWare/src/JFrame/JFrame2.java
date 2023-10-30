package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame2 extends JFrame {
    public JFrame2(){
        initJFrame();
        this.setVisible(true);
    }

    private void initJFrame() {
        this.setSize(1000, 1000);
        this.setTitle("面向对象");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 创建一个容器，并设置布局为 BoxLayout，并设置方向为垂直方向
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        ImageIcon image = new ImageIcon("D:\\Desktop\\SoftwareTask\\2.png");
        JLabel imageLabel = new JLabel(image);
        JLabel textLabel = new JLabel("面向对象体系结构类图");
        JLabel contentLabel = new JLabel("面向对象的方法就是利用抽象、封装等机制，借助于对象、类、继承、消息传递等概念进行软件系统构造的软件开发方法。");

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
