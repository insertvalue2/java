package ch04;

// T 자료형에대한 제한을 지정할 수 있다. 
public class GenericPrinter<T extends Material> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	} 
	
	@Override
	public String toString() {
		return material.toString(); 
	}
	
	
}
