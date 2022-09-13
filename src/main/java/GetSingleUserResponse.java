public class GetSingleUserResponse {
    UserData userData;
    Support support;

    public UserData getUserData() {
        return userData;
    }

    public void setData(UserData data) {
        this.userData = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}
