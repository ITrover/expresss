package cn.edu.cqupt.nmid.expresseachother.po;






public class Info {


    private Integer id;

    private Integer totalissue;  //一共发布。

    private Integer totalreceive; //一共接手的。

    private Integer code;  //获得的评分。

    private Integer successpost;   //帮助别人的成功次数。

    private Integer successgive;    //发布后收到的成功次数。


    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Info{" +
                "totalissue=" + totalissue +
                ", totalreceive=" + totalreceive +
                ", code=" + code +
                ", successpost=" + successpost +
                ", successgive=" + successgive +
                ", user=" + user +
                '}';
    }

    public Integer getTotalissue() {
        return totalissue;
    }

    public void setTotalissue(Integer totalissue) {
        this.totalissue = totalissue;
    }

    public Integer getTotalreceive() {
        return totalreceive;
    }

    public void setTotalreceive(Integer totalreceive) {
        this.totalreceive = totalreceive;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getSuccesspost() {
        return successpost;
    }

    public void setSuccesspost(Integer successpost) {
        this.successpost = successpost;
    }

    public Integer getSuccessgive() {
        return successgive;
    }

    public void setSuccessgive(Integer successgive) {
        this.successgive = successgive;
    }
}
