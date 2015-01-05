package factoriaAbstracte2;

public class factoriaConcreta_Cotxe extends factoriaAbstracte {

	@Override
	public IVehicles getVehicle(String tipus, double pes) {
		
		return  new cotxe(tipus, pes);
	}
	
	

}
