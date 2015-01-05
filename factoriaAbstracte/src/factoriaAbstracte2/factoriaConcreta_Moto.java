package factoriaAbstracte2;

public class factoriaConcreta_Moto extends factoriaAbstracte {

	@Override
	public IVehicles getVehicle(String tipus, double pes) {
		// TODO Auto-generated method stub
		return new Moto(tipus, pes);
	}

	
	
}
