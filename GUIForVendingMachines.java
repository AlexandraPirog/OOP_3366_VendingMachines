package VendingMachines;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUIForVendingMachines extends JFrame {
    //кнопки,надписи и т.п.
    private JButton button = new JButton("Выбрать");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введите номер товара: ");
    private JRadioButton radio1 = new JRadioButton("Добавить сахар");
    private JRadioButton radio2 = new JRadioButton("Без сахара");
    private JCheckBox check = new JCheckBox("Подтвердить", false);
    //Конструктор консоли
    public GUIForVendingMachines(){
        super("Добро пожаловать!");
        this.setBounds(100,100,250,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Приятного аппетита!\n";
            message += "Вы выбрали товар № "+ input.getText()+ "\n";
            message += radio1.isSelected() ? "С сахаром" : "Без сахара\n";
            message += ((check.isSelected())? "Подтверждено":"Не подтверждено\n");
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
