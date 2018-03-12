package ${package}.web.controller;

import ${package}.api.commons.web.ReturnResult;
import ${package}.api.facade.UserFacade;
import ${package}.api.vo.response.UserResponse;
import ${package}.biz.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LvYong
 * @create 2018-03-06
 **/
@Slf4j
@RestController
public class UserController implements UserFacade {

    @Autowired
    private UserService userService;

    @Override
    public ReturnResult<UserResponse> findById(@PathVariable Integer userId) {
        log.info("userId:{}", userId);
        UserResponse userResponse = userService.findById(userId);
        return ReturnResult.success(userResponse);
    }
}
