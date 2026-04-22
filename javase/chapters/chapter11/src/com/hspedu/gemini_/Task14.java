package com.hspedu.gemini_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task14 {
    public static void main(String[] args) {
        Survey survey = new Survey();
        survey.reply("你愿意加班吗？", Answer.NO);
        survey.reply("你会写java吗？", Answer.YES);
    }
}
