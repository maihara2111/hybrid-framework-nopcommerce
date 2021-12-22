package javaOOP;

public class Topic_06_Getter_Setter {
	// kiem tra/ validation dữ liệu được
	private String personName;
	private int personAge;
	private int personPhone;
	private float personBankAccountAmount;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		if (personName == null || personName.isEmpty()) {
			throw new IllegalArgumentException("Ten nhap vao ko hop le");
		} else {
			this.personName = personName;
		}
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {

		if (personAge > 15 && personAge < 60) {
			throw new IllegalArgumentException("Tuoi nhap vao ko hop le");
		} else {
			this.personAge = personAge;
		}
	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("SDT bat dau bang: 09-03-07-01-02");
		} else if (personPhone < 10 || personPhone > 11) {
			throw new IllegalArgumentException("SDT phai từ 10-11 số");
		} else {
			this.personPhone = personPhone;
		}
	}

	public float getPersonBankAccountAmount() {
		return personBankAccountAmount;
	}

	public void setPersonBankAccountAmount(float personBankAccountAmount) {
			this.personBankAccountAmount = personBankAccountAmount;
	}

}
