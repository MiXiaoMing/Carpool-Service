package com.spirited.carpool.interfaces.user;

import com.spirited.carpool.entity.user.UserBase;
import com.spirited.carpool.response.ResponseModel;
import com.spirited.carpool.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    private final Logger logger = LoggerFactory.getLogger(UserController.class);


    /************ 个人信息 **************/

    /**
     * 获取所有个人信息
     *
     * @param userID
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseModel<UserBase> getUser(@RequestBody String userID) {
        ResponseModel<UserBase> responseModel = new ResponseModel<>();

        if (StringUtil.isEmpty(userID)) {
            responseModel.setMessage("用户ID用空");
            return responseModel;
        }

        return responseModel;
    }

}
