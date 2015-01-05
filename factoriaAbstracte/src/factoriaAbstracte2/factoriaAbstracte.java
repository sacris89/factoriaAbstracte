package factoriaAbstracte2;

import java.io.ObjectInputStream.GetField;



public abstract class factoriaAbstracte {

	public static IVehicles crearVehicle( String tipus,double pes )	throws Exception {
		
		
		factoriaAbstracte factoria;
		try {
			 factoria =  (factoriaAbstracte) Class.forName("factoriaAbstracte2.factoriaConcreta_"+tipus).newInstance();
				IVehicles retorn =  factoria.getVehicle(tipus,pes) ;
				return  retorn;
		} catch (Exception e) {
			factoriaConcreta_Desconegut desconegut = new factoriaConcreta_Desconegut();
			return desconegut.getVehicle(tipus, pes) ;
		
			
			
			// TODO: handle exception
		}
	}
	
	public abstract IVehicles getVehicle(String tipus,double pes);
	
	
}
