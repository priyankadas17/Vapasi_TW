package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class Furniture {
	String furnitureType;
	String furnitureMaterial;
	int noOfChair;
	int noOfRacks;
	int noOfTables;
	
	public Furniture(String furnitureType, String furnitureMaterial) {
		this.furnitureType = furnitureType;
		this.furnitureMaterial = furnitureMaterial;
	}
	
	public String getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}

	public String getFurnitureMaterial() {
		return furnitureMaterial;
	}

	public void setFurnitureMaterial(String furnitureMaterial) {
		this.furnitureMaterial = furnitureMaterial;
	}

	public int getNoOfChair() {
		return noOfChair;
	}

	public void setNoOfChair(int noOfChair) {
		this.noOfChair = noOfChair;
	}

	public int getNoOfRacks() {
		return noOfRacks;
	}

	public void setNoOfRacks() {
		this.noOfRacks++;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables() {
		this.noOfTables++;
	}
	
	
}
