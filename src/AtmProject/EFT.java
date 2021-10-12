package AtmProject;

public class EFT extends Atm {
	protected String aliIsbank = "TR74985716456465645645";
	protected String veliZiraat = "TR65456541233125644869";
	protected String osmanHalk = "TR56564451213265462132";
	
	public EFT() {
		super();
	}
	
	public EFT(String aliIsbank, String veliZiraat, String osmanHalk) {
		super();
		this.aliIsbank = aliIsbank;
		this.veliZiraat = veliZiraat;
		this.osmanHalk = osmanHalk;
	}
	
	public String getAliIsbank() {
		return aliIsbank;
	}
	
	public String getVeliZiraat() {
		return veliZiraat;
	}
	
	public String getOsmanHalk() {
		return osmanHalk;
	}
	
	@Override
	public String toString() {
		return "EFT [aliIsbank=" + aliIsbank + ", veliZiraat=" + veliZiraat + ", osmanHalk=" + osmanHalk + "]";
	}
}
