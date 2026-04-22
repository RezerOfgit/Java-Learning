package com.hspedu.gemini_;

/**
 * @author Re-zero
 * @version 1.0
 */
class Survey {
    public void reply(String question, Answer ans){
        if (ans == Answer.YES){
            System.out.println("问题：" + question + "用户同意了");
        }else if (ans == Answer.NO){
            System.out.println("问题：" + question + "用户拒绝了");
        }else {
            System.out.println("问题：" + question + "无效答案");
        }
    }
}
