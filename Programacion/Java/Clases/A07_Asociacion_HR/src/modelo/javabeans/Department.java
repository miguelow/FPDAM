package modelo.javabeans;

import java.util.Objects;

public class Department {
		
		private int departmentId;
		private String departmentName;
		private Location Location;
		
		public Department() {
		
		}

		public Department(int departmentId, String departmentName, modelo.javabeans.Location location) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
			Location = location;
		}

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Location getLocation() {
			return Location;
		}

		public void setLocation(Location location) {
			Location = location;
		}

		@Override
		public int hashCode() {
			return Objects.hash(departmentId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Department other = (Department) obj;
			return departmentId == other.departmentId;
		}

		@Override
		public String toString() {
			return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", Location="
					+ Location + ", getDepartmentId()=" + getDepartmentId() + ", getDepartmentName()="
					+ getDepartmentName() + ", getLocation()=" + getLocation() + ", hashCode()=" + hashCode()
					+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
		}
		
}
