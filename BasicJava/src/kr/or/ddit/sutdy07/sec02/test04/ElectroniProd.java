package kr.or.ddit.sutdy07.sec02.test04;

public class ElectroniProd extends Prod{
	

	private int voltage;
	int consumption;

	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public int getConsumption() {
		return consumption;
	}
	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}
	@Override
	public String toString() {
		return "ElectroniProd [전압=" + getVoltage() + ", 소비량=" + getConsumption() + "]";
	}

}
