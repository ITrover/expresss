package cn.edu.cqupt.nmid.expresseachother.po;

import javax.persistence.*;
import java.util.Date;


public class Package {


    private Integer id;

    private String description;  //对快递的简单描述


    private User user_publish;/*发布的人*/


    private User user_receive;/*接手的人*/

    private String from;/*从哪里取*/

    private String to;/*送到哪里去*/

    private Integer reward;/*酬劳*/


    private Date createTime;/*发布的时间*/


    private Date finishTime;

    private Integer status;

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user_publish=" + user_publish +
                ", user_receive=" + user_receive +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", reward=" + reward +
                ", createTime=" + createTime +
                ", finishTime=" + finishTime +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser_publish() {
        return user_publish;
    }

    public void setUser_publish(User user_publish) {
        this.user_publish = user_publish;
    }

    public User getUser_receive() {
        return user_receive;
    }

    public void setUser_receive(User user_receive) {
        this.user_receive = user_receive;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
