package co.udea.empresariales.romanconverter.rest.impl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.udea.empresariales.romanconverter.RomanConversor;
import co.udea.empresariales.romanconverter.dto.RomanConversorD;
import co.udea.empresariales.romanconverter.rest.IRomanConversor;
import co.udea.empresariales.romanconverter.rest.WebServicePath;

@Path(WebServicePath.RomanConverterWSContext.ROOT_PATH)
@WebService(endpointInterface = "co.udea.empresariales.romanconverter.rest.IRomanConversor")
public class RomanConversorWebService implements IRomanConversor {
	
	private RomanConversor romanConversor = new RomanConversor();
	
	@Produces(value= {MediaType.APPLICATION_JSON})
	@GET()
	@Override
	public RomanConversorD convertToRomanNumber(
			@QueryParam(WebServicePath.RomanConverterWSContext.NUMBER_PARAM) int number){
		
		
		return (new RomanConversorD(
				this.romanConversor.convertNumber(number)));
	}
	

	
}
