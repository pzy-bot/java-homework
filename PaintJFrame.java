//package sanzuo6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintJFrame extends
{

    JRadioButton radiobutton_1,radiobutton_2;

    public PaintJFrame(){


        ;//标题栏内容

        this.setBounds(400,300,400,300);

        (EXIT_ON_CLOSE);//窗口关闭按钮的设置

        this.getContentPane().add(new sanzuoye6.PaintJFrame.PaintCanvas());      //创建自定义画布组件

        JPanel panel_radiobutton = new JPanel(); //网格布局

        this.add(panel_radiobutton,);




        ; //定义逻辑按钮组b

        radiobutton_1 = new ;//创建单选按钮“直线”，初始状态选中

        b.add(radiobutton_1);

        panel_radiobutton.add(radiobutton_1);



        radiobutton_2 = new ;//创建单选按钮“任意”

        b.add(radiobutton_2);

        panel_radiobutton.add(radiobutton_2);


        ;

    }



    //画布内部类，响应鼠标事件和鼠标移动事件

    class PaintCanvas extends Canvas implements ,

    {

        Point start, end, lastend;

        public PaintCanvas()

        {

            start=end=lastend=null;


            ;//注册上面的两个接口


            ;

        }

        public void(MouseEvent ev)            //按下鼠标事件处理方法
        {

            if () //当直线被选中

                start = new ;//获得鼠标位置值

            if () //当任意被选中

                end = new ;//获得鼠标位置值

        }

        public void (MouseEvent ev)               //释放鼠标事件处理方法
        {

            if (){ //当直线被选中

                end = new ;//获得鼠标位置值


                ;//重画

            }

        }

        public void mouseClicked(MouseEvent ev) {}         //单击鼠标

        public void mouseEntered(MouseEvent ev) {}         //鼠标进入

        public void mouseExited(MouseEvent ev) {}          //鼠标离开

        public void mouseMoved(MouseEvent ev){}          //移动鼠标

        public void
        (MouseEvent ev)            //拖动鼠标事件处理方法

        {

            if (){ //当直线被选中


                ; //请自己想应该填什么

                end = new ;//获得鼠标位置值

            }

            if () {//当任意被选中


                ; //请自己想应该填什么

                end = new ;//获得鼠标位置值

            }


            ;                                    //调用重画

        }



        public void
        //在Canvas上作图

        {

            if (){ //当直线被选中

                if (start!=null && lastend!=null){

                    g.setColor();

                    g.;//用背景色画线即擦除原线

                    g.setColor(Color.blue);//设置画线颜色

                    g.;//画最终的直线

                }

            }

            if () { //当任意被选中

                if (start!=null && end!=null)
                {

                    g.setColor(Color.blue);//设置画线颜色

                    g.;//画最终的直线

                }

            }

        }

        public void update(Graphics g)                     //更新组件

        {

            paint(g);

        }

    }//PaintCanvas类结束



    public static void main(String arg[])

    {

        new sanzuoye6.PaintJFrame();

    }

}
