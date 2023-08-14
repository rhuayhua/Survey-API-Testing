package models;


public class Survey {
	
	private transient String _id;
	private String title;
	private String type;
	private String status;
	private String startDate;
	private String endDate;
	private transient int __v;
	
	public Survey() {
		
	}
	
	public Survey(String id, String title, String type, String status, String sDate, String eDate, int v ) {
		super();
		this._id = id;
		this.title = title;
		this.type = type;
		this.status = status;
		this.startDate = sDate;
		this.endDate = eDate;
		this.__v = v;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int get__v() {
		return __v;
	}

	public void set__v(int __v) {
		this.__v = __v;
	}

	@Override
	public String toString() {
		return "Survey [_id=" + _id + ", title=" + title + ", type=" + type + ", status=" + status + ", startDate="
				+ startDate + ", endDate=" + endDate + ", __v=" + __v + "]";
	}
	
	
	

}
