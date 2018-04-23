package paint.controller;

import java.util.ArrayList;
import java.util.List;

import paint.model.Shape;

public class Drawings {
	
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void addShape(Shape newShape) {
		shapes.add(0, newShape);
	}
	
	public void removeShape(Shape theshape) {
		for (Shape s : shapes) {
			if (s.getPosition().getX() == theshape.getPosition().getX() && s.getPosition().getY() == theshape.getPosition().getY())
				shapes.remove(s);
		}
	}
	
	public Shape selectShape(int x, int y) {
		for (Shape s : shapes) {
			if(s.select(x, y)) // select is still to be added to shapes
				return s;
		}
		return null;
	}

	public List<Shape> getShapes() {
		return shapes;
	}
	
}