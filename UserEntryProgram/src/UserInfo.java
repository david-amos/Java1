public class UserInfo {
    private String userId;
    private String userPassword;
    private int userStatus;
    private char userProgram;

    public UserInfo(){
        userId = "david97";
        userPassword = "David97";
        userStatus = 1;
        userProgram = 'B';
    }

    public UserInfo(String userName, String password,int status, char prog){
        userId = userName;
        userPassword = password;
        userStatus = status;
        userProgram = prog;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserStatus(int userStatus) {this.userStatus = userStatus;}

    public void setUserProgram(char userProgram) {this.userProgram = userProgram;}

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public int getUserStatus() { return userStatus;}

    public char getUserProgram() { return userProgram;}
}
