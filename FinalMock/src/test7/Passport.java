package test7;

import java.util.Objects;

import test1.Student;

public class Passport {

	String name;
	String p_Id;

	public Passport(String name, String p_Id) {
		this.name = name;
		this.p_Id = p_Id;
	}

	public String getName() {
		return name;
	}

	public String getP_Id() {
		return p_Id;
	}

	@Override
	 public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Passport Pass = (Passport) obj;
        return p_Id.equals(Pass.p_Id) ;
    }
		
	 @Override
	    public int hashCode() {
	        return Objects.hash(p_Id);
	    }
	}


