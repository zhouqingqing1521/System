package briup.controller;


import briup.bean.Student;
import briup.utils.Result;
import io.swagger.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

/**
 * @author zqq
 * @date 2022/10/26
 */
@Api(tags = "学生信息管理模块")//表示模块信息
@RestController
@RequestMapping("/student")
public class StudentController {
    //查询
    @ApiOperation(value = "跟据id查询学生信息")
    @ApiImplicitParams({
        @ApiImplicitParam(name="id",value = "学号")
    })
    @GetMapping("/{id}")
    public Result findById(@PathVariable int id){
      return Result.success(new Student(id,"tom"));
    }
    //添加
    @PostMapping
    public Result save(@RequestBody Student s){
        return Result.success();
    }
    //修改
    @PutMapping
    public Result update(@RequestBody Student s){
        return Result.success();
    }
    //删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id){
        System.out.println(id);
        return Result.success();
    }


}
