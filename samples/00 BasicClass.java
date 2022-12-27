public class Student {

	private int id;
	private String name;
	private boolean isSmart;
	private double feeAmount;
	
	
	/*
	 * To print contents of Student object instead of class name
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", isSmart=" + isSmart + ", feeAmount=" + feeAmount + "]";
	}

	/*
	 * An algorithm to generate hashcode so that 
	 * hashcode of each object for a given class is unique
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(feeAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + (isSmart ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * We are comparing the contents of Student object not the references
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(feeAmount) != Double.doubleToLongBits(other.feeAmount))
			return false;
		if (id != other.id)
			return false;
		if (isSmart != other.isSmart)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isSmart() {
		return isSmart;
	}



	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}



	public double getFeeAmount() {
		return feeAmount;
	}



	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}



	public static void main(String[] args) {
		

	}

}
