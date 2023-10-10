package com.app.geometry;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "Point(" + x + ", " + y + ")";
	}

	public boolean isEqual(Point2D p2) {
		if (this.x == p2.x && this.y == p2.y)
			return true;
		else
			return false;
	}

	public double calculateDistance(Point2D other) {
		double xDiff = this.x - other.x;
		double yDiff = this.y - other.y;
		return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
	}

}
