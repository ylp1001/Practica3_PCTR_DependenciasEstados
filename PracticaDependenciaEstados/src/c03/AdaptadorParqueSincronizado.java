package c03;

public class AdaptadorParqueSincronizado implements IParque{
	
	private IParque parque;
	private static AdaptadorParqueSincronizado instancia = new AdaptadorParqueSincronizado();
	
	private AdaptadorParqueSincronizado() {
		parque = new Parque();
	}
	
	public static AdaptadorParqueSincronizado getInstancia() {
		return instancia;
	}
	
	@Override
	public synchronized void entrarAlParque(String puerta) {
		parque.entrarAlParque(puerta);
	}
	
	//
	// TODO
	//
	
}
