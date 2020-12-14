package com.answer.api.service.impl;

import com.answer.api.entity.Answer;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;


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
         * 获取到前端传过来的id和答案
         * 根据不同性格的id，分成5个数组
         * 根据存有不同性格
         */
        //初始用户分数
        //老虎
        int tigerScore = 0;
        //孔雀
        int peacockScore = 0;
        //考拉
        int koalaScore = 0;
        //猫头鹰
        int owlScore = 0;
        //变色龙
        int chameleonScore = 0;

        //首先获取到用户的题目和选项
        //前端传过来用户的题号和答案

        for (int i: id) {
            //根据题目id查找题目的所有信息(id，问题，选项，分值，所属性格)
            Answer answer1 = answerMapper.selectByPrimaryKey(i);
            //获取对应的类型
            int type = answer1.getTypeId();
            //循环用户的答案，获得选项
            for (String ua: answer) {
                //用switch判断符合条件的项
                switch (ua){
                    case "A":
                        //转为int计算
                        int af = Integer.parseInt(answer1.getAf());
                        switch (type){
                            case 1:
                                //如果题目的类型的1，则是老虎型的性格，老虎型的性格分数+5
                                tigerScore=af+tigerScore;
                                break;
                            case 2:
                                //如果题目的类型的2，则是孔雀型的性格，孔雀型的性格分数+5
                                peacockScore=af+peacockScore;
                                break;
                            case 3:
                                //如果题目的类型的2，则是考拉型的性格，考拉型的性格分数+5
                                koalaScore=af+koalaScore;
                                break;
                            case 4:
                                //如果题目的类型的2，则是猫头鹰型的性格，猫头鹰型的性格分数+5
                                owlScore=af+owlScore;
                                break;
                            default:
                                //如果题目的类型的2，则是变色龙型的性格，变色龙型的性格分数+5
                                chameleonScore=af+chameleonScore;
                                break;
                        }
                        break;
                    case "B":
                        int bf = Integer.parseInt(answer1.getBf());
                        switch (type){
                            case 1:
                                //如果题目的类型的1，则是老虎型的性格，老虎型的性格分数+5
                                tigerScore=bf+tigerScore;
                                break;
                            case 2:
                                //如果题目的类型的2，则是孔雀型的性格，孔雀型的性格分数+5
                                peacockScore=bf+peacockScore;
                                break;
                            case 3:
                                //如果题目的类型的2，则是考拉型的性格，考拉型的性格分数+5
                                koalaScore=bf+koalaScore;
                                break;
                            case 4:
                                //如果题目的类型的2，则是猫头鹰型的性格，猫头鹰型的性格分数+5
                                owlScore=bf+owlScore;
                                break;
                            default:
                                //如果题目的类型的2，则是变色龙型的性格，变色龙型的性格分数+5
                                chameleonScore=bf+chameleonScore;
                                break;
                        }
                        break;
                    case "C":
                        int cf = Integer.parseInt(answer1.getCf());
                        switch (type){
                            case 1:
                                //如果题目的类型的1，则是老虎型的性格，老虎型的性格分数+5
                                tigerScore=cf+tigerScore;
                                break;
                            case 2:
                                //如果题目的类型的2，则是孔雀型的性格，孔雀型的性格分数+5
                                peacockScore=cf+peacockScore;
                                break;
                            case 3:
                                //如果题目的类型的2，则是考拉型的性格，考拉型的性格分数+5
                                koalaScore=cf+koalaScore;
                                break;
                            case 4:
                                //如果题目的类型的2，则是猫头鹰型的性格，猫头鹰型的性格分数+5
                                owlScore=cf+owlScore;
                                break;
                            default:
                                //如果题目的类型的2，则是变色龙型的性格，变色龙型的性格分数+5
                                chameleonScore=cf+chameleonScore;
                                break;
                        }
                        break;
                    case "D":
                        int df = Integer.parseInt(answer1.getDf());
                        switch (type){
                            case 1:
                                //如果题目的类型的1，则是老虎型的性格，老虎型的性格分数+5
                                tigerScore=df+tigerScore;
                                break;
                            case 2:
                                //如果题目的类型的2，则是孔雀型的性格，孔雀型的性格分数+5
                                peacockScore=df+peacockScore;
                                break;
                            case 3:
                                //如果题目的类型的2，则是考拉型的性格，考拉型的性格分数+5
                                koalaScore=df+koalaScore;
                                break;
                            case 4:
                                //如果题目的类型的2，则是猫头鹰型的性格，猫头鹰型的性格分数+5
                                owlScore=df+owlScore;
                                break;
                            default:
                                //如果题目的类型的2，则是变色龙型的性格，变色龙型的性格分数+5
                                chameleonScore=df+chameleonScore;
                                break;
                        }
                        break;
                    default:
                        int ef = Integer.parseInt(answer1.getEf());
                        switch (type){
                            case 1:
                                //如果题目的类型的1，则是老虎型的性格，老虎型的性格分数+5
                                tigerScore=ef+tigerScore;
                                break;
                            case 2:
                                //如果题目的类型的2，则是孔雀型的性格，孔雀型的性格分数+5
                                peacockScore=ef+peacockScore;
                                break;
                            case 3:
                                //如果题目的类型的2，则是考拉型的性格，考拉型的性格分数+5
                                koalaScore=ef+koalaScore;
                                break;
                            case 4:
                                //如果题目的类型的2，则是猫头鹰型的性格，猫头鹰型的性格分数+5
                                owlScore=ef+owlScore;
                                break;
                            default:
                                //如果题目的类型的2，则是变色龙型的性格，变色龙型的性格分数+5
                                chameleonScore=ef+chameleonScore;
                                break;
                        }
                }
            }
            //一轮循环结束，跳出循环，否则会连续循环i次
            break;
        }
        //返回。。。
        return null;
    }
}
