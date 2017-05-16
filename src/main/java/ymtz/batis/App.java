package ymtz.batis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String resource = "mybatis-conf.xml";
		InputStream inputStream = null;
		SqlSession session = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			ActiveMapper activeMapper = session.getMapper(ActiveMapper.class);
			GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
			Active active = activeMapper.selectActive("100015");
			List<Goods> selectActive = goodsMapper.selectActive("1010");
			System.out.println(active.toString()+"-----------------------------------"+selectActive.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
