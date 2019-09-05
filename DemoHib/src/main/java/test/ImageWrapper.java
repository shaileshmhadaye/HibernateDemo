package test;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class ImageWrapper implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String imageName;
	@Column(name = "data", unique = false, nullable = false, length = 100000)
	private byte[] data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ImageWrapper [id=" + id + ", imageName=" + imageName + ", data=" + Arrays.toString(data) + "]";
	}
	
	

}
