package starcraft.units.terran;

import starcraft.units.Unit;

public class TerranUnit extends Unit{
	private boolean repairable;		// 고칠수 있는 유닛인가?

	public TerranUnit(boolean repairable) {
		super();
		this.repairable = repairable;
	}

	public boolean isRepairable() {
		return repairable;
	}

	public void setRepairable(boolean repairable) {
		this.repairable = repairable;
	}
	
}
