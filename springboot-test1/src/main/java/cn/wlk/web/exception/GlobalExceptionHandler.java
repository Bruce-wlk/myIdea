package cn.wlk.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于捕获全局的异常
 */
@ControllerAdvice //配置切面
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class) //处理运行时异常
    @ResponseBody //返回json数据
    //异常处理方法
    public Map<String,Object> exceptionHandler(){
        Map<String,Object> map = new HashMap<>();
        map.put("errCode",101);
        map.put("errMsg","系统错误！");
        return map;
    }
}
