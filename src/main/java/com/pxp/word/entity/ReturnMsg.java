package com.pxp.word.entity;


//数据请求返回
public class ReturnMsg {

    public int status = MyStatus.OTHER;//0 成功   1失败
    public String msg = "";//描述信息
    public Object data = "";


    public static ReturnMsg ReturnMsgSuccess() {
        ReturnMsg returnMsg = new ReturnMsg();
        returnMsg.status = MyStatus.SUCCESS;
        returnMsg.msg = "成功";
        return returnMsg;

    }

    public static ReturnMsg ReturnMsgFail() {
        ReturnMsg returnMsg = new ReturnMsg();
        returnMsg.status = MyStatus.FAIL;
        returnMsg.msg = "失败";
        return returnMsg;

    }

    public static ReturnMsg ReturnMsgOther() {
        ReturnMsg returnMsg = new ReturnMsg();
        returnMsg.status = MyStatus.OTHER;
        returnMsg.msg = "其他异常";
        return returnMsg;
    }


}

class MyStatus {
    public static int SUCCESS = 0;
    public static int FAIL = 1;
    public static int OTHER = 2;
}


