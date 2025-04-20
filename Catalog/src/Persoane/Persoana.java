package Persoane;

public class Persoana implements Contact{
    protected String Nume;
    protected String Prenume;
    protected String Email;
    protected String OfficialEmail;
    protected String PhoneNumber;

    public Persoana() {
    }

    public Persoana(String nume, String prenume, String email, String officialEmail, String phoneNumber) {
        Nume = nume;
        Prenume = prenume;
        Email = email;
        OfficialEmail = officialEmail;
        PhoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setOfficialEmail(String officialEmail) {
        OfficialEmail = officialEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getNume() {
        return Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    @Override
    public String getOfficialEmail() {
        return OfficialEmail;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
