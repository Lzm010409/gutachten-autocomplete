package lukegoll.gutachten_autocomplete.itextpdf;

import java.util.ArrayList;

public enum ReadCoordinates {

	AS(25, 650, 200, 32), TEL(25, 638, 100, 15), MAIL(150, 635, 200, 15), ADATUM(300, 782, 260, 23),
	SDATUMORT(300, 759, 260, 23), GNUMMER(300, 736, 260, 23), SNUMMER(300, 713, 260, 23),
	KENNZEICHENUG(300, 690, 260, 23), BORT(25, 582, 270, 35), BDATUM(300, 582, 270, 35), BUHRZEIT(300, 569, 270, 13),
	BANWESEND(300, 549, 270, 13), AP(25, 548, 200, 15), KENNZEICHEN(25, 531, 200, 13), FART(25, 514, 200, 13),
	FHERSTELLER(25, 497, 200, 13), FTYP(25, 480, 200, 13), FHSN(25, 463, 200, 13), FPAPIERE(25, 446, 200, 13),
	FIN(25, 429, 200, 13), FERSTZUL(25, 412, 200, 13), FLETZTZUL(25, 395, 200, 13), FLEISTUNG(25, 378, 200, 13),
	FHUBRAUM(25, 361, 200, 13), FHU(25, 361, 200, 13), FSP(25, 361, 200, 13), FKILOMETER(300, 518, 200, 25),
	FFARBE(300, 503, 230, 13), FVBEREIFUNG(300, 486, 200, 13), FHBEREIFUNG(300, 469, 200, 13),
	FREIFENHERSTELLER(300, 452, 200, 13), FPROFILTIEFE(300, 435, 200, 13), FANTRIEBSART(300, 418, 200, 13),
	FUMWELTPLAKETTE(300, 399, 200, 13), FKRAFTSTOFF(300, 382, 200, 13), FSCHADSTOFFKLASSE(300, 365, 200, 13),
	FALLGZUSTAND(300, 348, 200, 13), FKARRZUSTAND(300, 331, 200, 13), FLACKZUSTAND(300, 314, 200, 13),
	FBZUSTAND(300, 314, 200, 13), FAUSSTATTUNG(25, 250, 270, 60), NBEHVORSCHADEN(25, 182, 270, 75),
	NOTIZEN(25, 30, 530, 120), SCHADENHERGANG(300, 266, 270, 45), PLAUSIBILITÄT(300, 251, 270, 15),
	BEHVORSCHADEN(300, 196, 270, 45), SCHICHTDICKENMESSUNG(300, 166, 270, 15), DEFAULT(0, 0, 595, 841);

	float first, second, third, fourth;
	
	ReadCoordinates(float i, float j, float k, float l) {
		// TODO Auto-generated constructor stub
		this.first = i;
		this.second = j;
		this.third = k;
		this.fourth = l;
		

	}

	/**
	 * @return the first
	 */
	public float getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(float first) {
		this.first = first;
	}

	/**
	 * @return the second
	 */
	public float getSecond() {
		return second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(float second) {
		this.second = second;
	}

	/**
	 * @return the third
	 */
	public float getThird() {
		return third;
	}

	/**
	 * @param third the third to set
	 */
	public void setThird(float third) {
		this.third = third;
	}

	/**
	 * @return the fourth
	 */
	public float getFourth() {
		return fourth;
	}

	/**
	 * @param fourth the fourth to set
	 */
	public void setFourth(float fourth) {
		this.fourth = fourth;
	}
	


}
