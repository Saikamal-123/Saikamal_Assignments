package Assignment5;

public class News {
	int newsid;
	String postedbyuser;
	String commentbyuser;
	String comment;
	public News(int newsid, String postedbyuser, String commentbyuser, String comment) {
		super();
		this.newsid = newsid;
		this.postedbyuser = postedbyuser;
		this.commentbyuser = commentbyuser;
		this.comment = comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", postedbyuser=" + postedbyuser + ", commentbyuser=" + commentbyuser
				+ ", comment=" + comment + "]";
	}
	public String getPostedbyuser() {
		return postedbyuser;
	}
	public void setPostedbyuser(String postedbyuser) {
		this.postedbyuser = postedbyuser;
	}
	public String getCommentbyuser() {
		return commentbyuser;
	}
	public void setCommentbyuser(String commentbyuser) {
		this.commentbyuser = commentbyuser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		if (commentbyuser == null) {
			if (other.commentbyuser != null)
				return false;
		} else if (!commentbyuser.equals(other.commentbyuser))
			return false;
		return true;
	}

}
