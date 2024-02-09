//package project;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
//import org.netbeans.*;
import java.awt.*;
class FlappyBird extends JFrame{
	FlappyBird(){
    setExtendedState(MAXIMIZED_BOTH);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Flappy Bird");
	/*
	JPanel panel=new JPanel();
	ImageIcon icon = new ImageIcon("Background.png");
    JLabel bg = new JLabel();
    bg.setIcon(icon);
    panel.add(bg);
	*/
	
	try{
	setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Background.png")))));
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JLabel p1=new JLabel();
	p1.setIcon(new ImageIcon("E:\\Java files\\project\\Pillar.png"));
	p1.setBounds(200,-100,120,430);
	p1.setBackground(Color.white);
	p1.setOpaque(false);
	
	JLabel p2=new JLabel();
	p2.setIcon(new ImageIcon("E:\\Java files\\project\\Pillar.png"));
	p2.setBounds(420,-5,120,430);
	p2.setBackground(Color.white);
	p2.setOpaque(false);
	
	JLabel p3=new JLabel();
	p3.setIcon(new ImageIcon("E:\\Java files\\project\\Pillar.png"));
	p3.setBounds(640,-120,120,430);
	p3.setBackground(Color.white);
	p3.setOpaque(false);
	
	JLabel p4=new JLabel();
	p4.setIcon(new ImageIcon("E:\\Java files\\project\\Pillar.png"));
	p4.setBounds(860,-160,120,430);
	p4.setBackground(Color.white);
	p4.setOpaque(false);
	
	JLabel p5=new JLabel();
	p5.setIcon(new ImageIcon("E:\\Java files\\project\\Pillar.png"));
	p5.setBounds(1080,-150,120,430);
	p5.setBackground(Color.white);
	p5.setOpaque(false);
	
	JLabel p6=new JLabel();
	p6.setIcon(new ImageIcon("E:\\Java files\\project\\Pillar.png"));
	p6.setBounds(1300,-10,120,430);
	p6.setBackground(Color.white);
	p6.setOpaque(false);
	
	
	//this.add(panel)
    this.add(p1);
	this.add(p2);
	this.add(p3);
	this.add(p4);
	this.add(p5);
	this.add(p6);
	ImageIcon img = new ImageIcon("E:\\Java files\\project\\OIP.jpeg");
    setIconImage(img.getImage());
	this.pack();
	setVisible(true);
	}
}
public class Game {
	public static void main(String[] args) {
		FlappyBird obj=new FlappyBird();
	}
} //Harsh commited to his branch