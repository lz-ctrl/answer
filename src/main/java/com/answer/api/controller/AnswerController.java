package com.answer.api.controller;

import com.answer.api.codec.LayuiRespResult;
import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.dto.AnswerAllDto;
import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
import com.answer.api.exception.ServiceException;
import com.answer.api.service.AnswerService;
import com.answer.api.service.TitleService;
import com.answer.api.utils.BeanMapper;
import com.answer.api.vo.AnswerVo;
import com.answer.api.vo.CompleteVo;
import com.answer.api.vo.PageAnswerVo;
import com.answer.api.vo.TitleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "答题接口")
@RestController
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "question",method = RequestMethod.GET)
    public String question(@RequestParam(value = "id",defaultValue = "2") int[] id , @RequestParam(value = "answer",defaultValue = "A") String[] answer){
        //返回调用答题方法
        Answer answering = answerService.questionAnswering(id, answer);
        System.out.println(answering);
        return null;
    }

    @ApiOperation(value = "根据titleId查询所有题目", notes = "根据titleId查询所有题目")
    @GetMapping("list")
    public RestApiResult<List<AnswerVo>> list(@RequestParam(value = "page",defaultValue = "0")Integer page,
                                              @RequestParam(value = "size",defaultValue = "30")Integer size,
                                              @RequestParam(value = "title_id")Integer titleId){
        return new RestApiResult<>(RestCode.SUCCESS, BeanMapper.mapList(answerService.findAll(page,size,titleId),AnswerVo.class));
    }


    @ApiOperation(value = "完成题目结算(传对象数组)", notes = "10道题目答完提交")
    @PostMapping("complete")
    public RestApiResult<AnswerInformation> complete(@RequestBody()AnswerAllDto answerAllDto){
        Integer titleId=answerAllDto.getTitleId();
        Integer userId=answerAllDto.getUserId();
        List<AnswerDto> list=answerAllDto.getList();
        if(list.size()<=0){
            throw new ServiceException(RestCode.BAD_REQUEST_408);
        }
        return new RestApiResult<>(RestCode.SUCCESS, answerService.complete(list,titleId,userId));
    }


    @ApiOperation(value = "所以题目提交", notes = "所以题目提交")
    @GetMapping("submit/{id}")
    public RestApiResult submit(@PathVariable Integer id){
        if(id==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403,"用户id不能为空");
        }
        return new RestApiResult<>(RestCode.SUCCESS, answerService.submit(id));
    }

    @ApiOperation(value = "新增题目",notes = "新增题目")
    @PostMapping()
    public RestApiResult insert(@RequestBody @Validated AnswerDto answerDto){
        return new RestApiResult(RestCode.SUCCESS,answerService.create(answerDto));
    }

    @ApiOperation(value = "删除题目",notes = "删除题目")
    @DeleteMapping("{id}")
    public RestApiResult delete(@PathVariable Integer id){
        answerService.delete(id);
        return new RestApiResult<>(RestCode.SUCCESS);
    }

    @ApiOperation(value = "修改题目",notes = "修改题目")
    @PutMapping()
    public RestApiResult update(@RequestBody @Validated AnswerDto answerDto){
        return new RestApiResult(RestCode.SUCCESS,answerService.update(answerDto));
    }

    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("page")
    public LayuiRespResult page(@RequestParam(value = "page",defaultValue = "0")Integer page,
                                @RequestParam(value = "limit",defaultValue = "10")Integer size){
        return answerService.page(page,size);
    }

    @ApiOperation(value = "根据id查询", notes = "根据id查询")
    @GetMapping("{id}")
    public RestApiResult get(@PathVariable Integer id){
        return new RestApiResult(RestCode.SUCCESS,answerService.get(id));
    }


    @ApiOperation(value = "所有副标题",notes = "所有副标题")
    @PostMapping("character")
    public RestApiResult findAllCharacterVo(){
        return new RestApiResult(RestCode.SUCCESS,answerService.findAllCharacterAnalysis());
    }

    @ApiOperation(value = "根据题目类型分页查询", notes = "根据题目类型分页查询")
    @GetMapping("type")
    public LayuiRespResult findAnswerType(@RequestParam(value = "page",defaultValue = "0")Integer page,
                                          @RequestParam(value = "limit",defaultValue = "10")Integer size,
                                          @RequestParam(value = "answer_type")Integer answerType){
        return answerService.findAnswerType(answerType,page,size);
    }
}