package paint.model;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractShape implements Shape, Cloneable {

	protected Point position;
	protected Point endPoint;
	protected Map<String, Double> properties;
	protected Color color = Color.BLUE;
	protected Color fillColor = Color.MAGENTA;
	
	@Override
	public void setPosition(Point position) {
		
		this.position = position;
	}

	@Override
	public Point getPosition() {

		return this.position;
	}
	
	@Override
	public void setProperties(Map<String, Double> properties) {
		
		this.properties = properties;
		
	}

	@Override
	public Map<String, Double> getProperties() {

		return this.properties;
	}

	@Override
	public void setColor(Color color) {
		
		this.color = color;
	}

	@Override
	public Color getColor() {

		return this.color;
	}

	@Override
	public void setFillColor(Color color) {
		
		this.fillColor = color;
	}

	@Override
	public Color getFillColor() {

		return fillColor;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
	public void move(Point newPostion) {
		
		setPosition(newPostion);
	}
	
	public void resize(double width, double height) {
		
		Map<String, Double> newProperties = new HashMap<String, Double>();
		newProperties.put("Width", width);
		newProperties.put("Height", height);
		setProperties(newProperties);
	}
}
