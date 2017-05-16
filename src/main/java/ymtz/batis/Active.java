package ymtz.batis;

public class Active {
	
	private String id;
	private String active_name;
	private String active_type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActive_name() {
		return active_name;
	}
	public void setActive_name(String active_name) {
		this.active_name = active_name;
	}
	public String getActive_type() {
		return active_type;
	}
	public void setActive_type(String active_type) {
		this.active_type = active_type;
	}
	@Override
	public String toString() {
		return "Active [id=" + id + ", active_name=" + active_name + ", active_type=" + active_type + "]";
	}
	
	

}
