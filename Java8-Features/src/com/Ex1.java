package com;

/**
 * 
 * 	Interface with default & static methods
 * 
 */

interface Scalable {
	double DEFAULT_SCALE = 1.0;

	// implicitly public abstract
	void setScale(double scale);

	default void resetScale() {
		setScale(DEFAULT_SCALE);
	}

	// implicitly public
	static boolean isScalable(Object obj) {
		return obj instanceof Scalable;
	}

}

class SquareBox implements Scalable {
	@Override
	public void setScale(double scale) {
		// ..
	}
}

class RecBox implements Scalable {
	@Override
	public void setScale(double scale) {
		// ..
	}
}

public class Ex1 {

	public static void main(String[] args) {

		SquareBox squareBox = new SquareBox();
		boolean b = Scalable.isScalable(squareBox);

	}
}
