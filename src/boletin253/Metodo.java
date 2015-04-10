
package boletin253;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sbenavidesvazquez
 */
public class Metodo implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton bSaudo,bDespedida;
    JLabel etiq;
    
    public void Ventana(){
        
     marco=new JFrame("saudo e despedida");
     panel=new JPanel();
     bSaudo=new JButton("Saudo");
     bDespedida=new JButton("Despedida");
     etiq=new JLabel();
     
     panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
     
     panel.add(bDespedida);
     panel.add(bSaudo);
     panel.add(etiq);
     marco.add(panel);
     marco.setSize(400, 150);
     
     bSaudo.addActionListener(this);
     bDespedida.addActionListener(this);
     
     marco.setVisible(true);
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(bSaudo==e.getSource())
            etiq.setText("En saludo a DAM");
        else if(bDespedida==e.getSource())
            etiq.setText("fin do programa");
    }
    
}
