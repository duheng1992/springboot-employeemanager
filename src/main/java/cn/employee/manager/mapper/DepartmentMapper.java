package cn.employee.manager.mapper;

import cn.employee.manager.dto.DepartmentDTO;
import cn.employee.manager.entity.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zfitness
 */
@Mapper
@Repository
public interface DepartmentMapper extends BaseMapper<Department> {
    List<DepartmentDTO> selectAll();
}
