
package consultorio;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class imagenfondo extends JPanel {

public void dibuja(Graphics x){
Dimension tam=getSize();
ImageIcon imagen=new ImageIcon(new ImageIcon(getClass().getResource("/im24.jpg")).getImage());
x.drawImage(imagen.getImage(),0,0,tam.width,tam.height,this);

}
    
}

//por el grupo de sonia, camilo  y carlos para construccion de software EAN
//fuente https://www.youtube.com/watch?v=5HGMZ5jIDDQ