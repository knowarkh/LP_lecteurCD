package ihm;
import javax.swing.*;
import java.awt.*;
import datas.*;
public class FramLectCD extends JFrame{

	JButton onOFF;
	JButton stop;
	JButton play;
	JButton next;
	JButton previous;
	JTextField tt;
	JTextField nbP;
	JTextField pl;
	JTextField des;
	JTextField t;
	LecteurCD monLect;

	public FramLectCD(){

		super("LecteurCD");
		monLect = new LecteurCD(); 
		this.miseEnPlaceDecor();
		this.attacherReactions();
		this.setSize(1000,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void miseEnPlaceDecor(){
		this.setLayout(new GridLayout(3,1));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		jp1.setLayout(new GridLayout(3,2));
		onOFF = new JButton("ChargeurCD-ON");
		JPanel pan1 = new JPanel();
		JLabel jl1 = new JLabel("Temps total");
		tt = new JTextField();
		tt.setEditable(false);
		tt.setBackground(new Color(51,190,255));
		JLabel jl2 = new JLabel("Nbre de plages");
		nbP = new JTextField();
		nbP.setEditable(false);
		nbP.setBackground(new Color(51,190,255));
		jp1.add(onOFF);
		jp1.add(pan1);
		jp1.add(jl1);
		jp1.add(tt);
		jp1.add(jl2);
		jp1.add(nbP);
		jp2.setLayout(new BorderLayout());
		pl = new JTextField();
		pl.setEditable(false);
		pl.setPreferredSize(new Dimension(150, 30));
		pl.setHorizontalAlignment(JTextField.CENTER);
		pl.setBackground(new Color(255,246,51));
		des = new JTextField();
		des.setHorizontalAlignment(JTextField.CENTER);
		des.setEditable(false);
		des.setBackground(new Color(255,246,51));
		t = new JTextField();
		t.setPreferredSize(new Dimension(150, 30));
		t.setHorizontalAlignment(JTextField.CENTER);
		t.setEditable(false);
		t.setBackground(new Color(255,246,51));
		jp2.add(pl,BorderLayout.WEST);
		jp2.add(des,BorderLayout.CENTER);
		jp2.add(t,BorderLayout.EAST);
		jp3.setLayout(new GridLayout(1,4));
		stop = new JButton("STOP");
		play = new JButton("PLAY");
		next = new JButton("NEXT");
		previous = new JButton("PREVIOUS");
		jp3.add(stop);
		jp3.add(play);
		jp3.add(next);
		jp3.add(previous);
	}

	private void attacherReactions(){
		this.onOFF.addActionListener(new MyMouseListener(this));
		//TODO
	}

	//5 geters à faire
	public JButton getOnOFF(){
		return this.onOFF;
	}

	public JButton getStop(){
		return this.stop;
	}

	public JButton get

	public static void main (String[] args){
		FramLectCD maFrame = new FramLectCD();
	}
}