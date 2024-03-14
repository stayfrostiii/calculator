
import javax.swing.*;

class CalcG extends JFrame
{
   public CalcG()
   {
      addButtons();
      addTextField();
      setLayout(null);
      setVisible(true);
      setSize(375, 500);
      setResizable(false); 
   }  
   
   void addButtons()
   {
      JButton num1 = new JButton("1");
      num1.setBounds(10, 130, 80, 50);
      add(num1);
      
      JButton num2 = new JButton("2");
      num2.setBounds(95, 130, 80, 50);
      add(num2);
      
      JButton num3 = new JButton("3");
      num3.setBounds(180, 130, 80, 50);
      add(num3);
      
      JButton num4 = new JButton("4");
      num4.setBounds(10, 185, 80, 50);
      add(num4);
      
      JButton num5 = new JButton("5");
      num5.setBounds(95, 185, 80, 50);
      add(num5);
      
      JButton num6 = new JButton("6");
      num6.setBounds(180, 185, 80, 50);
      add(num6);
      
      JButton num7 = new JButton("7");
      num7.setBounds(10, 240, 80, 50);
      add(num7);
      
      JButton num8 = new JButton("8");
      num8.setBounds(95, 240, 80, 50);
      add(num8);
      
      JButton num9 = new JButton("9");
      num9.setBounds(180, 240, 80, 50);
      add(num9);
      
      JButton num0 = new JButton("0");
      num0.setBounds(95, 295, 80, 50);
      add(num0);
   }
   
   void addTextField()
   {
      JTextField text = new JTextField(16);
      text.setBounds(10, 10, 100, 100);
      add(text); 
   }
}