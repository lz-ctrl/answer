package com.answer.api.service.impl;

import com.answer.api.entity.Answer;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.mapper.CharacterAnalysisMapper;
import com.answer.api.service.AnswerService;
import com.answer.api.vo.AnswerVo;
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
    @Autowired
    private CharacterAnalysisMapper analysisMapper;

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
    public AnswerVo questionAnswering(int[] id, String[] answer) {
        /**
         * 获取到前端传过来的id和答案
         * 根据不同性格的id，分成5个数组
         * 根据存有不同性格
         */
        //初始用户分数
        //老虎性格的分数
        int tigerScore = 0;
        //孔雀性格的分数
        int peacockScore = 0;
        //考拉性格的分数
        int koalaScore = 0;
        //猫头鹰性格的分数
        int owlScore = 0;
        //变色龙性格的分数
        int chameleonScore = 0;
        //定义最大得分
        int maxScore = 0;
        //定义类型
        int type = 0;
        //最大分数的类型id
        int typeId = 0;

        //首先获取到用户的题目和选项
        //前端传过来用户的题号和答案

        for (int i : id) {
            //根据题目id查找题目的所有信息(id，问题，选项，分值，所属性格)
            Answer answer1 = answerMapper.selectByPrimaryKey(i);
            //获取对应的类型
            type = answer1.getTypeId();
            //循环用户的答案，获得选项
            for (String ua: answer) {
                switch (type){
                    case 1:
                        switch (ua){
                            case "A":
                                //获取到A选项的分数
                                Integer af = answer1.getAf();
                                //如果题目的类型是老虎型，且答案为A，加五分
                                tigerScore = tigerScore+af;
                            break;
                            case "B":
                                //获取到A选项的分数
                                Integer bf = answer1.getBf();
                                //如果题目的类型是老虎型，且答案为A，加四分
                                tigerScore = tigerScore+bf;
                                break;
                            case "C":
                                //获取到A选项的分数
                                Integer cf = answer1.getCf();
                                //如果题目的类型是老虎型，且答案为A，加三分
                                tigerScore = tigerScore+cf;
                                break;
                            case "D":
                                //获取到A选项的分数
                                Integer df = answer1.getDf();
                                //如果题目的类型是老虎型，且答案为A，加二分
                                tigerScore = tigerScore+df;
                                break;
                            default:
                                //获取到A选项的分数
                                Integer ef = answer1.getEf();
                                //如果题目的类型是老虎型，且答案为A，加一分
                                tigerScore = tigerScore+ef;
                        }
                    break;
                    case 2:
                        switch (ua){
                            case "A":
                                //获取到A选项的分数
                                Integer af = answer1.getAf();
                                //如果题目的类型是老虎型，且答案为A，加五分
                                peacockScore = peacockScore+af;
                                break;
                            case "B":
                                //获取到A选项的分数
                                Integer bf = answer1.getBf();
                                //如果题目的类型是老虎型，且答案为A，加四分
                                peacockScore = peacockScore+bf;
                                break;
                            case "C":
                                //获取到A选项的分数
                                Integer cf = answer1.getCf();
                                //如果题目的类型是老虎型，且答案为A，加三分
                                peacockScore = peacockScore+cf;
                                break;
                            case "D":
                                //获取到A选项的分数
                                Integer df = answer1.getDf();
                                //如果题目的类型是老虎型，且答案为A，加二分
                                peacockScore = peacockScore+df;
                                break;
                            default:
                                //获取到A选项的分数
                                Integer ef = answer1.getEf();
                                //如果题目的类型是老虎型，且答案为A，加一分
                                peacockScore = peacockScore+ef;
                        }
                        break;
                    case 3:
                        switch (ua){
                            case "A":
                                //获取到A选项的分数
                                Integer af = answer1.getAf();
                                //如果题目的类型是老虎型，且答案为A，加五分
                                koalaScore = koalaScore+af;
                                break;
                            case "B":
                                //获取到A选项的分数
                                Integer bf = answer1.getBf();
                                //如果题目的类型是老虎型，且答案为A，加四分
                                koalaScore = koalaScore+bf;
                                break;
                            case "C":
                                //获取到A选项的分数
                                Integer cf = answer1.getCf();
                                //如果题目的类型是老虎型，且答案为A，加三分
                                koalaScore = koalaScore+cf;
                                break;
                            case "D":
                                //获取到A选项的分数
                                Integer df = answer1.getDf();
                                //如果题目的类型是老虎型，且答案为A，加二分
                                koalaScore = koalaScore+df;
                                break;
                            default:
                                //获取到A选项的分数
                                Integer ef = answer1.getEf();
                                //如果题目的类型是老虎型，且答案为A，加一分
                                koalaScore = koalaScore+ef;
                        }
                        break;
                    case 4:
                        switch (ua){
                            case "A":
                                //获取到A选项的分数
                                Integer af = answer1.getAf();
                                //如果题目的类型是老虎型，且答案为A，加五分
                                owlScore = owlScore+af;
                                break;
                            case "B":
                                //获取到A选项的分数
                                Integer bf = answer1.getBf();
                                //如果题目的类型是老虎型，且答案为A，加四分
                                owlScore = owlScore+bf;
                                break;
                            case "C":
                                //获取到A选项的分数
                                Integer cf = answer1.getCf();
                                //如果题目的类型是老虎型，且答案为A，加三分
                                owlScore = owlScore+cf;
                                break;
                            case "D":
                                //获取到A选项的分数
                                Integer df = answer1.getDf();
                                //如果题目的类型是老虎型，且答案为A，加二分
                                owlScore = owlScore+df;
                                break;
                            default:
                                //获取到A选项的分数
                                Integer ef = answer1.getEf();
                                //如果题目的类型是老虎型，且答案为A，加一分
                                owlScore = owlScore+ef;
                        }
                        break;
                    case 5:
                        switch (ua){
                            case "A":
                                //获取到A选项的分数
                                Integer af = answer1.getAf();
                                //如果题目的类型是老虎型，且答案为A，加五分
                                chameleonScore = chameleonScore+af;
                                break;
                            case "B":
                                //获取到A选项的分数
                                Integer bf = answer1.getBf();
                                //如果题目的类型是老虎型，且答案为A，加四分
                                chameleonScore = chameleonScore+bf;
                                break;
                            case "C":
                                //获取到A选项的分数
                                Integer cf = answer1.getCf();
                                //如果题目的类型是老虎型，且答案为A，加三分
                                chameleonScore = chameleonScore+cf;
                                break;
                            case "D":
                                //获取到A选项的分数
                                Integer df = answer1.getDf();
                                //如果题目的类型是老虎型，且答案为A，加二分
                                chameleonScore = chameleonScore+df;
                                break;
                            default:
                                //获取到A选项的分数
                                Integer ef = answer1.getEf();
                                //如果题目的类型是老虎型，且答案为A，加一分
                                chameleonScore = chameleonScore+ef;
                        }
                        break;
                }
            }
            //一轮循环结束，跳出循环，否则会连续循环i次
            break;
        }
        //循环结束完后，对分数进行对比，获得最大的分数
        int [] fraction = {tigerScore,peacockScore,koalaScore,owlScore,chameleonScore,0};
        //冒泡排序获得最大分数
        for (int i = 0; i < fraction.length; i++) {
            for (int j = 0; j < fraction.length - 1 - i; j++) {
                if (fraction[j] > fraction[j + 1]) {
                    maxScore = fraction[j];
                    fraction[j] = fraction[j + 1];
                    fraction[j + 1] = maxScore;
                }
            }
        }
        //获取最大分数对应的性格
        if (maxScore == tigerScore){
            typeId = 1;
        }else if (maxScore == peacockScore){
            typeId = 2;
        }else if (maxScore == koalaScore){
            typeId = 3;
        }else if (maxScore == owlScore){
            typeId = 4;
        }else{
            typeId = 5;
        }

        System.out.println("类型："+type);
        System.out.println("最大分数："+maxScore);
        //返回。。。
        AnswerVo answerVo = new AnswerVo();
        //设置最高分
        answerVo.setMaxScore(maxScore);
        //设置最高分所属类型
        answerVo.setTypeId(typeId);
        System.out.println("最高分："+maxScore);
        System.out.println("最高分性格类型："+typeId);
        return new AnswerVo();
    }
}
