
import javax.swing.*;

class CalcG extends JFrame
{
   public CalcG()
   {
      addButtons();
      setLayout(null);
      setVisible(true);
      setSize(375, 500);
      setResizable(false); 
   }  
   
   void addButtons()
   {
      JButton num1 = new JButton("1");
      num1.setBounds(50, 100, 80, 45);
      add(num1);
      
      JButton num2 = new JButton("2");
      num2.setBounds(50, 150, 80, 45);
      add(num2);
      
//       JButton num3 = new JButton("3");
//       num1.setBounds(50, 100, 80, 45);
//       add(num3);
//       
//       JButton num4 = new JButton("4");
//       num1.setBounds(50, 100, 80, 45);
//       add(num4);
//       
//       JButton num5 = new JButton("5");
//       num1.setBounds(50, 100, 80, 45);
//       add(num5);
//       
//       JButton num6 = new JButton("6");
//       num1.setBounds(50, 100, 80, 45);
//       add(num6);
//       
//       JButton num7 = new JButton("7");
//       num1.setBounds(50, 100, 80, 45);
//       add(num7);
//       
//       JButton num8 = new JButton("8");
//       num1.setBounds(50, 100, 80, 45);
//       add(num8);
//       
//       JButton num9 = new JButton("9");
//       num1.setBounds(50, 100, 80, 45);
//       add(num9);
//       
//       JButton num0 = new JButton("0");
//       num1.setBounds(50, 100, 80, 45);
//       add(num0);
   }
}