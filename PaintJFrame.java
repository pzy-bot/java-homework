package sanzuo6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintJFrame extends
{

    JRadioButton radiobutton_1,radiobutton_2;

    public PaintJFrame(){


        ;//����������

        this.setBounds(400,300,400,300);

        (EXIT_ON_CLOSE);//���ڹرհ�ť������

        this.getContentPane().add(new sanzuoye6.PaintJFrame.PaintCanvas());      //�����Զ��廭�����

        JPanel panel_radiobutton = new JPanel(); //���񲼾�

        this.add(panel_radiobutton,);




        ; //�����߼���ť��b

        radiobutton_1 = new ;//������ѡ��ť��ֱ�ߡ�����ʼ״̬ѡ��

        b.add(radiobutton_1);

        panel_radiobutton.add(radiobutton_1);



        radiobutton_2 = new ;//������ѡ��ť�����⡱

        b.add(radiobutton_2);

        panel_radiobutton.add(radiobutton_2);


        ;

    }



    //�����ڲ��࣬��Ӧ����¼�������ƶ��¼�

    class PaintCanvas extends Canvas implements ,

    {

        Point start, end, lastend;

        public PaintCanvas()

        {

            start=end=lastend=null;


            ;//ע������������ӿ�


            ;

        }

        public void(MouseEvent ev)            //��������¼�������
        {

            if () //��ֱ�߱�ѡ��

                start = new ;//������λ��ֵ

            if () //�����ⱻѡ��

                end = new ;//������λ��ֵ

        }

        public void (MouseEvent ev)               //�ͷ�����¼�������
        {

            if (){ //��ֱ�߱�ѡ��

                end = new ;//������λ��ֵ


                ;//�ػ�

            }

        }

        public void mouseClicked(MouseEvent ev) {}         //�������

        public void mouseEntered(MouseEvent ev) {}         //������

        public void mouseExited(MouseEvent ev) {}          //����뿪

        public void mouseMoved(MouseEvent ev){}          //�ƶ����

        public void
        (MouseEvent ev)            //�϶�����¼�������

        {

            if (){ //��ֱ�߱�ѡ��


                ; //���Լ���Ӧ����ʲô

                end = new ;//������λ��ֵ

            }

            if () {//�����ⱻѡ��


                ; //���Լ���Ӧ����ʲô

                end = new ;//������λ��ֵ

            }


            ;                                    //�����ػ�

        }



        public void
        //��Canvas����ͼ

        {

            if (){ //��ֱ�߱�ѡ��

                if (start!=null && lastend!=null){

                    g.setColor();

                    g.;//�ñ���ɫ���߼�����ԭ��

                    g.setColor(Color.blue);//���û�����ɫ

                    g.;//�����յ�ֱ��

                }

            }

            if () { //�����ⱻѡ��

                if (start!=null && end!=null)
                {

                    g.setColor(Color.blue);//���û�����ɫ

                    g.;//�����յ�ֱ��

                }

            }

        }

        public void update(Graphics g)                     //�������

        {

            paint(g);

        }

    }//PaintCanvas�����



    public static void main(String arg[])

    {

        new sanzuoye6.PaintJFrame();

    }

}
