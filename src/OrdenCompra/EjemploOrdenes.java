package OrdenCompra;

import java.util.Date;

public class EjemploOrdenes {

	public static void main(String[] args) {
		
		Producto pantalla = new Producto("LG ","Pantalla Tactil ", 200000);
		Producto mouse = new Producto("Logitech ", "Gaming pro ", 12000);
		Producto teclado = new Producto("Razer ", "Gaming RGB ", 15000);
		Producto gabinete = new Producto("Aorus ", "Gabinete Refrigeracion Liquida ", 16000);
		Producto webcam = new Producto("Logitech ", "WebCam ", 4000);
		Producto parlantes = new Producto("Aorus ", "Parlantes ", 6000);
		Producto silla = new Producto("Corsair ", "390 ", 215000);
		
		
		Cliente cliente1 = new Cliente("Agustin", "Avella");
		Cliente cliente2 = new Cliente("Juan Manuel","San Marco");
		Cliente cliente3 = new Cliente("Julian", "Rojas");
		
		OrdenCompra orden1= new OrdenCompra("Orden1");
		orden1.setCliente(cliente1);
		System.out.println(orden1.getCliente().getNombre()+" "+orden1.getCliente().getApellido());
		System.out.println(orden1.getFecha());
		System.out.println(pantalla.getNombre()+" "+pantalla.getFabricante()+pantalla.getPrecio());
		System.out.println(teclado.getNombre()+" "+teclado.getFabricante()+" "+pantalla.getPrecio());
		System.out.println(mouse.getNombre()+" "+mouse.getFabricante()+mouse.getPrecio());
		System.out.println(gabinete.getNombre()+" "+gabinete.getFabricante()+" "+gabinete.getPrecio());
		orden1.addProducto(pantalla);
		orden1.addProducto(mouse);
		orden1.addProducto(teclado);
		orden1.addProducto(gabinete);
		
		System.out.println(orden1.sumaPrecios());
		
		
		
		OrdenCompra orden2= new OrdenCompra("Orden2");
		orden2.setCliente(cliente2);
		System.out.println(orden2.getCliente().getNombre()+" "+orden2.getCliente().getApellido());
		System.out.println(orden2.getFecha());
		System.out.println(webcam.getNombre()+" "+webcam.getFabricante()+webcam.getPrecio());
		System.out.println(parlantes.getNombre()+" "+parlantes.getFabricante()+" "+parlantes.getPrecio());
		System.out.println(mouse.getNombre()+" "+mouse.getFabricante()+mouse.getPrecio());
		System.out.println(gabinete.getNombre()+" "+gabinete.getFabricante()+" "+gabinete.getPrecio());
		orden2.setFecha(new Date());
		orden2.addProducto(gabinete);
		orden2.addProducto(mouse);
		orden2.addProducto(parlantes);
		orden2.addProducto(webcam);
		orden2.sumaPrecios();
		
		OrdenCompra orden3 = new OrdenCompra("Orden3");
		orden3.setCliente(cliente3);
		System.out.println(orden3.getCliente().getNombre()+" "+orden3.getCliente().getApellido());
		System.out.println(orden3.getFecha());
		System.out.println(silla.getNombre()+" "+silla.getFabricante()+silla.getPrecio());
		System.out.println(teclado.getNombre()+" "+teclado.getFabricante()+" "+pantalla.getPrecio());
		System.out.println(mouse.getNombre()+" "+mouse.getFabricante()+mouse.getPrecio());
		System.out.println(gabinete.getNombre()+" "+gabinete.getFabricante()+" "+gabinete.getPrecio());
		orden3.setCliente(cliente3);
		orden3.addProducto(silla);
		orden3.addProducto(teclado);
		orden3.addProducto(mouse);
		orden3.addProducto(gabinete);
		orden3.sumaPrecios();
		
	}

}
