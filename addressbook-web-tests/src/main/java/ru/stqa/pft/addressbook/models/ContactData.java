package ru.stqa.pft.addressbook.models;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String email;
    private final String fax;

    public static ContactData getDefaultData() {
       return new ContactData("TestName",
                               "TestMiddleName",
                               "TestLastName",
                               "TestNickName",
                               "TestTitle",
                               "TestCompany",
                               "TestAddress",
                               "999999",
                               "+79277777777",
                               "873777",
                               "test@test.ts",
                               "777777");
    }

    public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company, String address, String home, String mobile, String work, String email, String fax) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.email = email;
        this.fax = fax;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getEmail() {
        return email;
    }

    public String getFax() {
        return fax;
    }
}
