package OrdenCompra;
import java.util.Date;

public class OrdenCompra {
		private int id;
		private String descripcion;
		private Date fecha = new Date();
		private Cliente cliente;
		
		private Producto[] productos = new Producto[4];
		private int nroproducto = 0;
		
		public int sumaPrecios() {
			int aux = 0;
			for(int i = 0; i < 4; i++) {
				aux += productos[i].precio;
			}
			return aux;
		}
		
		public void addProducto (Producto producto) {
			if(nroproducto < 4) {
				productos[nroproducto]=producto;
				nroproducto++;
			}
			
		}
		
		public OrdenCompra(String descripcion) {
			super();
			this.descripcion = descripcion;
		}

		public int getId() {
			return id;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
			
		

}
