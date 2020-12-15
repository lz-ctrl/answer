package com.answer.api.service.impl;

import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.Option;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.service.AnswerService;
import com.answer.api.utils.BeanMapper;
import com.answer.api.vo.CompleteVo;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
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

    @Override
    public List<Answer> findAll() {
        List<Answer> list=answerMapper.selectList(new EntityWrapper<>());
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
    public CompleteVo complete(List<AnswerDto> list) {
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
                                  tigerScore.addAndGet(Integer.parseInt(answer.getAf()));
                              break;
                              case 2:
                                  peacockScore.addAndGet(Integer.parseInt(answer.getAf()));
                              break;
                              case 3:
                                  koalaScore.addAndGet(Integer.parseInt(answer.getAf()));
                              break;
                              case 4:
                                  owlScore.addAndGet(Integer.parseInt(answer.getAf()));
                              break;
                              case 5:
                                  lizardScore.addAndGet(Integer.parseInt(answer.getAf()));
                              break;
                          }
                           score.addAndGet(Integer.parseInt(answer.getAf()));
                           break;
                       case "B":
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(Integer.parseInt(answer.getBf()));
                                   break;
                               case 2:
                                   peacockScore.addAndGet(Integer.parseInt(answer.getBf()));
                                   break;
                               case 3:
                                   koalaScore.addAndGet(Integer.parseInt(answer.getBf()));
                                   break;
                               case 4:
                                   owlScore.addAndGet(Integer.parseInt(answer.getBf()));
                                   break;
                               case 5:
                                   lizardScore.addAndGet(Integer.parseInt(answer.getBf()));
                                   break;
                           }
                           score.addAndGet(Integer.parseInt(answer.getBf()));
                           break;
                       case "C":
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(Integer.parseInt(answer.getCf()));
                                   break;
                               case 2:
                                   peacockScore.addAndGet(Integer.parseInt(answer.getCf()));
                                   break;
                               case 3:
                                   koalaScore.addAndGet(Integer.parseInt(answer.getCf()));
                                   break;
                               case 4:
                                   owlScore.addAndGet(Integer.parseInt(answer.getCf()));
                                   break;
                               case 5:
                                   lizardScore.addAndGet(Integer.parseInt(answer.getCf()));
                                   break;
                           }
                           score.addAndGet(Integer.parseInt(answer.getCf()));
                           break;
                       case "D":
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(Integer.parseInt(answer.getDf()));
                                   break;
                               case 2:
                                   peacockScore.addAndGet(Integer.parseInt(answer.getDf()));
                                   break;
                               case 3:
                                   koalaScore.addAndGet(Integer.parseInt(answer.getDf()));
                                   break;
                               case 4:
                                   owlScore.addAndGet(Integer.parseInt(answer.getDf()));
                                   break;
                               case 5:
                                   lizardScore.addAndGet(Integer.parseInt(answer.getDf()));
                                   break;
                           }
                           score.addAndGet(Integer.parseInt(answer.getDf()));
                           break;
                       default:
                           switch (answer.getType()){
                               case 1:
                                   tigerScore.addAndGet(Integer.parseInt(answer.getEf()));
                                   break;
                               case 2:
                                   peacockScore.addAndGet(Integer.parseInt(answer.getEf()));
                                   break;
                               case 3:
                                   koalaScore.addAndGet(Integer.parseInt(answer.getEf()));
                                   break;
                               case 4:
                                   owlScore.addAndGet(Integer.parseInt(answer.getEf()));
                                   break;
                               case 5:
                                   lizardScore.addAndGet(Integer.parseInt(answer.getEf()));
                                   break;
                           }
                           score.addAndGet(Integer.parseInt(answer.getEf()));
                   }
               }
           });
        });
        System.out.println("最终得分>>>>>>>>>>>>>"+score);
        CompleteVo completeVo=new CompleteVo();
        completeVo.setScore(score.get());
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
        //这里进行判断,得出最高分的类型
        if(tigerScore.get()==arr[0]){
            System.out.println("老虎"+tigerScore);
        }
        if(peacockScore.get()==arr[0]){
            System.out.println("孔雀"+peacockScore);
        }
        if(koalaScore.get()==arr[0]){
            System.out.println("考拉"+koalaScore);
        }
        if(owlScore.get()==arr[0]){
            System.out.println("猫头鹰"+owlScore);
        }
        if(lizardScore.get()==arr[0]){
            System.out.println("变色龙"+lizardScore);
        }
        return completeVo;
    }
}
