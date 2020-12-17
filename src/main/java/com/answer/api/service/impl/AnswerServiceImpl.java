package com.answer.api.service.impl;

import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.Option;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.mapper.CharacterAnalysisMapper;
import com.answer.api.service.AnswerService;
import com.answer.api.vo.CompleteVo;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


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
                        //计算
                        int af = answer1.getAf();
                        score=score+af;
                        break;
                    case "B":
                        int bf = answer1.getBf();
                        score=score+bf;
                        break;
                    case "C":
                        int cf = answer1.getCf();
                        score=score+cf;
                        break;
                    case "D":
                        int df = answer1.getDf();
                        score=score+df;
                        break;
                    default:
                        int ef = answer1.getEf();
                        score=score+ef;
                }
            }
            //一轮循环结束，跳出循环，否则会连续循环i次
            break;
        }
        //返回。。。
        return null;
    }

    @Override
    public List<Answer> findAll(Integer page,Integer size) {
        Page<Answer> pages=new Page<>(page, size);
        System.out.println(page+"--------"+size);
        List<Answer> list=answerMapper.selectPage(pages,new EntityWrapper<>());
        list.forEach(answer -> {
            Option option=new Option();
            option.setA(answer.getA());
            option.setB(answer.getB());
            option.setC(answer.getC());
            option.setD(answer.getD());
            option.setE(answer.getE());
            answer.setOption(option);
        });
        return list;
    }

    @Override
    public AnswerInformation complete(List<AnswerDto> list) {
        //这里表示总分数
        AtomicInteger score = new AtomicInteger();
        //老虎的分数
        AtomicInteger tigerScore = new AtomicInteger();
        //孔雀的分数
        AtomicInteger peacockScore = new AtomicInteger();
        //考拉的分数
        AtomicInteger koalaScore = new AtomicInteger();
        //猫头鹰的分数
        AtomicInteger owlScore = new AtomicInteger();
        //蜥蜴的分数
        AtomicInteger lizardScore = new AtomicInteger();
        //answer的id数组
        List<Integer> ids=new ArrayList<>();
        //查询出所选题目的数据
        list.forEach(answerDto -> {
            ids.add(answerDto.getId());
        });
        List<Answer> answerList=answerMapper.findByIds(ids);
        list.forEach(answerDto -> {
           String optionStr= answerDto.getOptionStr();
           Integer id=answerDto.getId();
           answerList.forEach(answer -> {
               if(id.equals(answer.getId())){
                   switch (optionStr){
                       case "A":
                          switch (answer.getType()){
                              case 1:
                                  tigerScore.addAndGet(answer.getAf());
                              break;
                              case 2:
                                  peacockScore.addAndGet(answer.getAf());
                              break;
                              case 3:
                                  koalaScore.addAndGet(answer.getAf());
                              break;
                              case 4:
                                  owlScore.addAndGet(answer.getAf());
                              break;
                              case 5:
                                  lizardScore.addAndGet(answer.getAf());
                              break;
                          }
                           score.addAndGet(answer.getAf());
                           break;
                       case "B":
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(answer.getBf());
                                   break;
                               case 2:
                                   peacockScore.addAndGet(answer.getBf());
                                   break;
                               case 3:
                                   koalaScore.addAndGet(answer.getBf());
                                   break;
                               case 4:
                                   owlScore.addAndGet(answer.getBf());
                                   break;
                               case 5:
                                   lizardScore.addAndGet(answer.getBf());
                                   break;
                           }
                           score.addAndGet(answer.getBf());
                           break;
                       case "C":
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(answer.getCf());
                                   break;
                               case 2:
                                   peacockScore.addAndGet(answer.getCf());
                                   break;
                               case 3:
                                   koalaScore.addAndGet(answer.getCf());
                                   break;
                               case 4:
                                   owlScore.addAndGet(answer.getCf());
                                   break;
                               case 5:
                                   lizardScore.addAndGet(answer.getCf());
                                   break;
                           }
                           score.addAndGet(answer.getCf());
                           break;
                       case "D":
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(answer.getDf());
                                   break;
                               case 2:
                                   peacockScore.addAndGet(answer.getDf());
                                   break;
                               case 3:
                                   koalaScore.addAndGet(answer.getDf());
                                   break;
                               case 4:
                                   owlScore.addAndGet(answer.getDf());
                                   break;
                               case 5:
                                   lizardScore.addAndGet(answer.getDf());
                                   break;
                           }
                           score.addAndGet(answer.getDf());
                           break;
                       default:
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(answer.getEf());
                                   break;
                               case 2:
                                   peacockScore.addAndGet(answer.getEf());
                                   break;
                               case 3:
                                   koalaScore.addAndGet(answer.getEf());
                                   break;
                               case 4:
                                   owlScore.addAndGet(answer.getEf());
                                   break;
                               case 5:
                                   lizardScore.addAndGet(answer.getEf());
                                   break;
                           }
                           score.addAndGet(answer.getEf());
                   }
               }
           });
        });
        System.out.println("最终得分>>>>>>>>>>>>>"+score);
        AnswerInformation answerInformation=new AnswerInformation();
        //TODO 方法最后插入用户记录表

        return answerInformation;
    }

    @Override
    public CompleteVo submit(Integer userId) {
        //查询出用户记录的分数
        //把各项分数求和 计算最大值
        List<AnswerInformation> list=new ArrayList<>();
        //这里表示总分数
        AtomicInteger score = new AtomicInteger();
        //老虎的分数
        AtomicInteger tigerScore = new AtomicInteger();
        //孔雀的分数
        AtomicInteger peacockScore = new AtomicInteger();
        //考拉的分数
        AtomicInteger koalaScore = new AtomicInteger();
        //猫头鹰的分数
        AtomicInteger owlScore = new AtomicInteger();
        //蜥蜴的分数
        AtomicInteger lizardScore = new AtomicInteger();
        list.forEach(answerInformation -> {
            score.addAndGet(answerInformation.getScore());
            tigerScore.addAndGet(answerInformation.getTigerScore());
            peacockScore.addAndGet(answerInformation.getPeacockScore());
            koalaScore.addAndGet(answerInformation.getKoalaScore());
            owlScore.addAndGet(answerInformation.getOwlScore());
            lizardScore.addAndGet(answerInformation.getLizardScore());
        });

        //这里开始比较最高分 表示用户属于哪种类型
        Integer []arr={tigerScore.get(),peacockScore.get(),koalaScore.get(),owlScore.get(),lizardScore.get()};
        //使用冒泡排序法将最大的得分放在第一个
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        CompleteVo completeVo=new CompleteVo();
        completeVo.setScore(score.get());
        //这里进行判断,得出最高分的类型
        if(tigerScore.get()==arr[0]){
            System.out.println("老虎"+tigerScore);
            //TODO 这里要查询出模板数据塞入Vo
            completeVo.setCharacterAnalysis(analysisMapper.selectByPrimaryKey(1));
        }
        if(peacockScore.get()==arr[0]){
            System.out.println("孔雀"+peacockScore);
            completeVo.setCharacterAnalysis(analysisMapper.selectByPrimaryKey(2));
        }
        if(koalaScore.get()==arr[0]){
            System.out.println("考拉"+koalaScore);
            completeVo.setCharacterAnalysis(analysisMapper.selectByPrimaryKey(3));
        }
        if(owlScore.get()==arr[0]){
            System.out.println("猫头鹰"+owlScore);
            completeVo.setCharacterAnalysis(analysisMapper.selectByPrimaryKey(4));
        }
        if(lizardScore.get()==arr[0]){
            System.out.println("变色龙"+lizardScore);
            completeVo.setCharacterAnalysis(analysisMapper.selectByPrimaryKey(5));
        }
        return completeVo;
    }
}
