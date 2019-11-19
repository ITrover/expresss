package cn.edu.cqupt.nmid.expresseachother.po;




import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class User {

    private String id;

    private List<Comment> comment;

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    private String qqnumber; /*qq号*/

    private String username; /*用户名*/

    private String password; /*密码*/

    private String nickname; /*名称*/

    private String photo;    /*头像url相对位置*/


    private String phonenumber; /*电话号码*/


    private Info info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Package> getPackages_publish() {
        return packages_publish;
    }

    public void setPackages_publish(List<Package> packages_publish) {
        this.packages_publish = packages_publish;
    }

    public List<Package> getPackages_receive() {
        return packages_receive;
    }

    public void setPackages_receive(List<Package> packages_receive) {
        this.packages_receive = packages_receive;
    }

    private List<Package> packages_publish = new ArrayList<>();

    private List<Package> packages_receive = new ArrayList<>();

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", photo='" + photo + '\'' +
                ", qqnumber='" + qqnumber + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", info=" + info +
                ", packages_publish=" + packages_publish +
                ", packages_receive=" + packages_receive +
                '}';
    }
}
