package com.controller;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageHelper;
import com.pojo.DataTable;
import com.pojo.JSONParam;
import com.pojo.PageInfo;
import com.pojo.Student;
import com.pojo.Test;
import com.service.StudentService;


@Controller
@RequestMapping("stu")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("yemian")
	public  String getItemTypes2() {
	  String str = null;
	  System.out.println(str);
		return "stu/datatable";
	}
	
	@RequestMapping(value="/getallstu", produces = "application/json; charset=utf-8")
	public @ResponseBody  Object getItemTypes(HttpServletRequest request,
			HttpServletResponse response,DataTable datatable
			//sEcho 当前页
            //  iDisplayStart 起始位置
            //  iDisplayLength 每页size
			) {
		response.setCharacterEncoding("UTF-8");
        System.out.println(datatable);
        int pigesize= datatable.getiDisplayLength();
		int total=studentService.selectStutotal();//总数
		//总页数
		int totalPageNum = (total+pigesize-1) /pigesize; 
        //当前页
		int nowpage=datatable.getNowpage();
		
		int start=1+(pigesize*(nowpage-1));
		int end=pigesize*nowpage;
		PageInfo pageInfo=new PageInfo();
		pageInfo.setEnd(end);
		pageInfo.setStart(start);
		pageInfo.setTotal(total);
		
		List<Student> list=studentService.selectStudentAll(pageInfo);
		 ///////////////////////////////////////////////////
	      String[] data=new String[list.size()];
	      for(int i=0;i<list.size();i++){
	    	  Student stu=list.get(i);
	    	  Map map=new HashMap<String, Object>();
	    	  map.put("id", stu.getId());
	    	  map.put("location", stu.getLocation());
	    	  map.put("sex", stu.getSex());
	    	  map.put("name", stu.getName());
	    	  data[i]=JSON.toJSONString(map);
	      }
	   String s="{"+"\""+"data"+"\""+":"+Arrays.toString(data)+"}"; 
	      System.out.println(s);
        datatable.setsEcho(datatable.getsEcho());
        datatable.setDraw(datatable.getDraw());  
        datatable.setData(list);    
        datatable.setRecordsTotal(total);    
        datatable.setRecordsFiltered(total); 
	    //  String[] data2=new String[];   
       System.out.println(JSON.toJSONString(datatable));
		 return JSON.toJSONString(datatable);
	}

}












