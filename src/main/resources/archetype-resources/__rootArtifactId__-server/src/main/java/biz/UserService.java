package ${package}.biz;

import ${package}.api.vo.response.UserResponse;
import ${package}.dao.mapper.UserMapper;
import ${package}.dao.model.User;
import ${package}.dao.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author LvYong
 * @create 2018-03-06
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserResponse findById(Integer userId) {
        UserExample          example  = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userId);
        List<User> users = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        User         user         = users.get(0);
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getUserName());
        return userResponse;
    }
}
