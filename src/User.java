public class User {
    private String userName;
    private String mailId;
    public User(){}

    public User(String userName, String mailId)
    {

        this.userName = userName;
        this.mailId = mailId;
    }

    public String getUserName() {
        return userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setUserName(String userName)
    {

        this.userName = userName;
    }

    public void setMailId(String mailId)
    {

        this.mailId = mailId;
    }
    @Override
    public String toString()
    {
        return "User{"+"username="+userName+"}";

    }
}
