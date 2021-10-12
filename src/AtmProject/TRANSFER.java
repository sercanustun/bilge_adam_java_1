package AtmProject;

public class TRANSFER extends Atm {
	protected String ali = "3520 4598724545";
	protected String veli = "5560 9887974565";
	protected String osman = "9845 75465787998";
	
	public TRANSFER() {
		super();
	}
	
	public TRANSFER(String ali, String veli, String osman) {
		super();
		this.ali = ali;
		this.veli = veli;
		this.osman = osman;
	}
	
	public String getAli() {
		return ali;
	}
	
	public String getVeli() {
		return veli;
	}
	
	public String getOsman() {
		return osman;
	}
	
	@Override
	public String toString() {
		return "TRANSFER [ali=" + ali + ", veli=" + veli + ", osman=" + osman + "]";
	}
}
