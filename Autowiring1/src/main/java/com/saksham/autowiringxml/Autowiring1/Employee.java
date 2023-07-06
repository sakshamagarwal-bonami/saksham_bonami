package com.saksham.autowiringxml.Autowiring1;

public class Employee {
	private Address address1;

	public Employee(Address address) {
		super();
		this.address1 = address;  
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address1 + "]";
	}

	public Address getAddress() {
		return address1;
	}

	public void setAddress(Address address) {
		this.address1 = address;
	}
}
