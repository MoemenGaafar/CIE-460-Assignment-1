/**
 * 
 */
package geometric;

/**
 * @author LENOVO
 *
 */
public abstract class ThreeDimensionalShape extends Shape {
	
	private int centerZ;
	
	// For a three dimensional shape, we should be able to calculate the volume.
	public abstract int getVolume();
	
	/*
	 * Setter and Getter
	 */
	public void setCenterZ(int z) {
		centerZ = z;
	}
	
	public int getCenterZ() {
		return centerZ;
	}
}
