import java.awt.*;
import java.awt.event.*;
//import java.awt.Color;

class TestLabelEvent extends Frame implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	Button bt1,bt2,bt3,bt4;
	TestLabelEvent()
	{
		l1 = new Label("text field");
		//l2 = new Label("Output Text");
		t1 = new TextField();
		//t2 = new TextField();
		bt1 = new Button("black");
		bt2 = new Button("red");
		bt3 = new Button("yellow");
		bt4 = new Button("Green");

		l1.setBounds(50,100,100,30);
		//l2.setBounds(50,150,100,30);
		t1.setBounds(150,100,100,30);
		//t2.setBounds(150,150,100,30);
		bt1.setBounds(150,200,80,30);
		bt2.setBounds(250,200,80,30);
		bt3.setBounds(350,200,80,30);
		bt4.setBounds(450,200,80,30);
		setSize(400,400);
		add(l1);
		//add(l2);
		add(t1);
		//add(t2);
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob = e.getSource();
		if(ob == bt1)
		{
                Color color = Color.BLACK;
                t1.setBackground(color);
		}
		if(ob == bt2)
		{
                Color color = Color.RED;
                t1.setBackground(color);
		}
		if(ob == bt3)
		{
                Color color = Color.YELLOW;
                t1.setBackground(color);
		}
		if(ob == bt4)
		{
                Color color = Color.GREEN;
                t1.setBackground(color);
		}

	}
	public static void main(String args[])
	{
		new TestLabelEvent();
	}
}
		
		