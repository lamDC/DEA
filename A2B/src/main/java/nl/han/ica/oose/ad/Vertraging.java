package nl.han.ica.oose.ad;

public class Vertraging {

	private int vertragingstijd;
	
	public Vertraging(int tijd) {
		vertragingstijd = tijd;
	}
	
	public int getExtraReistijd() {
		return vertragingstijd;
	}
}
