package mx.com.sgah.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.com.sgah.capadatos.domain.Movimiento;
import mx.com.sgah.capaservicio.MovimientoServiceI;

public class MovimientoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<Movimiento> lista;

	@Autowired
	MovimientoServiceI movimientoServiceI;
	
	@Action(value="/listar", results= {
		@Result(name="movimientos", location="/WEB-INF/content/movimientos.jsp")})
	public String listar() {
		lista = movimientoServiceI.listarMovimiento();
		return "movimientos";
	}
	
	
}
