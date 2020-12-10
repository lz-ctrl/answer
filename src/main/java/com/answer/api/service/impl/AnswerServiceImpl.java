package com.answer.api.service.impl;

import com.answer.api.entity.Answer;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yjj
 */
@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    private AnswerMapper answerMapper;
    @Autowired
    private AnswerInformationMapper answerInformationMapper;

    /**
     *实现用户答题
     * 一共三十道题，根据用户的选择，得到分数，A选项5分，B选项4分，C选项3分，D选项2分，E选项1分
     * 通过循环，根据题号id获取到所有数据库结果
     * 循环判断，匹配获取到的用户的结果对应的分数
     * 如果是A，则获取AF对应的分数
     * 不同的选项加不同的分，最后得出总分数
     * @return
     */
    @Override
    public Answer questionAnswering(int[] id, String[] answer) {
        /**
         * 首先获取到前端传过来的id和答案
         * 根据不同性格的id，分成5个数组
         * 根据存有不同性格
         */
        //初始用户分数
        int score = 0;
        //首先获取到用户的题目和选项
        //前端传过来用户的题号和答案
        for (int i: id) {
            //根据题目id查找题目的所有信息(id，问题，选项，分值)
            Answer answer1 = answerMapper.selectByPrimaryKey(i);
            //循环用户的答案，获得选项
            for (String ua: answer) {
                //用switch判断符合条件的项
                switch (ua){
                    case "A":
                        //转为int计算
                        int af = Integer.parseInt(answer1.getAf());
                        score=score+af;
                        break;
                    case "B":
                        int bf = Integer.parseInt(answer1.getBf());
                        score=score+bf;
                        break;
                    case "C":
                        int cf = Integer.parseInt(answer1.getCf());
                        score=score+cf;
                        break;
                    case "D":
                        int df = Integer.parseInt(answer1.getDf());
                        score=score+df;
                        break;
                    default:
                        int ef = Integer.parseInt(answer1.getEf());
                        score=score+ef;
                }
            }
            //一轮循环结束，跳出循环，否则会连续循环i次
            break;
        }
        //返回。。。
        return null;
    }
}
