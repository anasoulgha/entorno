import javax.swing.JOptionPane;

public class stock {

    public static void agragar_producto(String Producto, int Cantidad){
       
             JOptionPane.showMessageDialog(null, "De " + Producto + " has añadido " + Cantidad+" Unidades");
    }




    public static int Consulta( int Cantidad){
             return Cantidad;

    } 




    public static void Actualizar(int newCantidad){
       
             JOptionPane.showMessageDialog(null, "Cantidades De Stock actualizadas");
    }




    public static void main(String[] args) {
        

        JOptionPane.showMessageDialog(null, "Es necesario añadir un producto y su respectiva cantidad");

        String  Producto = JOptionPane.showInputDialog("Intoduce un producto");

        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantida: "));
        
        agragar_producto(Producto, Cantidad);



        boolean salir= true;
        while (salir) {
            
            int newCantidad= 0;

            int menu =Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción:\n" +
                "1. Consultar stock\n" +
                "2. Actualizar stock\n" +
                "3. Salir")); 
                
                 
            switch (menu) {
                
            
                case 1:
                    JOptionPane.showMessageDialog(null, "Tienes "+ Consulta(Cantidad) + " Unidades de " + Producto); 

                    break;
                case 2:
                
                    newCantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantida: "));
                    Cantidad = Cantidad + newCantidad;
                    Actualizar(newCantidad);
                    break;

                case 3:

                        salir = false;
                        break;

                default:

                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }

            
        }


    }
    
}
