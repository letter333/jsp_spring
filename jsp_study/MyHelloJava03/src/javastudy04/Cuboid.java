package javastudy04;

import javastudy01.Rectangle;

public class Cuboid extends Rectangle {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		if(z <= 0) {
			System.out.println("z값 잘못입력.");
			z = 0;
			return;
		}
		this.z = z;
	}
	
	public int getCuboidVolumn() {
		return this.getW() * this.getH() * this.z;
	}
}
