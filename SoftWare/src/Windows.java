import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import JFrame.*;

public class Windows extends JFrame {
    //创建按钮
    JButton button1 = new JButton("主程序-子程序");
    JButton button2 = new JButton("面向对象");
    JButton button3 = new JButton("事件系统");
    JButton button4 = new JButton("管道-过滤");

    public Windows(){
        initJFrame();
        this.setVisible(true);
    }

    public void initJFrame(){
        this.setSize(600, 500);
        this.setTitle("经典软件体系结构教学软件");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        button1.setBounds(100,100,150,50);
        button2.setBounds(300,100,150,50);
        button3.setBounds(100,300,150,50);
        button4.setBounds(300,300,150,50);


        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame1 jFrame1 = new JFrame1();

                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Desktop\\SoftwareTask\\KWIC\\src\\")});
                    Class<?> myClass = classLoader.loadClass("KWIC1.KWIC1");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                File file = new File(".\\src\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame jFrame2 = new JFrame2();
                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Desktop\\SoftwareTask\\KWIC\\src\\")});
                    Class<?> myClass = classLoader.loadClass("KWIC2.Main");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                File file = new File(".\\src\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame jFrame3 = new JFrame3();
                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Desktop\\SoftwareTask\\KWIC\\src\\")});
                    Class<?> myClass = classLoader.loadClass("KWIC3.Main");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                File file = new File(".\\src\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame jFrame4 = new JFrame4();
                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Desktop\\SoftwareTask\\KWIC\\src\\")});
                    Class<?> myClass = classLoader.loadClass("KWIC4.Main");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                File file = new File(".\\src\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}
