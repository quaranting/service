package ing.microservice.esb.backend.services;

public class Client {

	private String id = "C2fwnZfdqtCISbcc+bpuWHMwGNOoTp1R6eq26/hH1uw=";
	private String name = "JOSE TOMAS";
	private String firstSurname = "JOHANSSON";
	private String secondSurname = "RUBIO";
	private String documentNumber = "71010681K";
	private String documentType = "0";
	private String birthDate = "01/01/1978";
	private String createClientDate = "07/10/2002";
	private String personId = "1010681";
	private String typeDescription = "Operativo";
	private String typeCode = "5";
	private String genderCode = "H";
	private String genderDesc = "HOMBRE";
	private String nationality = "ESPA[0xc3][0x91]A";

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String id, String name, String firstSurname, String secondSurname, String documentNumber,
			String documentType, String birthDate, String createClientDate, String personId, String typeDescription,
			String typeCode, String genderCode, String genderDesc, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
		this.documentNumber = documentNumber;
		this.documentType = documentType;
		this.birthDate = birthDate;
		this.createClientDate = createClientDate;
		this.personId = personId;
		this.typeDescription = typeDescription;
		this.typeCode = typeCode;
		this.genderCode = genderCode;
		this.genderDesc = genderDesc;
		this.nationality = nationality;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCreateClientDate() {
		return createClientDate;
	}

	public void setCreateClientDate(String createClientDate) {
		this.createClientDate = createClientDate;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderDesc() {
		return genderDesc;
	}

	public void setGenderDesc(String genderDesc) {
		this.genderDesc = genderDesc;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
