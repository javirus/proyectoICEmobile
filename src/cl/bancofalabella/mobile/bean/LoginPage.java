package cl.bancofalabella.mobile.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "loginPage")
@ViewScoped
public class LoginPage implements Serializable {

	private static final long serialVersionUID = 1L;
	private String rutCliente;
	private String clave;

	public void ingresar(ActionEvent e) {
		System.out.println("rutCliente " + this.rutCliente);
		System.out.println("clave " + this.clave);
	}

	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}
