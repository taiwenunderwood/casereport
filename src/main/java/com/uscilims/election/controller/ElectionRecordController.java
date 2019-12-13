package com.uscilims.election.controller;

import com.google.gson.Gson;
import com.uscilims.election.entity.ClinicalCase;
import com.uscilims.election.service.ClinicalCaseService;
import com.uscilims.vo.LayUiTableVo;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller()
@RequestMapping("/election")
public class ElectionRecordController {

    @Resource(name = "clinicalCaseServiceImpl")
    private ClinicalCaseService clinicalCaseService;

    @RequestMapping(value = "/recordInfo")
    public String recordInfo(){
        return "election/caserecord";
    }

    @RequestMapping(value = "/record/{act}")
    public String showRecord(HttpServletRequest request, @PathVariable String act){
        String url = "";
        if("add".equals(act)){
            url="election/addrecord";
        }else{
            url="election/updaterecord";
            request.setAttribute("sign",act);
        }
        return url;
    }

    @ResponseBody
    @RequestMapping(value = "caserecordlist")
    public LayUiTableVo caseRecordList(final Integer page,final Integer limit) throws Exception {
        List<ClinicalCase> clinicalCaseList = clinicalCaseService.selectByPage(page,limit);
        int recordNum = clinicalCaseService.selectCount();
        LayUiTableVo<ClinicalCase> clinicalCaseLayUiTableVo = new LayUiTableVo<ClinicalCase>();
        clinicalCaseLayUiTableVo.setCode(0);
        clinicalCaseLayUiTableVo.setCount(recordNum);
        clinicalCaseLayUiTableVo.setData(clinicalCaseList);
        clinicalCaseLayUiTableVo.setMsg("");
        return clinicalCaseLayUiTableVo;
    }

    //使用Json数据相应Ajax
    protected void sendJsonData(HttpServletResponse response, String data) throws Exception{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(data);
        out.flush();
        out.close();
    }

}
