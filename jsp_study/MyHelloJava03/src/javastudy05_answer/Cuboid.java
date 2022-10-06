package javastudy05_answer;

import javastudy01.Rectangle;

public class Cuboid extends Rectangle {
	private int z;
	
	public Cuboid() {
		
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public int getCuboidVolume() {
		return getW() * getH() * z;
	}
}
