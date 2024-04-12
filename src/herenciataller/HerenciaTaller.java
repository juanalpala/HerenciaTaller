package herenciataller;
import javax.swing.JOptionPane;

public class HerenciaTaller {

    public static void main(String[] args) {
        
        boolean a=true;
        while(a){
        
        String menu="    SELECCIONE UNA OPCION  \n"+
                "1. Empleado \n"+
                "2. Cliente \n"+
                "3. Salir del programa";
       
        String opMenu=JOptionPane.showInputDialog(menu);
        int opcion = Integer.parseInt(opMenu);
        
        
        switch (opcion) {
        
            case 1:
                
                String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                int edadEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado"));
                double salarioEmpleado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese  el salario del empleado"));
               
                
                JOptionPane.showMessageDialog(null,"El nombre del empleado es : "+nombreEmpleado+
                        "\n La edad del empleado es : "+edadEmpleado+
                        "\n El salario del empleado es : "+salarioEmpleado);
                
                break;
            case 2:
                String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                int edadCliente= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente"));
                String direccionCliente=JOptionPane.showInputDialog("Ingrese direccion del cliente");
                
                JOptionPane.showMessageDialog(null,"El nombre del cliente es : "+nombreCliente+
                        "\n La edad del cliente es : "+edadCliente+
                        "\n La direccion del cliente es : "+direccionCliente);
                
                break;
                
            case 3:
                a=false;
                break;
            
       
        } 
        }  
    } 
}
   