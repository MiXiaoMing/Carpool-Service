package com.spirited.carpool.response;

import com.alibaba.fastjson.JSONObject;

public class ResponseJsonModel extends ResponseModel<JSONObject> {

    public ResponseJsonModel() {
        super();

        data = new JSONObject();
    }
}
