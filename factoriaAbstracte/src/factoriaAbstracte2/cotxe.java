package factoriaAbstracte2;

public class cotxe implements IVehicles {

	private double pes;
	public cotxe(String tipus, double pes){
	
		this.pes = pes;
		
	}
	
	
	@Override
	public String getTipus() {
		// TODO Auto-generated method stub
		return "cotxe";
	}

	@Override
	public double getPes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
