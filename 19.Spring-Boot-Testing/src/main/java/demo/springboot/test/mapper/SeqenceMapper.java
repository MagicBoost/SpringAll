package demo.springboot.test.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SeqenceMapper {
	@Select("select ${seqName} from t_user order by ${seqName} desc limit 1")
	Long getSequence(@Param("seqName") String seqName);
}
