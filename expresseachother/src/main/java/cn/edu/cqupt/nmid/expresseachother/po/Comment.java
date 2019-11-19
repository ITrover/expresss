package cn.edu.cqupt.nmid.expresseachother.po;
;


;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Comment {


    private Long id;

    private User user;

    private String content;

    private Date createTime;

    private List<Comment> replyComments = new ArrayList<>();

    private Comment parentComment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Comment> getReplyComments() {
        return replyComments;
    }

    public void setReplyComments(List<Comment> replyComments) {
        this.replyComments = replyComments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user=" + user +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", replyComments=" + replyComments +
                ", parentComment=" + parentComment +
                '}';
    }
}
