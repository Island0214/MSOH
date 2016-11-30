package po;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author zqh
 *
 */
@Entity
@Table(name = "memberlevel",schema = "msoh_database")
public class MemberLevelPO implements Serializable{
	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "memberlevel_id_seq")
	@SequenceGenerator(name = "memberlevel_id_seq", sequenceName = "memberlevel_id_seq", allocationSize = 1)
	@Column(name = "memberlevelID")
	// 数据库中会员等级制度的序号，自动生成
	private int memberlevelID;
	// 制定人员姓名
	@Column(name = "framerName")
	private String framerName;
	// 制定日期
	@Column(name = "frameDate")
	private Timestamp frameDate;
	// 等级个数
	@Column(name = "numOfLevels")
	private int num;
	// 等级界限值,divided by ';'
	@Column(name = "creditBoundaries")
	private String creditBoundaries;
	
	public MemberLevelPO(){
	}
	
	public MemberLevelPO(String framerName, Timestamp frameDate, int num, String creditBoundaries){
		this.framerName=framerName;
		this.frameDate=frameDate;
		this.num=num;
		this.creditBoundaries=creditBoundaries;
	}

	public String getFramerName() {
		return framerName;
	}

	public void setFramerName(String framerName) {
		this.framerName = framerName;
	}

	public Timestamp getFrameDate() {
		return frameDate;
	}

	public void setFrameDate(Timestamp frameDate) {
		this.frameDate = frameDate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCreditBoundaries() {
		return creditBoundaries;
	}

	public void setCreditBoundaries(String  creditBoundaries) {
		this.creditBoundaries = creditBoundaries;
	}
	
	
}
