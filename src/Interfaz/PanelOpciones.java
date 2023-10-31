package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelOpciones extends JPanel implements ActionListener
{
	
	private JButton btnNuevo;
	private JButton btnReiniciar;
	private JButton btntop10;
	private JButton btnCambiarJugador;
	
	
    private VentanaPrincipal principal;
    
    public PanelOpciones(VentanaPrincipal pPrincipal)
    {
        principal=pPrincipal;
        
        btnNuevo= new JButton( "NUEVO" );
        add(btnNuevo);
        btnReiniciar= new JButton( "REINICIAR" );
        add(btnReiniciar);
        btntop10= new JButton( "TOP - 10" );
        add(btntop10);
        btnCambiarJugador= new JButton( "CAMBIAR JUGADOR" );
        add(btnCambiarJugador);
        
        btnNuevo.addActionListener( this );
        btnNuevo.setActionCommand( "NUEVO" );
        
        btnReiniciar.addActionListener( this );
        btnReiniciar.setActionCommand( "REINICIAR" );
        
        btntop10.addActionListener( this );
        btntop10.setActionCommand( "MOSTRAR" );
        
        btnCambiarJugador.addActionListener( this );
        btnCambiarJugador.setActionCommand( "BUSCAR" );
        
        //btnOpcion1.setBackground( new Color(27,62,228) );
        //btnOpcion1.setForeground( Color.WHITE );
    }

    @Override
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "NUEVO" ))
        {
            principal.buscarObraPorNombre( );
        }
        else if (evento.getActionCommand( ).equals( "OPC1" ))
        {
            JOptionPane.showMessageDialog( principal, "se presionó opción 1" );
        }
        else if (evento.getActionCommand( ).equals( "OPC2" ))
        {
            JOptionPane.showMessageDialog( principal, "se presionó opción 2" );
        }
    }
    
}







    