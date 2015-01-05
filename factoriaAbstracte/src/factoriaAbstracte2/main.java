package factoriaAbstracte2;

public class main {

	public static void main(String[] args) {
	try {
	
		
	IVehicles tipus =	factoriaAbstracte.crearVehicle("Desconegut22ds", 24);
	
	System.out.println( tipus.getTipus());
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
