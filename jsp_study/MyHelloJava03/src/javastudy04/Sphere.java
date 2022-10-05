package javastudy04;

import javastudy02.Circle;

public class Sphere extends Circle {
	
	public Sphere(int r) {
		super(r);
	}

	public double getVolume() {
		return (4.0 / 3.0) * Sphere.getPI() * Math.pow(this.getR(), 3);
	}
}
