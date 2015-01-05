package factoriaAbstracte2;

public class Moto implements IVehicles {

	private double pes;
	public Moto (String tipus, double pes){
		this.pes = pes;
		
	}
	
	@Override
	public String getTipus() {
		// TODO Auto-generated method stub
		return "MOTO";
	}

	@Override
	public double getPes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
