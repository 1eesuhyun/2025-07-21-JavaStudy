package com.sist.thread;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *    public void aaa()
 *    {
 *       bbb();
 *    }
 *    public void bbb()
 *    {
 *    
 *    }
 *    
 */
// 상속을 받는다
// 한개를 움직여야하면 implements
public class 쓰레드_2 extends JFrame implements Runnable,ActionListener{
    JProgressBar bar1=new JProgressBar();
    JProgressBar bar2=new JProgressBar();
    JProgressBar bar3=new JProgressBar();
    JProgressBar bar4=new JProgressBar();
    JProgressBar bar5=new JProgressBar();
    JButton start=new JButton("Start");
    JButton end=new JButton("Exit");
    JLabel la1,la2,la3,la4,la5,la6;
    public 쓰레드_2()
    {
    	la1=new JLabel("금전운");
    	la2=new JLabel("로또운");
    	la3=new JLabel("애정운");
    	la4=new JLabel("건강운");
    	la5=new JLabel("사업운"); // 동기화 프로그램
    	la6=new JLabel("오늘의 운세",JLabel.CENTER);
    	
    	bar1.setMinimum(0);
    	bar1.setMaximum(100);
    	bar1.setForeground(Color.cyan);
    	bar1.setBackground(Color.white);
    	bar1.setStringPainted(true);
    	
    	bar2.setMinimum(0);
    	bar2.setMaximum(100);
    	bar2.setForeground(Color.cyan);
    	bar2.setBackground(Color.white);
    	bar2.setStringPainted(true);
    	
    	bar3.setMinimum(0);
    	bar3.setMaximum(100);
    	bar3.setForeground(Color.cyan);
    	bar3.setBackground(Color.white);
    	bar3.setStringPainted(true);
    	
    	bar4.setMinimum(0);
    	bar4.setMaximum(100);
    	bar4.setForeground(Color.cyan);
    	bar4.setBackground(Color.white);
    	bar4.setStringPainted(true);
    	
    	bar5.setMinimum(0);
    	bar5.setMaximum(100);
    	bar5.setForeground(Color.cyan);
    	bar5.setBackground(Color.white);
    	bar5.setStringPainted(true);
    	
    	setLayout(null);
    	la1.setBounds(10,15,570,35);
    	la1.setBounds(10, 60, 80, 30);
    	bar1.setBounds(95, 80, 515, 30);
    	add(la1);add(bar1);
    	
    	la2.setBounds(10, 100, 80, 30);
    	bar2.setBounds(95, 120, 515, 30);
    	add(la2);add(bar2);
    	
    	la3.setBounds(10, 140, 80, 30);
    	bar3.setBounds(95, 160, 515, 30);
    	add(la3);add(bar3);
    	
    	la4.setBounds(10, 180, 80, 30);
    	bar4.setBounds(95, 200, 515, 30);
    	add(la4);add(bar4);
    	
    	la5.setBounds(10, 220, 80, 50);
    	bar5.setBounds(95, 240, 515, 30);
    	add(la5);add(bar5);
    	
    	JPanel p=new JPanel();
    	p.add(start);p.add(end);
    	p.setBounds(10, 270, 570, 35);
    	add(p);
    	setSize(700,500);
    	setVisible(true);
    	start.addActionListener(this);
    	end.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 쓰레드_2();
	}
	// 쓰레드
	/*
	 *   start()
	 *   {
	 *       run()
	 *   }
	 */
	public void go()
	{
		int a=(int)(Math.random()*71)+30;
		int b=(int)(Math.random()*71)+30;
		int c=(int)(Math.random()*71)+30;
		int d=(int)(Math.random()*71)+30;
		int e=(int)(Math.random()*71)+30;
		
		for(int i=0;i<=a;i++)
		{
			bar1.setValue(i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
		for(int i=0;i<=a;i++)
		{
			bar2.setValue(i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
		for(int i=0;i<=a;i++)
		{
			bar3.setValue(i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
		for(int i=0;i<=a;i++)
		{
			bar4.setValue(i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
		for(int i=0;i<=a;i++)
		{
			bar5.setValue(i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
		{
			new Thread(this).start();
		}
		else if(e.getSource()==end)
		{
			dispose();
			System.exit(0);
		}
	}
}
