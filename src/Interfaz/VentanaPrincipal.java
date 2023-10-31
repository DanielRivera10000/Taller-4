package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import uniandes.dpoo.taller4.modelo.Tablero;





public class VentanaPrincipal extends JFrame

{
	private PanelJuego panelLuces;
	private PanelDificultad panelArriba;
	private PanelOpciones panelDerecha;
	private PanelResultado panelAbajo;
	
	
	public VentanaPrincipal()
	{
		setSize( 750, 600 );
        setTitle( "LightsOut" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
        setLayout(new BorderLayout( ) );
        
        panelDerecha= new PanelOpciones();
        add(panelDerecha, BorderLayout.EAST);
        
        panelAbajo = new PanelResultado();
        add(panelAbajo, BorderLayout.SOUTH);
        
        panelArriba = new PanelDificultad( );
        add(panelArriba, BorderLayout.NORTH);
        
        
        Tablero tablero = new Tablero( 9 );
        panelLuces = new PanelJuego( tablero.darTablero( ) );
        add(panelLuces, BorderLayout.WEST);
        
	}
	
	
    public void dispose()
    {
        JOptionPane.showMessageDialog( this, "se guardó la aplicación" );
        System.exit( 0 );
    }
    
    public static void main(String[] args)
    {
        VentanaPrincipal ventana = new VentanaPrincipal( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
	
    
 











