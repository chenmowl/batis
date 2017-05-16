package ymtz.batis;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface GoodsMapper {
	
//	@Select("select * from gs_goods where id = #{category_id}")
	List<Goods> selectActive(String category_id);

}
