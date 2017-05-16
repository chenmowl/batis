package ymtz.batis;

import org.apache.ibatis.annotations.Select;

public interface ActiveMapper {
	
	@Select("select * from cp_active where id = #{id}")
	Active selectActive(String id);

}
