public class UserInfo {
    private String userId;
    private String userPassword;

    public UserInfo(){
        userId = "david97";
        userPassword = "David97";
    }
    public UserInfo(String userName, String password){
        userId = userName;
        userPassword = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
